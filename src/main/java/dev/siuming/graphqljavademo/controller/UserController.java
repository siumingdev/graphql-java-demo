package dev.siuming.graphqljavademo.controller;

import dev.siuming.graphqljavademo.entity.User;
import dev.siuming.graphqljavademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public @ResponseBody List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
