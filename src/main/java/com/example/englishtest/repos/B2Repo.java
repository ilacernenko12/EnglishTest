package com.example.englishtest.repos;

import com.example.englishtest.models.B2model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface B2Repo extends JpaRepository <B2model, Long> {
}
