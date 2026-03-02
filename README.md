# 🔐 Spring Boot 會員管理系統

## 專案介紹

本專案為一個使用 **Spring Boot + MySQL** 開發的簡易會員管理系統。

系統提供：

- 會員註冊功能
- 會員登入功能
- 密碼加密儲存
- 安全登入驗證

本系統採用 **Spring Boot MVC 架構設計**，示範完整 Web 系統開發流程。

---

## 系統功能

### 會員註冊

使用者可以註冊帳號：

- Username
- Password
- Email

會員資料會儲存至 MySQL 資料庫。

---

### 會員登入

登入流程：

1. 從資料庫查詢使用者
2. 使用 BCrypt 比對密碼
3. 驗證成功後登入系統

加密密碼範例：

$2a$10$xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

---

## 系統架構

瀏覽器
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
MySQL資料庫

---

## 使用技術

### 後端技術

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Lombok

---

### 前端技術

- HTML
- Thymeleaf
- Bootstrap

---

### 資料庫

- MySQL

---

## 專案結構

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

## 安裝方式

### 1 Clone 專案

git clone https://github.com/yourname/member-system.git

---

### 2 建立資料庫

CREATE DATABASE course;

CREATE TABLE users (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(50),
 password VARCHAR(255),
 email VARCHAR(100),
 img_name VARCHAR(255)
);

---

### 3 設定 application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/course
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update

---

### 4 執行專案

開啟瀏覽器：

http://localhost:8080/login

---

## 安全設計

系統使用：

BCryptPasswordEncoder

進行密碼加密。

密碼不會以明文儲存在資料庫中。

---

## 未來擴充功能

- 個人資料修改
- 修改密碼
- 分頁功能
- 搜尋功能
- 會員統計

---

## 作者

Spring Boot 學習專案

2026
