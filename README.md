# 🔐 Spring Boot Member Management System

## Overview
This project is a simple Member Management System built using **Spring Boot**, **Spring Security**, and **MySQL**.

The system allows users to:

- Register an account
- Login securely
- Store encrypted passwords
- Access protected pages

This project demonstrates a complete **Spring Boot MVC architecture**.

---

## Features

### Member Registration
Users can register with:

- Username
- Password
- Email

Data is stored in MySQL database.

---

### Member Login

Login verification includes:

1. Query user from database
2. Verify password using BCrypt
3. Login success

Example encrypted password:

$2a$10$xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

---

## Architecture

Browser
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
MySQL

---

## Technologies

### Backend

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Lombok

### Frontend

- HTML
- Thymeleaf
- Bootstrap

### Database

- MySQL

---

## Project Structure

src/main/java

controller/
    LoginController.java

service/
    LoginService.java

repository/
    UsersRepository.java

entity/
    UsersEntity.java

model/
    UserVo.java

config/
    SecurityConfig.java

templates/
    login.html
    register.html
    loginSuccess.html

---

## Setup

### 1 Clone Project

git clone https://github.com/yourname/member-system.git

---

### 2 Create Database

CREATE DATABASE course;

CREATE TABLE users (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(50),
 password VARCHAR(255),
 email VARCHAR(100),
 img_name VARCHAR(255)
);

---

### 3 application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/course
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update

---

### 4 Run Project

http://localhost:8080/login

---

## Security

Passwords are encrypted using:

BCryptPasswordEncoder

Passwords are never stored in plain text.

---

## Future Improvements

- Edit Profile
- Change Password
- Pagination
- Search Function
- Member Statistics

---

## Author

Student Spring Boot Project

2026

