package com.example.englishtest.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "B2_result")
public class B2model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "q1")
    String q1;
    @Column(name = "q2")
    int q2;
    @Column(name = "q3")
    int q3;
    @Column(name = "q4")
    int q4;
    @Column(name = "q5")
    int q5;
    @Column(name = "q6")
    String q6;
    @Column(name = "q7")
    int q7;
    @Column(name = "q8")
    int q8;
    @Column(name = "q9")
    int q9;
    @Column(name = "q10")
    int q10;
}
