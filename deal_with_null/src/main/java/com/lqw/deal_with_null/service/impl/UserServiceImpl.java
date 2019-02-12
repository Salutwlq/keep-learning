package com.lqw.deal_with_null.service.impl;

import com.lqw.deal_with_null.domain.User;
import com.lqw.deal_with_null.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 11:17
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User get(Integer id) {
        return null;
    }

    @Override
    public Optional<User> getOptional(@Max(200L) Long id) {
        User user = new User();
        user.setAge(20);
        user.setId(1L);
        user.setName("aaa");
        return Optional.ofNullable(user);
    }
}
