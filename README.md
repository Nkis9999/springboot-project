<<<<<<< HEAD
# springboot-project-會員系統
springboot-project
=======
# Spring Boot Member Login System
>>>>>>> main

一個使用 Spring Boot + MySQL 開發的簡易會員登入系統，提供會員註冊與登入功能，並使用加密技術保護使用者密碼安全。

## 系統功能

<<<<<<< HEAD
技術：Java、Spring Boot、MySQL、Spring Security、BCrypt

=======
- 會員註冊
- 會員登入
- 密碼加密 (BCrypt)
- MySQL資料庫存取
>>>>>>> main

## 使用技術

<<<<<<< HEAD
先前因未加入Thymeleaf導致設計上偏簡陋直白，今加入後更改了部分程式碼的編程，並排除DB重複註冊導致頁面壞掉的風險。
未來會再繼續新增會員個人資料修改頁面及查詢會員資料的功能。

解決了新會員註冊帳號後，使用新創帳號無法登入的問題。
=======
Backend:
- Spring Boot
- Spring Security
- Spring Data JPA
- Lombok

Frontend:
- Thymeleaf
- Bootstrap

Database:
- MySQL

## 系統架構

Controller → Service → Repository → Database

## 執行方式

1. 建立資料庫

CREATE DATABASE course;

2. 建立 users 表

CREATE TABLE users (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(50),
 password VARCHAR(255),
 email VARCHAR(100),
 img_name VARCHAR(255)
);

3. 執行專案

http://localhost:8080
>>>>>>> main
