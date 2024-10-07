package com.rossini.people.dto.response;


import com.rossini.people.entity.Person;
import lombok.Getter;

@Getter
public class PersonResponseDTO {

    private Long id;

    private String name;
    private String phone;
    private String email;
    private String cpf;
    private String password;
    private Integer age;

    public PersonResponseDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.phone = person.getPhone();
        this.email = person.getEmail();
        this.cpf = person.getCpf();
        this.password = person.getPassword();
        this.age = person.getAge();
    }


}
