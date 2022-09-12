/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class PersonDTO {
    private long id;
    private String name;
    private int age;

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<PersonDTO> getDtos(List<Person> ps){
        List<PersonDTO> pdtos = new ArrayList();
        ps.forEach(p->pdtos.add(new PersonDTO(p)));
        return pdtos;
    }


    public PersonDTO(Person p) {
        if(p.getId() != null)
            this.id = p.getId();
        this.name = p.getName();
        this.age = p.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RenameMeDTO{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
    
    
    
    
    
}
