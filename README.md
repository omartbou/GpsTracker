# GPS Tracker Backend

This is the backend for the GPS Tracker application built with Spring Boot, using JDK 21 and Maven. It provides a REST API to fetch GPS coordinate data from a database.

## Features

- **REST API Endpoint:**  
  Provides an endpoint `/api/gpscoordinates` to retrieve a list of GPS coordinates from the database.
- **CORS Support:**  
  Configured to allow cross-origin requests (using `@CrossOrigin`), which is useful for integration with front-end applications like Ionic/Angular.
- **Spring Data Integration:**  
  Uses Spring Data JPA (or a similar persistence framework) to interact with the database.

## Prerequisites

- **Java Development Kit (JDK) 21**  
- **Maven 3.x**  
- A relational database configured with the appropriate tables (e.g., a table for GPS coordinates).

## Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd <repository-folder>
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```
