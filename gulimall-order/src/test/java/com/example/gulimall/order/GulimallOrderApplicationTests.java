package com.example.gulimall.order;

import com.example.gulimall.order.entity.OrderEntity;
import com.example.gulimall.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class GulimallOrderApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	void contextLoads() {
		List<OrderEntity> list = orderService.list();
		list.forEach(System.out::println);
		log.info("jxq");
	}

}
