package com.project.market.member.entity;

import com.project.market.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member extends BaseEntity {
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    private String email;