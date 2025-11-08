package com.darekgw.WorkflowTestJavaApp;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final String USER_PASSWORD = "AlaMaKota";

    String verifyUser(String password) {
        if(USER_PASSWORD.equals(password)) {
            return "You were logged in successfully.";
        }
        return "Your password is incorrect.";
    }

}
