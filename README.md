# Brazilian Funds Management

This is a Spring Boot application for managing Brazilian funds. The application uses MongoDB as the database and provides a RESTful API for CRUD operations on funds.

## Getting Started

### Prerequisites

- Java 17
- MongoDB
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/blopa/brazilian-funds-management.git
    cd brazilian-funds-management
    ```

2. Install dependencies:
    ```sh
    mvn install
    ```

3. Configure MongoDB connection in `src/main/resources/application.properties`:
    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/br_funds_db
    ```

4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## API Endpoints

- `GET /api/funds` - Get all funds
- `GET /api/funds/{id}` - Get fund by ID
- `POST /api/funds` - Create a new fund
- `PUT /api/funds/{id}` - Update a fund
- `DELETE /api/funds/{id}` - Delete a fund

## Future Features

- Bearer authentication
- Basic front-end for API calls

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License.
