package dev.siuming.graphqljavademo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;


@Table("todo_item")
@Data
@AllArgsConstructor
public class TodoItem {
    private @Id Long id;
    private Long userId;
    private String content;
    private LocalDateTime dueDt;
    private LocalDateTime createDt;
}
