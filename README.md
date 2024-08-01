# Financial Portfolio Management Application 📈


A Spring Boot-based application designed to manage financial portfolios, clients, and securities efficiently.

## 📦 Prerequisites

Before you begin, ensure you have met the following requirements:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ☕
- [Maven](https://maven.apache.org/download.cgi) 📦
- [MySQL](https://dev.mysql.com/downloads/installer/) 🛢️
- [Postman](https://www.postman.com/downloads) (optional, for API testing) 🧪

## 💻 Technologies Used

- ☕ **Java 17** ![Java](https://img.shields.io/badge/-Java-007396?style=flat&logo=java&logoColor=white)
- 🖥️ **Spring Boot** ![SpringBoot](https://img.shields.io/badge/-SpringBoot-6DB33F?style=flat&logo=springboot&logoColor=white)
- 🗃️ **Hibernate** ![Hibernate](https://img.shields.io/badge/-Hibernate-59616B?style=flat&logo=hibernate&logoColor=white)
- 🛢️ **MySQL** ![MySQL](https://img.shields.io/badge/-MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
- 📦 **Apache Maven** ![Maven](https://img.shields.io/badge/-Maven-C71A36?style=flat&logo=apache-maven&logoColor=white)
- 📝 **Lombok** ![Lombok](https://img.shields.io/badge/-Lombok-2C2D72?style=flat&logo=lombok&logoColor=white)

## 📊 API Endpoints

### Portfolio Management

- **Get All Portfolios**: `GET http://localhost:9988/api/portfolios`
- **Get Portfolio By ID**: `GET http://localhost:9988/api/portfolios/{id}`
- **Create Portfolio**: `POST http://localhost:9988/api/portfolios`
  ```json
  {
    "client": {
      "id": 1,
      "name": "John Doe",
      "email": "john.doe@example.com",
      "phoneNumber": "123-456-7890"
    },
    "securities": []
  }

