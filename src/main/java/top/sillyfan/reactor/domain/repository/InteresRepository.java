package top.sillyfan.reactor.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import top.sillyfan.reactor.domain.model.Interes;

@Repository
public interface InteresRepository extends MongoRepository<Interes, String> {
}
