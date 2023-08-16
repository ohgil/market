package com.project.market.answer;

import com.project.market.base.entity.BaseEntity;
import com.project.market.member.entity.Member;
import com.project.market.question.entity.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer extends BaseEntity {

    private String comment;

    @OneToOne
    private Member member;
    @OneToOne
    private Question question;
}
