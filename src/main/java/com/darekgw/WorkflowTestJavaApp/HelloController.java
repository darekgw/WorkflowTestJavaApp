package com.darekgw.WorkflowTestJavaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/login")
    public String logIn(@RequestParam String password) {
        return helloService.verifyUser(password);
    }
}
