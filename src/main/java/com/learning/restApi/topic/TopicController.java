package com.learning.restApi.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring","spring framwork","spring framword descrpition"),
                new Topic("java","java framwork","java framword descrpition"),
                new Topic("json","json framwork","json framword descrpition")

        );
    }
}
