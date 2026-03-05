
# 🚀 Spring Boot User Management System
### Spring Boot 會員管理系統

A **User Management System** built with **Spring Boot + Spring Security + Thymeleaf + MySQL**.  
This project demonstrates **authentication, authorization, role-based access control, and CRUD operations**.

本專案是一個使用 **Spring Boot + Spring Security + Thymeleaf + MySQL** 建立的 **會員管理系統**，
展示了 **登入驗證、權限控制、會員管理 CRUD 功能**。

---

# 📸 System Features | 系統功能

## 🔐 Authentication / 登入驗證
- Login system with **Spring Security**
- BCrypt password encryption
- Forgot password & reset password

使用 **Spring Security** 建立登入系統  
密碼使用 **BCrypt 加密**  
支援 **忘記密碼 / 重設密碼**

---

## 👥 User Management / 會員管理

| Feature | Description |
|------|------|
| User Registration | 使用者註冊 |
| Login Authentication | 登入驗證 |
| Profile Management | 個人資料管理 |
| User List | 會員列表 |
| Search User | 會員搜尋 |
| Pagination | 分頁功能 |
| Delete User | 刪除會員 |
| Role Management | 權限管理 |

---

# 🔑 Role Permissions | 權限設計

| Role | Permissions |
|-----|-------------|
| USER | 查看個人資料 |
| ADMIN | 查看會員列表 |
| SUPER_ADMIN | 管理會員 / 權限控制 |

### Role Hierarchy

SUPER_ADMIN  
⬇  
ADMIN  
⬇  
USER

---

# 🧰 Tech Stack | 技術架構

Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA

Frontend
- Thymeleaf
- HTML / CSS
- Bootstrap 5

Database
- MySQL

Build Tool
- Maven

---

# 📂 Project Structure | 專案結構

```
springboot-user-system
│
├─ controller
│   ├─ LoginController
│   └─ UserController
│
├─ service
│   ├─ LoginService
│   ├─ UserService
│   └─ CustomUserDetailsService
│
├─ repository
│   └─ UsersRepository
│
├─ entity
│   └─ UsersEntity
│
├─ config
│   └─ SecurityConfig
│
└─ templates
    ├─ login.html
    ├─ register.html
    ├─ loginSuccess.html
    └─ users.html
```

---

# 🗄 Database Setup | 資料庫建立

## Create Database

```sql
CREATE DATABASE user_system;
```

## Create Table

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(255),
    email VARCHAR(100),
    role VARCHAR(20)
);
```

---

# 👑 Default Role Setup

```sql
update users set role='ADMIN' where username='admin';
update users set role='SUPER_ADMIN' where username='root';
```

---

# ▶️ Run Project | 執行專案

### 1️⃣ Clone Repository

```bash
git clone https://github.com/yourname/springboot-user-system.git
```

### 2️⃣ Import into IDE

Recommended IDE:
- IntelliJ IDEA
- Eclipse
- VS Code

### 3️⃣ Configure Database

Edit:

```
application.properties
```

Example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/user_system
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### 4️⃣ Run Spring Boot

Run:

```
SpringbootApplication.java
```

Open browser:

```
http://localhost:8080
```

---

# 🧭 Future Features | 未來規劃

Planned improvements:

- 📊 Admin Dashboard
- 📂 File Upload (Avatar)
- 📧 Email Verification
- 🔑 JWT Authentication
- 📱 Responsive UI
- 📑 Activity Log
- 📊 User Statistics
- 🧑‍💼 Role Management Panel
- 📦 Docker Deployment

未來將新增：

- 管理員儀表板
- 頭像上傳
- Email 驗證
- JWT Token 登入
- 響應式 UI
- 操作紀錄系統
- 使用者統計
- 權限管理面板
- Docker 部署

---

# 📜 License

MIT License

---

# ⭐ If you like this project

Give it a ⭐ on GitHub!
