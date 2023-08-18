package com.project.market.member.entity;

import com.project.market.base.BaseEntity;
import com.project.market.cart.entity.Cart;
import com.project.market.question.entity.Question;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@SuperBuilder
public class Member extends BaseEntity {
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String isActive;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Question> questionList;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private  List<Cart> cartList;
}