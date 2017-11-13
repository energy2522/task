package com.nixsolutions.dto;

import com.nixsolutions.domain.User;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserDto {

    private int id;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public UserDto() {
    }

    public UserDto(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public User getUser() {
        return new User(id, name, birthDate);
    }
}
