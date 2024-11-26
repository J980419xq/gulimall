package com.example.gulimall.product;

import com.example.common.utils.R;
import com.example.gulimall.product.app.AttrGroupController;
import com.example.gulimall.product.app.BrandController;
import com.example.gulimall.product.app.SkuInfoController;
import com.example.gulimall.product.app.SpuInfoController;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
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
