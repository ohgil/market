package com.project.market.question;

import com.project.market.base.entity.BaseEntity;
import com.project.market.member.entity.Member;
import com.project.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question extends BaseEntity {
    private String title;
    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;
}