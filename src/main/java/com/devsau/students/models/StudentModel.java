package com.devsau.students.models;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentModel {
    // Attributes | Columns on table studen
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private int code;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String degree;
    private float score;

    // Methods
    public StudentModel(Long id, int code, String name, String email, String degree, float score) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.degree = degree;
        this.score = score;
    }

    public StudentModel() { }



    // Getters

    public Long getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDegree() {
        return degree;
    }

    public float getScore() {
        return score;
    }



    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
