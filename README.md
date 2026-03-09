A robust, enterprise-standard backend system built with Java 21 and Spring Boot 3.3.1. This project provides a comprehensive RESTful API for managing and querying English Premier League player statistics, utilizing a highly scalable Controller-Service-Repository architecture.

🚀 Technical Stack
Language: Java 21 (LTS)
Framework: Spring Boot 
Build Tool: Maven
Database: PostgreSQL
ORM: Spring Data JPA / Hibernate
Testing: Spring Boot Starter Test

🏗️ Architecture & Design Patterns
The application follows the Three-Tier Architecture to ensure a clean separation of concerns:
Controller Layer: Handles incoming REST requests and maps them to specific business logic.
Service Layer: Implements core business logic using Java Streams API for high-performance data filtering and manipulation.
Repository Layer: Leverages Spring Data JPA for seamless interaction with the PostgreSQL database, including custom query methods.

Full CRUD Functionality: Create, Read, Update, and Delete player records via REST endpoints.
Advanced Filtering: Dynamic search capabilities to filter players by Name, Team, Position, and Nationality.
Data Persistence: Integrated PostgreSQL database with automated schema mapping via JPA entities.
Transactional Integrity: Implements @Transactional to ensure data consistency during delete and update operations.
Scalable API Design: Clean, versioned API paths (/api/v1/player) following REST best practices.

🛠️ Setup & Installation
Prerequisites
Java 21 JDK
Maven 3.x
PostgreSQL 15+

1. Database Configuration
Create a PostgreSQL database and update the src/main/resources/application.properties file:

spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


📡 API Endpoints
Method	Endpoint	Description
GET	/api/v1/player	Retrieve all players (Supports params: team, name, position, nation)
POST	/api/v1/player	Add a new player to the database
PUT	/api/v1/player	Update an existing player's details
DELETE	/api/v1/player/{name}	Remove a player record by name


1. Database Configuration
Create a PostgreSQL database and update the src/main/resources/application.properties file:

Properties

spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name

spring.datasource.username=your_username

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

2. Build and Run

# Clone the repository
git clone https://github.com/your-username/premier-zone-api.git

# Navigate to project directory
cd premier-zone-api

# Build the project
mvn clean install
# Run the application
mvn spring-boot:run
