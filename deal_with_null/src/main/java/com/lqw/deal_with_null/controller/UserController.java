package com.lqw.deal_with_null.controller;

import com.lqw.deal_with_null.domain.User;
import com.lqw.deal_with_null.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 11:37
 */

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class UserController {
    @Autowired
    UserServiceImpl userService;

    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUser(@Validated User user){
        Long id = 400L;
        log.info("id:[{}]",id);
        Optional<User> optUser= userService.getOptional(id);
        log.info("userName:[{}]",optUser.map(user1 -> user.getName()));
        User user1 =optUser.get();
        return user;
    }
}
