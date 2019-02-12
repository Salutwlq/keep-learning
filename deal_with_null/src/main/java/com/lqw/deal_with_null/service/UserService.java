package com.lqw.deal_with_null.service;

import com.lqw.deal_with_null.domain.User;

import javax.validation.constraints.Max;
import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 11:00
 */


public interface UserService {
    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户id
     * @return 用户实体
     * @throws NullPointerException 用户找不到
     */
    User get(Integer id);

    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户id
     * @return 用户实体，此实体可能是缺省值
     */
    Optional<User> getOptional(Long id);
}
