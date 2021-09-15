package com.telusko.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {

    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String Email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() { return "Admin {" + "id=" + id + ", name='" + name + '\'' + ", Email='" + Email + '\'' + '}';}
}
