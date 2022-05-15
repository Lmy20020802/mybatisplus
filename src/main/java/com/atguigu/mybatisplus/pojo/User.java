package com.atguigu.mybatisplus.pojo;

import com.atguigu.mybatisplus.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

/**
 * @ClassName User
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/4 23:29
 **/
@Data //lombok
//设置实体类所对应的表名
//@TableName("t_user")
public class User {

    //将属性所对应的字段指定为主键
    //@TableId注解的value属性用于指定主键的字段 当只有value时可以省略
//    @TableId(value = "uid",type = IdType.AUTO)
    @TableId("uid")
    private Long id;

    @TableField("user_name")
    private String name;

    private Integer age;

    private String email;

    private SexEnum sex;

    @TableLogic
    private Integer isDeleted;
}
