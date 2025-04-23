# 💼 Loan Management System - Backend

This repository contains the backend implementation of a **Loan Management System** developed using **Spring Boot**. The system is designed to handle various functionalities related to loan processing such as user registration, loan applications, approval workflow, and transaction management. It supports different user roles including **Customers**, **Loan Officers**, and **Administrators**.

---

## 🛠️ Technology Stack

| Technology        | Purpose                                        |
|-------------------|------------------------------------------------|
| Java (Spring Boot)| Backend framework for developing REST APIs     |
| Spring Data JPA   | ORM for interacting with MySQL database        |
| Spring Security   | Authentication and authorization               |
| MySQL             | Relational database for persistent storage     |
| Maven             | Build and dependency management tool           |
| Postman           | API testing and documentation                  |

---

## ⚙️ Key Features

- 🔐 Role-based access control (Customer, Loan Officer, Admin)
- 📝 Customers can apply for new loans and track their application status
- ✔️ Admin can approve or reject loan requests
- 💳 Customers can view transaction and repayment history
- 📄 RESTful APIs designed for frontend consumption
- 🧩 Global exception handling and field validation mechanisms

---

## 📂 Project Structure

```plaintext
LoanManagementSystem-v2023-2/
├── src/
│   ├── main/
│   │   ├── java/com/johann/
│   │   │   ├── common/             # API response
│   │   │   ├── controller/         # REST API endpoints
│   │   │   ├── DTO/                # 
│   │   │   ├── service/            # Business logic layer
│   │   │   ├── model/              # JPA entities
│   │   │   ├── Repo/               # Data access layer
│   │   │   └── LoanManagementSystemV20232Application.java
│   │   └── resources/
│   │       ├── application.properties   
└── pom.xml                         # Maven configuration
