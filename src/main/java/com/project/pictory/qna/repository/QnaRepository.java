package com.project.pictory.qna.repository;

import com.project.pictory.qna.domain.Qna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnaRepository extends JpaRepository<Qna, Long> {
}
