package com.changwooheo;

import java.util.List;
import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> techStack;
    // Defualt Constructor
    public SoftwareEngineer() {

    }
    // Constructor
    public SoftwareEngineer(Integer id, String name, List<String> techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    // Getters
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<String> getTechStack() {
        return techStack;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
