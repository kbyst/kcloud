package com.github.kbyst.kcloudeurekaclient.controller;

import com.github.kbyst.kcloudeurekaclient.remote.KCloudRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KCloudClientController {

    @Autowired
    KCloudRemote kCloudRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return kCloudRemote.index(name);
    }
}
