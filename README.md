# Addition Microservice

A Spring Boot microservice that provides addition functionality using reactive programming with WebFlux.

## Overview

This microservice is part of a microservices architecture and provides mathematical addition operations. It's built using Spring Boot 3.3.2 with reactive programming principles using Spring WebFlux.

## Technology Stack

- **Spring Boot**: 3.3.2
- **Java**: 17
- **Spring WebFlux**: For reactive web programming
- **Project Lombok**: For reducing boilerplate code
- **Maven**: Build tool and dependency management

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (or use the included Maven wrapper)

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

Or using your local Maven installation:
```bash
mvn clean install
```

### Run the Application

Using Maven wrapper:
```bash
./mvnw spring-boot:run
```

Or using your local Maven installation:
```bash
mvn spring-boot:run
```

The application will start on port 8080 by default.

## API Endpoints

*Note: API endpoints will be documented here once implemented*

## Configuration

The application uses Spring Boot's default configuration. You can customize settings by:

1. Modifying `application.properties` or `application.yml` in `src/main/resources`
2. Using environment variables
3. Using command-line arguments

## Development

### Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/techguru/microservices/addition/
│   └── resources/
└── test/
    └── java/
        └── com/techguru/microservices/addition/
```

### Running Tests

```bash
./mvnw test
```

## Docker

*Docker configuration will be added in future releases*

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For questions or support, please contact the development team.

---

*This microservice is part of a larger microservices ecosystem for mathematical operations.*
