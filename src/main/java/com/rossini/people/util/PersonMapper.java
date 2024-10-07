package com.rossini.people.util;

import com.rossini.people.dto.request.PersonRequestDTO;
import com.rossini.people.dto.response.PersonResponseDTO;
import com.rossini.people.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public Person toPerson(PersonRequestDTO personDTO) {

        return Person.builder()
                .name(personDTO.getName())
                .phone(personDTO.getPhone())
                .email(personDTO.getEmail())
                .cpf(personDTO.getCpf())
                .password(personDTO.getPassword())
                .age(personDTO.getAge())
                .build();

    }

    public PersonResponseDTO toPersonDTO(Person person) {
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList) {
        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePersonData(Person person, PersonRequestDTO personDTO) {

        person.setName(personDTO.getName());
        person.setPhone(personDTO.getPhone());
        person.setEmail(personDTO.getEmail());
        person.setCpf(personDTO.getCpf());
        person.setPassword((person.getPassword()));
        person.setAge(personDTO.getAge());

    }

}
