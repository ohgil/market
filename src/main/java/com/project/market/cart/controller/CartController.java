package com.project.market.cart.controller;


import com.project.market.cart.entity.Cart;
import com.project.market.cart.service.CartService;
import com.project.market.member.entity.Member;
import com.project.market.member.service.MemberService;
import com.project.market.product.entity.Product;
import com.project.market.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {
    private final ProductService productService;
    private final MemberService memberService;
    private final CartService cartService;
    @PreAuthorize("isAuthenticated()")
    @GetMapping("list")
    public String list (Principal principal, Model model) {
        Member member = memberService.findByUsername(principal.getName());
        List<Cart> cartList = this.cartService.getList(member);
        model.addAttribute("cartList", cartList);


        return "cart/list";
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/add/{id}")
    public String add (@PathVariable Long id, Principal principal) {
        Product product = productService.getProduct(id);
        Member member = memberService.findByUsername(principal.getName());

        this.cartService.add(product, member);

        return "redirect:/cart/list";
    }
}
