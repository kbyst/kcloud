package com.github.kbyst.kcloudregistryconsul.service;

import com.github.kbyst.kcloudregistryconsul.domain.TagData;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ngdata-tag-service",url="http://localhost:8080/")
public interface RestAPI {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();

    @RequestMapping(value="/selectByTagId", method= RequestMethod.GET)
    PageInfo<TagData> selectByTagId(@RequestParam("pageNum") Integer pageNum,
                                    @RequestParam("pageSize") Integer pageSize,
                                    @RequestParam("tagId") String tagId);


}
