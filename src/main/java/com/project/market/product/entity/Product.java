package com.project.market.product.entity;

import com.project.market.base.entity.BaseEntity;
import com.project.market.cart.entity.Cart;
import com.project.market.market.Market;
import com.project.market.question.entity.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
@ToString
public class Product extends BaseEntity {
    private String name;
    private String description;
    private int price;
    private int hitCount;
    private String isActive;
    @ManyToOne
    private Market market;
    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Question> questionList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Cart> cartList;
}