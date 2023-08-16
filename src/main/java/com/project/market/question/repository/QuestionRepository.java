package com.project.market.question.repository;

import com.project.market.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}