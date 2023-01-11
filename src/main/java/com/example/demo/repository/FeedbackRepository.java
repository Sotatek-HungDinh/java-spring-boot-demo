package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Feedback;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
  // Page<Feedback> findAll(Pageable pageable);
}
