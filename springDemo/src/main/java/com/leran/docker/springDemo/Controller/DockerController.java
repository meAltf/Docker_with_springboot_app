package com.leran.docker.springDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {


    @GetMapping("/")
    public String greet() {
        return "Hello from Docker!";
    }
}
