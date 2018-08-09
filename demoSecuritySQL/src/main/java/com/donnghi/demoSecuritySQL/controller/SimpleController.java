package com.donnghi.demoSecuritySQL.controller;


import com.donnghi.demoSecuritySQL.Entities.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SimpleController
{
    private List<Person> person;

    public SimpleController() {
        this.person = new ArrayList<>();
        this.person.add(new Person(1L, "Huu-Nghi", "Nguyen"));
        this.person.add(new Person(2L, "Bao-Quoc", "Nguyen"));
        this.person.add(new Person(3L, "Ngoc-Phuc", "Dang"));
    }

    @RequestMapping("/")
    public String index() {
        return "Congratulation from SimpleController.java";
    }

    @RequestMapping("/api/v1/people")
    public List<Person> getRequestFromAngular() {
        return this.person;
    }

}
