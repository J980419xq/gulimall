package com.example.gulimall.member;

import com.example.gulimall.member.entity.MemberEntity;
import com.example.gulimall.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("测试账号");
        memberService.save(memberEntity);
        log.info("jxq");
    }

}
