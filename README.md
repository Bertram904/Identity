# 🛡️ Identity Service

> **Identity Service** is a comprehensive microservice designed to handle the core aspects of user identity, ensuring secure authentication and granular authorization within the system architecture.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Framework-Spring_Boot_3.2.x-green)
![Docker](https://img.shields.io/badge/Container-Docker-blue)
![Database](https://img.shields.io/badge/Database-MySQL-lightgrey)

---

## 📌 Features

This service acts as the centralized authority for user management, providing the following key capabilities:

* **👥 User Onboarding**: Streamlined process for registering new users and managing user profiles.
* **🔐 Authentication**: Secure login mechanisms and identity verification.
* **🛡️ RBAC (Role-Based Access Control)**: Flexible management of Roles and Permissions to control access to resources effectively.

---

## 🛠 Tech Stack

Built with the latest technologies to ensure performance and maintainability:

| Component | Technology | Version |
| :--- | :--- | :--- |
| **Language** | Java | 21 |
| **Framework** | Spring Boot | 3.2.x |
| **Build Tool** | Maven | >= 3.9.5 |
| **Database** | MySQL | 8.0 |
| **Deployment** | Docker | Latest |

---

## 🚀 Getting Started

### Prerequisites
* **Java SDK 21**
* **MySQL Server**
* **Maven**

### Build & Run Locally

1.  **Build the application:**
    ```bash
    mvn clean package
    ```

2.  **Start the application:**
    ```bash
    mvn spring-boot:run
    ```

---

## 🐳 Docker Support

The application is fully containerized for easy deployment.

### 1. Build & Push Image
```bash
# Build the image
docker build -t <your-account>/identity-service:0.9.0 .

# Push to Docker Hub (optional)
docker image push <your-account>/identity-service:0.9.0