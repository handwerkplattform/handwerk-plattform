package com.handwerk.core.controller.impl;

import com.handwerk.core.controller.TestController;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestControllerImpl implements TestController {

    @Override
    public Mono<Object> getAccounts() {
        System.out.println("Test controller OK");
        return null;
    }
}
