package com.example.gulimall.ware;

import com.example.gulimall.ware.entity.PurchaseDetailEntity;
import com.example.gulimall.ware.service.PurchaseDetailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    PurchaseDetailService purchaseDetailService;

    @Test
    void contextLoads() {
        List<PurchaseDetailEntity> list = purchaseDetailService.list();
        list.forEach(System.out::println);
        log.info("jxq");
    }

}
