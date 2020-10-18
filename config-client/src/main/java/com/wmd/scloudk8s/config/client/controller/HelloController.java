package com.wmd.scloudk8s.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RefreshScope
public class HelloController {

    @Value("${name}")
    private String name;

    @GetMapping("/name")
     public String getName() {
        return name;
    }
}
