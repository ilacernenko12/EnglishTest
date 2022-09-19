package com.example.englishtest.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "result")
public class ResultModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "testResult")
    int testResult;

    @Column(name = "A2Result")
    int A2Result;

    @Column(name = "B2Result")
    int B2Result;

    @Column(name = "A1Result")
    int A1Result;

    @Column(name = "C1Result")
    int C1Result;

}
