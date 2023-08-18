package com.project.market.answer;

import com.project.market.base.BaseEntity;
import com.project.market.member.entity.Member;
import com.project.market.question.entity.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
public class Answer extends BaseEntity {

    private String comment;

    @OneToOne
    private Member member;
    @OneToOne
    private Question question;
}
