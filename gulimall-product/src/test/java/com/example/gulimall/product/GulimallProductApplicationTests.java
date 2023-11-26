package com.example.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.gulimall.product.entity.BrandEntity;
import com.example.gulimall.product.service.BrandService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
        System.out.println("jxq");
    }

}
