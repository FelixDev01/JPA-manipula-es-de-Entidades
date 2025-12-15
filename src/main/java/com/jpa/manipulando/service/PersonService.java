package com.jpa.manipulando.service;

import com.jpa.manipulando.dto.PersonDTO;
import com.jpa.manipulando.entity.Department;
import com.jpa.manipulando.entity.Person;
import com.jpa.manipulando.repository.DepartmentRepository;
import com.jpa.manipulando.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository repository;
    private final DepartmentRepository departmentRepository;

    public PersonService(PersonRepository repository, DepartmentRepository departmentRepository) {
        this.repository = repository;
        this.departmentRepository = departmentRepository;
    }

    public PersonDTO insert (PersonDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = new Department();
        dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDTO(entity);
    }
}
