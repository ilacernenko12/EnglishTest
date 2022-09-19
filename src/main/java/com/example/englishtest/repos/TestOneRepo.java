package com.example.englishtest.repos;

import com.example.englishtest.models.TestOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestOneRepo extends JpaRepository<TestOne,Long> {

}
