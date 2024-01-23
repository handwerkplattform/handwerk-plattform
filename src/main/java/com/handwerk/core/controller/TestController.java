package com.handwerk.core.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Api(tags="Accounts API")
@RequestMapping("/rest/api")
public interface TestController {

    @GetMapping(value = "/test")
    public String getAccounts();
}
