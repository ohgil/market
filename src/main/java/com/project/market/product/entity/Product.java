package com.project.market.product.entity;

import com.project.market.base.BaseEntity;
import com.project.market.cart.entity.Cart;
import com.project.market.market.Market;
import com.project.market.question.entity.Question;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Product extends BaseEntity {
    private String name;
    private String description;
    private int price;
    private int hitCount;
    private String isActive;
    private String thumbnailImg;
    @ManyToOne
    private Market market;
    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Question> questionList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Cart> cartList;
}