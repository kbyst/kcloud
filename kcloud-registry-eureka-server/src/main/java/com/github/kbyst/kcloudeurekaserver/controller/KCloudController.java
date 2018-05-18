package com.github.kbyst.kcloudeurekaserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KCloudController {
    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/index")
    public String index(@RequestParam String name) {
        logger.info("request one  name is "+name);
        return "hello "+name+"，this is first messge";
    }

}