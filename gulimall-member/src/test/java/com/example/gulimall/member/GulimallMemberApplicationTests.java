package com.example.gulimall.member;

import com.example.gulimall.member.entity.MemberEntity;
import com.example.gulimall.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("测试账号");
        memberService.save(memberEntity);
        log.info("jxq");
    }

}
