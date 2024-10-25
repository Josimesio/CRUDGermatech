package com.rossini.people.util;

import com.rossini.people.dto.request.PersonRequestDTO;
import com.rossini.people.dto.response.PersonResponseDTO;
import com.rossini.people.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public Person toPerson(PersonRequestDTO dto) {
        return new Person(dto.getName(), dto.getPhone(), dto.getEmail(), dto.getCpf(), dto.getPassword(), dto.getAge());
    }

    public PersonResponseDTO toPersonDTO(Person person) {
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> people) {
        return people.stream()
                .map(this::toPersonDTO)
                .collect(Collectors.toList());
    }

    public void updatePersonData(Person person, PersonRequestDTO dto) {
        person.setName(dto.getName());
        person.setPhone(dto.getPhone());
        person.setEmail(dto.getEmail());
        person.setCpf(dto.getCpf());
        person.setPassword(dto.getPassword());
        person.setAge(dto.getAge());
    }
}