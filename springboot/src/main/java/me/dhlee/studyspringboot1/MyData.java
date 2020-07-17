package me.dhlee.studyspringboot1;

import javax.persistence.*;

@Entity
@Table(name = "mydata") // 생략시 클래스명이 테이블명으로 사용됨
public class MyData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 200, nullable = true)
    private String mail;
    @Column(nullable = true)
    private Integer age;
    @Column(nullable = true)
    private String momo;

    public MyData() {}

    public MyData(String name, Integer age, String mail, String momo) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.momo = momo;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public Integer getAge() {
        return age;
    }

    public String getMomo() {
        return momo;
    }

}
