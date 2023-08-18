package com.project.market.question.entity;

import com.project.market.base.BaseEntity;
import com.project.market.member.entity.Member;
import com.project.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
@Entity
public class Question extends BaseEntity {

    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;
}