package com.project.market.Controller;

import com.project.market.member.controller.MemberController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MemberControllerTests {

    @Autowired
    private MemberController MemberController;

    @Test
    @DisplayName("회원가입")
    void t1() {
    }
}