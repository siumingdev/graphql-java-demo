package dev.siuming.graphqljavademo.resolver;

import dev.siuming.graphqljavademo.entity.TodoItem;
import dev.siuming.graphqljavademo.entity.User;
import dev.siuming.graphqljavademo.repository.TodoItemRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResolver implements GraphQLResolver<User> {
    @Autowired
    private TodoItemRepository todoItemRepository;

    public List<TodoItem> todoItems(User user) {
        return todoItemRepository.findAllByUserId(user.getId());
    }
}
