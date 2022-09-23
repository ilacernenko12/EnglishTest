package com.example.englishtest.repos;

import com.example.englishtest.models.A1model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface A1Repo extends JpaRepository<A1model, Long> {
}
