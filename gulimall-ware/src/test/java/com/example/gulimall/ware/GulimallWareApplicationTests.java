package com.example.gulimall.ware;

import com.example.gulimall.ware.entity.PurchaseDetailEntity;
import com.example.gulimall.ware.service.PurchaseDetailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallWareApplicationTests {

    @Autowired
    PurchaseDetailService purchaseDetailService;

    @Test
    public void contextLoads() {
        List<PurchaseDetailEntity> list = purchaseDetailService.list();
        list.forEach(System.out::println);
        log.info("jxq");
    }

}
