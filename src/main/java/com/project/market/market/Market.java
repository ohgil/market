package com.project.market.market;

import com.project.market.base.BaseEntity;
import com.project.market.member.entity.Member;
import com.project.market.product.entity.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@SuperBuilder
public class Market extends BaseEntity {
    private String email;
    private String name;
    private String info;
    @OneToOne
    private Member member;

    @OneToMany(mappedBy = "market", cascade = CascadeType.REMOVE)
    private List<Product> productList;
}