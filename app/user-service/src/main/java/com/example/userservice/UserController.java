package com.example.userservice;

import com.example.core.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public String status() {
        return "Hello World!";
    }

    @GetMapping("/{user_id}")
    public Member getMember(@PathVariable("user_id") String userId) {
        Member member = new Member();
        member.setId(userId);
        return member;
    }
}
