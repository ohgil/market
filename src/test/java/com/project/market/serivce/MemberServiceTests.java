package com.project.market.serivce;

import com.project.market.member.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MemberServiceTests {

    @Autowired
    private MemberService memberService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("회원가입")
    void t1 () {
        String username = "user1";
        String password = "1234";
        String email = "test@test.com";
        String nickname = "tester";

        memberService.join(username, password, email, nickname);
    }

    void t2 () {
        String username = "user1";
        String password = "1234";
        String email = "test@test.com";
        String nickname = "tester";

        memberService.join(username, password, email, nickname);

    }
}