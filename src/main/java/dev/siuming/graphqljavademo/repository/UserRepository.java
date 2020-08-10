package dev.siuming.graphqljavademo.repository;

import dev.siuming.graphqljavademo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
