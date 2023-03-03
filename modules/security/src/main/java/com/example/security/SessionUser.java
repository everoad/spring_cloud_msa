package com.example.security;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SessionUser {
    private String id;
    private String name;
}
