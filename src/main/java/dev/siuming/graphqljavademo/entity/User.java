package dev.siuming.graphqljavademo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;


@Table("user")
@Data
public class User {
    private @Id Long id;
    private String username;
    private String password;
    private String email;

    @MappedCollection(idColumn = "user_id")
    private Set<TodoItem> todoItems;

//    public void addTodoItem(String content, LocalDateTime dueDt, LocalDateTime createDt) {
//        if (todoItems == null) {
//            todoItems = new HashSet<>();
//        }
//        todoItems.add(new TodoItem(content, dueDt, createDt));
//    }
}
