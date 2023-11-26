package com.example.gulimall.coupon;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.example.gulimall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        List<CouponEntity> list = couponService.list();
        list.forEach(System.out::println);
        System.out.println("jxq");
    }

}
