package com.practice.project.quizapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestIntr extends JpaRepository<courses, Integer> {
}
