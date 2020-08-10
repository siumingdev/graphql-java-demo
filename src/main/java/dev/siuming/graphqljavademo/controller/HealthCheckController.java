package dev.siuming.graphqljavademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheckController {
    @GetMapping("/healthCheck")
    public @ResponseBody String healthCheck() {
        return "Hello World!";
    }
}
