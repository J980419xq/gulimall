package com.example.gulimall.ware;

import com.example.common.utils.R;
import com.example.gulimall.ware.controller.WareInfoController;
import com.example.gulimall.ware.entity.PurchaseDetailEntity;
import com.example.gulimall.ware.service.PurchaseDetailService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallWareApplicationTests {

    @Autowired
    PurchaseDetailService purchaseDetailService;

    @Autowired
    WareInfoController wareInfoController;

    private static final Gson gson = new Gson();

    @Test
    public void contextLoads() {
        Map<String, Object> params = new HashMap<>();
        R list = wareInfoController.list(params);
        log.info(gson.toJson(list));
    }

}
