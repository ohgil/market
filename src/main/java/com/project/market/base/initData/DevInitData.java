package com.project.market.base.initData;


import com.project.market.member.service.MemberService;
import com.project.market.product.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements BeforeInitData {
    @Bean
    CommandLineRunner initData(MemberService memberService, ProductService productService) {
        return args -> {
            beforeInit();

            String password = "{noop}1234";
            memberService.join("admin",  "1234", "admin@test.com", "admin");
            memberService.join("user1",  "1234", "user1@test.com", "user1");
            memberService.join("user2", password, "user2@test.com", "user2");
            memberService.join("user3", password, "user3@test.com", "user3");
            memberService.join("user4", password, "user4@test.com", "user4");

            productService.create("타이틀1", "1설명입니다.", 10000);
            productService.create("타이틀2", "2설명입니다.", 10000);
            productService.create("타이틀3", "3설명입니다.", 10000);
            productService.create("타이틀4", "4설명입니다.", 10000);
        };
    }
}