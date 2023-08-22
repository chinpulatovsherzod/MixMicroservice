package com.example.departmentservice.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Department {

    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();


    public Department() {
    }

    public Department(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
