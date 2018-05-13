package top.sillyfan.reactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import top.sillyfan.reactor.controller.domain.UserForm;
import top.sillyfan.reactor.domain.model.Interes;
import top.sillyfan.reactor.domain.model.User;
import top.sillyfan.reactor.domain.repository.InteresRepository;
import top.sillyfan.reactor.domain.repository.UserRepository;
import top.sillyfan.reactor.util.IdUtil;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    InteresRepository interesRepository;

    @PostMapping("")
    public User create(@RequestBody UserForm form) {

        String id = IdUtil.generate();

        User user = form.mapUser(null);
        user.setId(id);
        userRepository.insert(user);

        Interes interes = form.mapInteres(user.getId(), null);

        interesRepository.insert(interes);

        return user;
    }

    @GetMapping("")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<User> getAll(Principal principal) {


        return userRepository
                .findAll()
                .stream()
                .peek(user -> interesRepository.findById(user.getId()).ifPresent(user::setInteres))
                .collect(Collectors.toList());


//        Flux.fromIterable(users).subscribe(user -> {
//
//            // 进行一系列的操作
//            interesRepository.findById(user.getId()).ifPresent(user::setInteres);
//
//        });
//
//        return users;
    }

}
