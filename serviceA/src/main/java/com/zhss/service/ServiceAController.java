package com.zhss.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServiceA的接口类
 * Created by CTWLPC on 2018/11/16.
 */
@RestController
public class ServiceAController {

    @RequestMapping(value = "/sayHello/{name}",
            method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name) {
//        return "hello, " + name;
        System.out.println("被调用了一次");
        return "{'msg': 'hello, " + name + "'}";
    }

}
