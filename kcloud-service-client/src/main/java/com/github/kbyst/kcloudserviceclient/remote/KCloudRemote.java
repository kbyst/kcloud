package com.github.kbyst.kcloudserviceclient.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "kcloud-service-server")
public interface KCloudRemote {

    @RequestMapping(value = "/index")
    public String index(@RequestParam(value = "name") String name);
}
