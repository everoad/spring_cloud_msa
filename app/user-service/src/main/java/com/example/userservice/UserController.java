package com.example.userservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public String status() {
        return "Hello World!";
    }

//    @GetMapping("/{user_id}")
//    public SessionUser getMember(@CurrentUser SessionUser sessionUser, @PathVariable("user_id") String userId) {
//        sessionUser.setId(userId);
//        return sessionUser;
//    }
}
