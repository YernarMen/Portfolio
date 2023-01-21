package com.example.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stud_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "admission_date")
    private Date admissionDate;

    @Column(name = "address")
    private String address;

    public Student() {
    }

    public Student(Long id, String name, String surname, Date admissionDate, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.admissionDate = admissionDate;
        this.address = address;
    }
}
