package com.cojar.market.serivce;

import com.cojar.market.product.Service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MemberServiceTests {

    @Autowired
    private MemberService memberService;
    @Test
    @DisplayName("회원가입")
    void t1() {
        String username = "user1";
        String password = "1234";
        String email = "test@test.com";
        String nickname = "tester";

        memberService.join(username, password,email, nickname);
//        for (int i = 1; i <= 200; i++) {
//            String name = String.format("테스트 상품:[%03d]", i);
//            int price = 1;
//            this.productService.create(name, price);
//        }
    }
}