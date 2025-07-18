# Addition Microservice

A Spring Boot microservice that provides addition operations, built with reactive programming using Spring WebFlux.

## Overview

This microservice is part of a larger microservices architecture and provides mathematical addition functionality through RESTful endpoints. It's built using Spring Boot 3.3.2 and leverages reactive programming principles with Spring WebFlux.

## Technologies Used

- **Java 17**: Modern Java version with enhanced features
- **Spring Boot 3.3.2**: Framework for building production-ready applications
- **Spring WebFlux**: Reactive web framework for building non-blocking applications
- **Project Lombok**: Reduces boilerplate code with annotations
- **Maven**: Build automation and dependency management
- **Reactor Test**: Testing framework for reactive components

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (or use the included Maven wrapper)
- IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/gurubaladhinesh/addition.git
cd addition
```

### Build the Project

Using Maven wrapper (recommended):
```bash
./mvnw clean install
```

Using system Maven:
```bash
mvn clean install
```

### Run the Application

Using Maven wrapper:
```bash
./mvnw spring-boot:run
```

Using system Maven:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080` by default.

## API Endpoints

### Health Check
- **GET** `/actuator/health` - Check application health status

### Addition Operations
(Note: Specific endpoints will be documented here once implemented)

## Project Structure

```
addition/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/techguru/microservices/addition/
│   │   │       └── AdditionApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/techguru/microservices/addition/
├── .gitignore
├── pom.xml
└── README.md
```

## Configuration

The application uses Spring Boot's default configuration. You can customize settings in `src/main/resources/application.properties` or by setting environment variables.

Common configuration options:
- `server.port`: Change the default port (8080)
- `logging.level.com.techguru.microservices.addition`: Set logging level

## Testing

Run all tests:
```bash
./mvnw test
```

Run tests with coverage:
```bash
./mvnw test jacoco:report
```

## Docker Support

To containerize the application:

1. Create a Dockerfile in the project root:
```dockerfile
FROM openjdk:17-jdk-slim
COPY target/addition-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

2. Build and run:
```bash
./mvnw clean package
docker build -t addition-microservice .
docker run -p 8080:8080 addition-microservice
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Development Guidelines

- Follow Java naming conventions
- Write unit tests for new features
- Use Lombok annotations to reduce boilerplate code
- Implement reactive patterns with WebFlux
- Keep endpoints RESTful and well-documented

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For questions or support, please contact the development team.

---

**Note**: This is a demo project for learning Spring Boot microservices architecture.
