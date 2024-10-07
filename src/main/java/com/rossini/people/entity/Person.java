package com.rossini.people.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_people")
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "age", nullable = false)
    private Integer age;

    @Builder
    public Person(String name,String phone,String email, String cpf,String password, Integer age) {

        this.name = name;
        this.phone = phone;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
        this.age = age;
    }

}
