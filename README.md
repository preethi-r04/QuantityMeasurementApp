# Quantity Measurement Application

A Spring Boot–based Quantity Measurement Application developed incrementally using Use Cases (UC1–UC18).  
The project demonstrates clean architecture, object-oriented design, unit conversion logic, database integration, Spring Boot development, JWT authentication, and secure REST API implementation.

---

# 📌 Project Overview

The application supports:
- Quantity comparison
- Unit conversion
- Arithmetic operations on quantities
- Temperature, weight, and volume measurements
- N-Tier layered architecture
- Database persistence
- Spring Boot REST APIs
- JWT Authentication & Authorization
- Swagger API documentation

The project evolved step-by-step through multiple feature branches following industry-level backend development practices.

---

# 🚀 Tech Stack

- Java 17
- Maven
- Spring Boot 3.x
- Spring Security
- JWT (JSON Web Token)
- Swagger / OpenAPI
- H2 Database
- JDBC
- JPA
- REST APIs

---

# 📂 Git Branches / Use Cases

## Core Quantity Measurement

| Use Case | Branch |
|---|---|
| UC1 - Feet Equality | `feature/UC1-feetequality` |
| UC2 - Feet and Inches Equality | `feature/UC2-feetandinchesequality` |
| UC3 - Generic Quantity | `feature/UC3-genericquantity` |
| UC4 - Extended Units | `feature/UC4-extendedunits` |
| UC5 - Unit Conversion | `feature/UC5-unitconversion` |
| UC6 - Length Addition | `feature/UC6-length-addition` |
| UC7 - Add Target Unit | `feature/UC7-add-targetunit` |
| UC8 - Refactor Length Unit | `feature/UC8-refactor-lengthunit` |
| UC9 - Weight Measurement | `feature/UC9-weightmeasurement` |
| UC10 - Generic Quantity Refactor | `feature/UC10-genericquantity` |
| UC11 - Volume Measurement | `feature/UC11-volume-measurement` |
| UC12 - Subtraction & Division | `feature/UC12-subtraction-division` |
| UC13 - Centralized Arithmetic | `feature/UC13-centralized-arithmetic` |
| UC14 - Temperature Measurement | `feature/UC14-temperature-measurement` |

---

## Architecture & Backend Enhancements

| Use Case | Branch |
|---|---|
| UC15 - N-Tier Architecture | `feature/uc15-ntier-architecture` |
| UC16 - Database Integration (JDBC) | `feature/uc16-dbintegration` |
| UC17 - Spring Boot JPA Integration | `feature/uc17-springboot-jpa` |
| UC18 - JWT Authentication & Authorization | `develop` |

---

# 🏗️ UC15 - N-Tier Architecture

Implemented professional layered architecture:
- Controller Layer
- Service Layer
- Repository Layer
- Entity / DTO Layer

Benefits:
- Separation of Concerns
- Scalability
- Maintainability
- Better Testing Support

---

# 🗄️ UC16 - JDBC Database Integration

Features:
- Persistent storage using JDBC
- H2 Database integration
- Repository pattern implementation
- SQL-based CRUD operations
- Database schema initialization

---

# 🌱 UC17 - Spring Boot JPA Integration

Features:
- Spring Data JPA
- Entity management
- Repository abstraction
- Automatic database handling
- Improved persistence layer

---

# 🔐 UC18 - Spring Security + JWT Authentication

Features:
- Spring Security integration
- JWT-based authentication
- Stateless session management
- BCrypt password encryption
- Login & Registration APIs
- Protected APIs
- Role-based authorization
- Swagger integration
- DTO validation
- Secure REST API architecture

---
