package com.studiesalexan.mongodbspringboot.dto;

import com.studiesalexan.mongodbspringboot.domain.Post;
import com.studiesalexan.mongodbspringboot.domain.User;

import java.io.Serializable;
import java.util.List;

public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO(List<Post> posts) {
    }
    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email= user.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
