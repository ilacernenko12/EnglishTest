package com.example.englishtest.repos;

import com.example.englishtest.models.C1Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C1Repo extends JpaRepository<C1Model, Long> {
}
