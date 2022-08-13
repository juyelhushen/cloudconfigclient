package com.example.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class TestController {

    @Value("${name.app}")
    private String name;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getName()
    {
        return name;
    }
}
