package com.example.englishtest.repos;

import com.example.englishtest.models.ResultModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepo extends JpaRepository<ResultModel, Long> {
}
