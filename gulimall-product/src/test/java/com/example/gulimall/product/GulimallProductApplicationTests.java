package com.example.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.gulimall.product.controller.BrandController;
import com.example.gulimall.product.entity.BrandEntity;
import com.example.gulimall.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandController brandController;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setLogo("XXX");
        brandController.updateStatus(brandEntity);
        System.out.println("jxq");
    }

}
