package com.zhss.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ServiceB的接口类
 * Created by CTWLPC on 2018/11/16.
 */
@RestController
@Configuration
public class ServiceBController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    // 对外提供greeting这个接口，传一个name, 拿一个RestTemplate去调用ServiceA的
    // 地址，而不是直接写一个什么IP地址什么的
    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
    public String greeting(@PathVariable("name") String name) {
        // RestTemplate，本来就是访问单个http接口的，但是现在加了@LoadBalanced以后，就可以通过Ribbon的支持，
        // 实现负载均衡了，假如ServiceA部署了几台机器，那么可以自动负载均衡，轮询调用每一个实例
        RestTemplate restTemplate = getRestTemplate();
        return restTemplate.getForObject("http://ServiceA/sayHello/" + name, String.class);
    }

}
