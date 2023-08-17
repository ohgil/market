package com.project.market.cart.entity;

import com.project.market.base.entity.BaseEntity;
import com.project.market.member.entity.Member;
import com.project.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
public class Cart extends BaseEntity {

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;
}