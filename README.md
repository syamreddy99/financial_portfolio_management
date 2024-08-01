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
### Clients 👥
- **Get All Clients**: Retrieves a list of all clients.
- GET /api/clients: `GET http://localhost:9988/api/clients`
![Get All Clients](https://github.com/syamreddy99/images-/blob/main/Screenshot%20(56).png?raw=true)

## **Get Client by ID**: Retrieves a client by its ID.
- Example: `GET http://localhost:9988/api/clients`

![Get Client by ID](https://github.com/syamreddy99/images-/blob/main/Screenshot%20(57).png?raw=true)

## **Create a New Client**: Creates a new client.
`POST http://localhost:9988/api/clients`
- Example JSON:
  ```json
  {
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phoneNumber": "123-456-7890"
  }
## Delete a Client: Deletes a client by its ID.

  - DELETE /api/clients/Delete/{id} `DELETE http://localhost:9988/api/clients/Delete/2`
# Financial Advisors 💼
## Get All Financial Advisors: Retrieves a list of all financial advisors. 

 - GET /api/advisors `GET http://localhost:9988/api/advisors`
   
## Get Financial Advisor by ID: Retrieves a financial advisor by its ID.
- GET /api/advisors/{id} `GET http://localhost:9988/api/advisors/2`
## Create a New Financial Advisor: Creates a new financial advisor.
- POST /api/advisors `POST http://localhost:9988/api/advisors`
  ```json
  {
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "phoneNumber": "098-765-4321"
  }
## Delete a Financial Advisor: Deletes a financial advisor by its ID.
- DELETE /api/advisors/{id} `DELETE http://localhost:9988/api/advisors`

# Portfolios 📂
## Get All Portfolios: Retrieves a list of all portfolios.
- **Get All Portfolios**: `GET http://localhost:9988/api/portfolios`

## Get Portfolio by ID: Retrieves a portfolio by its ID.  
- **Get Portfolio By ID**: `GET http://localhost:9988/api/portfolios/{id}`
- 
## Create a New Portfolio: Creates a new portfolio.
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
## Delete a Portfolio: Deletes a portfolio by its ID.
-**DELETE Portfolio**: `DELETE http://localhost:9988/api/portfolios`

# Securities 💹
## Get All Securities: Retrieves a list of all securities.

- GET /api/securities `GET http://localhost:9988/api/securities`
  
## Get Security by ID: Retrieves a security by its ID.

- GET /api/securities/{id}  `GET http://localhost:9988/api/securities\{id}`

## Create a New Security: Creates a new security.
    ```json
    {
      "name": "AAPL",
      "category": "Stock",
      "purchaseDate": "2023-07-01",
      "purchasePrice": 150.00,
      "quantity": 10,
      "portfolio_id": 2
    }

## Delete a Security: Deletes a security by its ID.

- DELETE /api/securities/{id} `DELETE http://localhost:9988/api/securities\{id}`

# Getting Started 🚀

## Clone the repository:

    ````bash
    git clone https://github.com/yourusername/financial-portfolio-management.git

## Navigate to the project directory:
    ````bash
    cd financial-portfolio-management
## Build the project:
    ````bash
    mvn clean install
## Run the application:
    ````bash
    mvn spring-boot:run
## Access the API at:
    ````bash
    http://localhost:9988/api
# Contributing 🤝
- We welcome contributions! Please read our contributing guidelines for more details.
# Contact 📬
 - For any questions or suggestions, please feel free to reach out.

 - Gmail : `syamreddypenumallu@gmail.com `
 - Happy Coding! 🎉


