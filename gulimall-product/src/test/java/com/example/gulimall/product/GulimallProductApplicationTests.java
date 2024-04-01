package com.example.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.common.utils.R;
import com.example.gulimall.product.controller.AttrGroupController;
import com.example.gulimall.product.controller.BrandController;
import com.example.gulimall.product.controller.SkuInfoController;
import com.example.gulimall.product.controller.SpuInfoController;
import com.example.gulimall.product.entity.BrandEntity;
import com.example.gulimall.product.service.BrandService;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    private static final Gson gson = new Gson();

    @Autowired
    BrandController brandController;

    @Autowired
    AttrGroupController attrGroupController;

    @Autowired
    SpuInfoController spuInfoController;

    @Autowired
    SkuInfoController skuInfoController;


    @Test
    public void contextLoads() {
        Map<String, Object> params = new HashMap<>();
        params.put("max", "6000");
        R list = skuInfoController.list(params);
        log.info(gson.toJson(list));
        System.out.println("jxq");
    }

}
