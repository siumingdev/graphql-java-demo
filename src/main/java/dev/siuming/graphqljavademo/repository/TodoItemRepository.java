package dev.siuming.graphqljavademo.repository;

import dev.siuming.graphqljavademo.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
