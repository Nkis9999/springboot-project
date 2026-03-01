package com.course.model;

import lombok.Data;

@Data
public class UserVo {

    private String username;

    private String password;

    private String email;
    
//    private MultipartFile photo;

}