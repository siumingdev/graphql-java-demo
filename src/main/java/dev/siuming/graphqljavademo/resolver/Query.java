package dev.siuming.graphqljavademo.resolver;

import dev.siuming.graphqljavademo.entity.TodoItem;
import dev.siuming.graphqljavademo.entity.User;
import dev.siuming.graphqljavademo.repository.TodoItemRepository;
import dev.siuming.graphqljavademo.repository.UserRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TodoItemRepository todoItemRepository;

    public List<User> allUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User userById(Long id) {
        return userRepository.findOneById(id).orElse(null);
    }

    public TodoItem todoItemById(Long id) {
        return todoItemRepository.findOneById(id).orElse(null);
    }
}
