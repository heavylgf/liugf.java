//package com.zhss.oa.auth.service.impl;
//
//import Authorization;
//import AuthorizationService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import static org.junit.Assert.*;
//
///*
//用来指定加载的Spring配置文件的位置,会加载默认配置文件
//@ContextConfiguration 注解有以下两个常用的属性：
//locations：可以通过该属性手工指定 Spring 配置文件所在的位置，可以指定一个或多个 Spring 配置文件。
//inheritLocations：是否要继承父测试用例类中的 Spring 配置文件，默认为 true。
//*/
//@ContextConfiguration(locations = {"classpath:application-auth.xml"})
//
///*用于配置spring中测试的环境*/
//@RunWith(SpringJUnit4ClassRunner.class)
//
//public class AuthorizationServiceImplTest {
//
//    @Autowired
//    private AuthorizationService authorizationService;
//
//    @Test
//    public void authorize() {
//        Authorization auth = new Authorization();
////        auth.setId(1L);
//        auth.setEmployeeId(1L);
//        auth.setRoleId(1L);
//        authorizationService.authorize(auth);
//        assertEquals(true, auth.getId() > 0L);
//
//    }
//
//    @Test
//    public void findById() {
//        Authorization auth = new Authorization();
//        auth.setEmployeeId(1L);
//        auth.setRoleId(1L);
//        authorizationService.authorize(auth);
//        Authorization _auth = authorizationService.findById(auth.getId());
//        assertEquals(true, _auth != null);
//    }
//
//    @Test
//    public void unauthorize() {
//        Authorization auth = new Authorization();
//        auth.setEmployeeId(1L);
//        auth.setRoleId(1L);
//
//        authorizationService.authorize(auth);
//        authorizationService.unauthorize(auth.getId());
//        Authorization _auth = authorizationService.findById(auth.getId());
//        assertEquals(true, _auth == null);
//    }
//
//}