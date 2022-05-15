package com.atguigu.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @ClassName SexEnum
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/5 22:17
 **/
@Getter
public enum SexEnum {
    MALE(1,"男"),
    FEMALE(2,"女");

    @EnumValue //将注解所标识的属性的值存储到数据库中
    private Integer sex;
    private String name;

    SexEnum(Integer sex, String name) {
        this.sex = sex;
        this.name = name;
    }
}
