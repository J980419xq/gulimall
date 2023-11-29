package com.example.gulimall.coupon;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.example.gulimall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    public void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        List<CouponEntity> list = couponService.list();
        list.forEach(System.out::println);
        System.out.println("jxq");
    }

}
