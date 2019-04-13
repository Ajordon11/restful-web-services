package com.ajordon.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private Date birtDate;

    public User() {
    }

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

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public User(Integer id, String name, Date birtDate) {
        this.id = id;
        this.name = name;
        this.birtDate = birtDate;
    }
}
