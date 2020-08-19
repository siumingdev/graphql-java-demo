package dev.siuming.graphqljavademo.repository;

import dev.siuming.graphqljavademo.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
    Optional<TodoItem> findOneById(Long Id);
    List<TodoItem> findAllByUserId(Long UserId);
}
