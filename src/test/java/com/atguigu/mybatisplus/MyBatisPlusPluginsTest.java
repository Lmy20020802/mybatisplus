package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.mapper.ProductMapper;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.Product;
import com.atguigu.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName MyBatisPlusPluginsTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/5 20:11
 **/
@SpringBootTest
public class MyBatisPlusPluginsTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testPage(){
        Page<User> page=new Page<>(1,3);
        userMapper.selectPage(page,null);
        System.out.println(page.getRecords());//遍历输出的信息
        System.out.println(page.getPages());//总页数
        System.out.println(page.getTotal());//总记录数
        System.out.println(page.hasNext());//是否还有下一页
        System.out.println(page.hasPrevious()); //是否还有上一页
    }

    @Test
    public void testPageVo(){
        Page<User> page=new Page<>(2,2);
        userMapper.selectPageVo(page,20);
        System.out.println(page.getRecords());//遍历输出的信息
        System.out.println(page.getPages());//总页数
        System.out.println(page.getTotal());//总记录数
        System.out.println(page.hasNext());//是否还有下一页
        System.out.println(page.hasPrevious()); //是否还有上一页
    }

    @Test
    public void testProduct01(){
        //小李查询商品价格
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询的商品价格:"+productLi.getPrice());
        //小王查询商品价格
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询的商品价格:"+productWang.getPrice());
        //小李将商品价格+50
        productLi.setPrice(productLi.getPrice()+50);
        productMapper.updateById(productLi);
        //小王将商品价格-30
        productWang.setPrice(productWang.getPrice()-30);
        int result = productMapper.updateById(productWang);
        if (result==0){
            //操作失败 重试
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice()-30);
            productMapper.updateById(productNew);

        }
        //老板查询商品价格
        Product productLaoban = productMapper.selectById(1);
        System.out.println("小王查询的商品价格:"+productLaoban.getPrice());
    }
}
