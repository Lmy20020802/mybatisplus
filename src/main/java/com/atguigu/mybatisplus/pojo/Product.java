package com.atguigu.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @ClassName Product
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/5 21:41
 **/
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version //标识乐观锁版本号字段
    private Integer version;
}