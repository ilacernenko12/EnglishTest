package com.example.englishtest.repos;

import com.example.englishtest.models.A2model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface A2Repo extends JpaRepository <A2model, Long> {
}
