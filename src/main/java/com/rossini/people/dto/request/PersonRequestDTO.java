package com.rossini.people.dto.request;

import lombok.Getter;

@Getter
public class PersonRequestDTO {

    private String name;
    private String phone;
    private String email;
    private String cpf;
    private String password;
    private Integer age;

}
