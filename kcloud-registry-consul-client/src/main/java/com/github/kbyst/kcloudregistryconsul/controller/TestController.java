package com.github.kbyst.kcloudregistryconsul.controller;


import com.github.kbyst.kcloudregistryconsul.domain.TagData;
import com.github.kbyst.kcloudregistryconsul.service.RestAPI;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    RestAPI restAPI;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test(){
        return restAPI.test();
    }

    @RequestMapping(value="/selectByTagId", method= RequestMethod.GET)
    PageInfo<TagData> selectByTagId(
                                //@RequestParam("pageNum") Integer pageNum,
                                //@RequestParam("pageSize") Integer pageSize,
                                @RequestParam("tagId") String tagId){
        return restAPI.selectByTagId(1,5,tagId);
    }
}
