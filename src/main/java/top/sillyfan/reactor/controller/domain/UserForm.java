package top.sillyfan.reactor.controller.domain;

import top.sillyfan.reactor.domain.model.Interes;
import top.sillyfan.reactor.domain.model.User;

import java.util.Objects;

public class UserForm {

    private String name;

    private Integer age;

    private String intere;

    private String music;

    private String movie;

    public User mapUser(User user) {
        if (Objects.isNull(user)) {
            user = new User();
        }
        user.setName(name);
        user.setAge(age);

        return user;
    }

    public Interes mapInteres(String id, Interes interes) {
        if (Objects.isNull(interes)) {
            interes = new Interes();
        }
        interes.setId(id);
        interes.setIntere(intere);
        interes.setMovie(movie);
        interes.setMusic(music);

        return interes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIntere() {
        return intere;
    }

    public void setIntere(String intere) {
        this.intere = intere;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
