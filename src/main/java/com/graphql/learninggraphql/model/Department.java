package com.graphql.learninggraphql.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }
}
