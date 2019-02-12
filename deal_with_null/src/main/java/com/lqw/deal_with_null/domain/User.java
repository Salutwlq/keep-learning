package com.lqw.deal_with_null.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 10:52
 */

@Data
@Component
public class User {
    /**
     * 用户主键
     */
    @Max(200)
    private long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户年龄
     */
    private int age;


}
