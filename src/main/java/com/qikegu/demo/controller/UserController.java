package com.qikegu.demo.controller;

import javax.annotation.Resource;

import com.qikegu.demo.repository.UserMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qikegu.demo.model.User;
//import com.qikegu.demo.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    protected static final Logger logger = LoggerFactory.getLogger(UserController.class);

	// 注入mapper类
//    @Resource
//    private UserService userService;

    @Resource
    private UserMapper userMapper;
	
    @RequestMapping(value="{id}", method=RequestMethod.GET, produces="application/json")
    public User getUser(@PathVariable long id) throws Exception {
        logger.info("getUserById before");
//        User user = this.userService.getUserById(id);
        User user = this.userMapper.selectByPrimaryKey(id);
        logger.info("getUserById after");
        return user;
    }

    @RequestMapping("abc")
    public String getIndex() {
        logger.info("getIndex ing");
        return "Hello Lewis";

    }

}