package com.project.market.cart.service;

import com.project.market.cart.entity.Cart;
import com.project.market.cart.repository.CartRepository;
import com.project.market.member.entity.Member;
import com.project.market.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    public void add(Product product, Member member) {
        Cart c = new Cart();
        c.setProduct(product);
        c.setMember(member);
        c.setCreateDate(LocalDateTime.now());

        this.cartRepository.save(c);
    }
    public List<Cart> getList(Member member) {
        return this.cartRepository.findByMember(member);
    }
}