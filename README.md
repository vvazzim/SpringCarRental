
# SpringCarRental

This is a simple REST web service for a car rental application built with Spring Boot and Gradle. The application allows users to:

- Get a list of unrented cars.
- Rent a car.
- Return a car.

## Features

1. **Get the list of unrented cars**  
   - Endpoint: `GET /cars`  
   - Response (JSON):
     ```json
     [
       { "plateNumber": "11AA22", "brand": "Ferrari", "price": 100, "rented": false },
       { "plateNumber": "33BB44", "brand": "Porsche", "price": 150, "rented": false }
     ]
     ```

2. **Get the details of a car**  
   - Endpoint: `GET /cars/{plateNumber}`  
   - Response (JSON):
     ```json
     { "plateNumber": "11AA22", "brand": "Ferrari", "price": 100, "rented": false }
     ```

3. **Rent a car**  
   - Endpoint: `PUT /cars/{plateNumber}?rent=true`  
   - Request Body:
     ```json
     {
       "begin": "11/11/2017",
       "end": "1/1/2018"
     }
     ```

4. **Return a car**  
   - Endpoint: `PUT /cars/{plateNumber}?rent=false`

---

## Requirements

- JDK 17 or 21 (OpenJDK or Oracle JDK)
- Gradle 7.x+
- Spring Boot 2.6.6 or later

---

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/vvazzim/SpringCarRental.git
   ```

2. Navigate to the project directory:
   ```bash
   cd SpringCarRental
   ```

3. Build the project using Gradle:
   ```bash
   ./gradlew build
   ```

4. Run the application:
   ```bash
   ./gradlew bootRun
   ```

The application will be running on **http://localhost:8080** (or **http://localhost:8081** if you've changed the port).

---

## Testing the API

Once the application is running, you can test the following endpoints using a browser or API testing tool like [Postman](https://www.postman.com/) or `curl`.

- **Get the list of cars**:  
  GET `http://localhost:8080/cars`

- **Get a specific car's details**:  
  GET `http://localhost:8080/cars/11AA22`

- **Rent a car**:  
  PUT `http://localhost:8080/cars/11AA22?rent=true`  
  Include a JSON body like:
  ```json
  {
    "begin": "11/11/2017",
    "end": "1/1/2018"
  }
  ```

- **Return a car**:  
  PUT `http://localhost:8080/cars/11AA22?rent=false`

---

## License

This project is licensed under the MIT License - see the LICENSE file for details.
