# JavaProject - Spring Boot REST API with H2 Database

A comprehensive university project demonstrating RESTful CRUD operations using Spring Boot, H2 Database, and Swagger UI for API documentation and testing.

## 📋 Table of Contents

- [Project Overview](#-project-overview)
- [Technologies Used](#%EF%B8%8F-technologies-used)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Installation & Setup](#-installation--setup)
- [Running the Application](#%EF%B8%8F-running-the-application)
- [API Documentation with Swagger](#-api-documentation-with-swagger)
- [H2 Database Console](#%EF%B8%8F-h2-database-console)
- [API Endpoints](#-api-endpoints)
- [Testing with Postman](#-testing-with-postman)
- [CRUD Operations Guide](#-crud-operations-guide)
- [Database Schema](#%EF%B8%8F-database-schema)
- [Screenshots](#-screenshots)
- [Troubleshooting](#-troubleshooting)
- [Contributors](#-contributors)
- [License](#-license)

---

## 🎯 Project Overview

This project is part of **Final Java Project** for university coursework. The goal is to build a RESTful API that demonstrates all CRUD (Create, Read, Update, Delete) operations on a resource, with changes reflected in an H2 in-memory database. The project includes:

- Implementation of REST API endpoints using Spring Boot
- Integration with H2 Database for data persistence
- Swagger UI for interactive API documentation
- Testing capabilities through Postman or similar tools
- Complete CRUD functionality demonstration

The application allows users to test all implemented methods (create, modify, delete) and observe their effects directly in the database through the H2 console.

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 11+ | Programming language |
| **Spring Boot** | 3.x | Application framework |
| **Spring Data JPA** | - | Data persistence layer |
| **Hibernate** | - | ORM framework |
| **H2 Database** | - | In-memory database |
| **Swagger/OpenAPI** | 3.0 | API documentation |
| **Maven** | - | Dependency management |
| **Lombok** (optional) | - | Code reduction |

---

## 📁 Project Structure

```
JavaProject/
├── src/
│   ├── main/
│       ├── java/
│       │   └── pl.edu.vistula.second_project/
│       │       │── product/
│       │       │   ├── api/
│       │       │   │   ├── ProductController.java
│       │       │   │   ├── request/
│       │       │   │   │   ├── ProductRequest.java
│       │       │   │   │   └── UpdateProductRequest.java
│       │       │   │   ├── response/
│       │       │   │   │   └── ProductResponse.java
│       │       │   ├── domain/
│       │       │   │   └── Product.java
│       │       │   ├── repository/
│       │       │   │   └── ProductRepository.java
│       │       │   ├── domain/
│       │       │   │   └── Product.java
│       │       │   ├── repository/
│       │       │   │   └── ProductRepository.java
│       │       │   ├── service/
│       │       │   │   └── ProductService.java
│       │       │   └── support/
│       │       │       ├── exception/
│       │       │       │   └── ProductNotFoundException.java
│       │       │       ├── ProductExceptionAdvisor.java
│       │       │       ├── ProductExceptionSupplier.java
│       │       │       └── ProductMapper.java
│       │       │── shared.api.response
│       │       │   └── ErrorMessageResponse.java
│       │       └── SecondProjectApplication.java
│       └── resources/
│           ├── application.properties
└── pom.xml
```

---

## ✅ Prerequisites

Before running this project, ensure you have the following installed:

- **Java Development Kit (JDK)** 17 or higher
- **Maven** 3.6+ or your IDE's built-in Maven
- **Git** (to clone the repository)
- **Postman** or similar API testing tool (optional but recommended)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code)

---

## 🚀 Installation & Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/S0ya13/JavaProject.git
cd JavaProject
```

### Step 2: Configure Dependencies

The project uses Maven for dependency management. Key dependencies in `pom.xml`:

```xml
<!-- Spring Boot Starter Web -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Spring Data JPA -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- H2 Database -->
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>

<!-- Swagger/OpenAPI Documentation -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.0</version>
</dependency>
```

### Step 3: Configure Application Properties

Update `src/main/resources/application.properties`:

```properties
# Server Configuration
server.port=8080

# H2 Database Configuration
spring.h2.console.enabled=true
spring.h2.console.path=/console/
spring.datasource.url=jdbc:h2:mem:testdb

# Logging Configuration
logging.level.org.hibernate.SQL=DEBUG

# Spring Configuration
spring.application.name=second_project
```

### Step 4: Build the Project

```bash
mvn clean install
```

---

## ▶️ Running the Application

### Using Maven

```bash
mvn spring-boot:run
```

### Using JAR file

```bash
java -jar target/JavaProject-0.0.1-SNAPSHOT.jar
```

### Using IDE

Right-click on `JavaProjectApplication.java` and select **Run**.

Once started, you should see output similar to:

```
Started JavaProjectApplication in X.XXX seconds
```

The application will run on: **http://localhost:8080**

---

## 📚 API Documentation with Swagger

### Accessing Swagger UI

After starting the application, navigate to:

**http://localhost:8080/swagger-ui/index.html**

[**SCREENSHOT PLACEHOLDER 1: Swagger UI Home Page**]
*Description: Main Swagger UI interface showing all available API endpoints*

### Swagger Features

- **Interactive API Testing**: Test endpoints directly from the browser
- **Request/Response Examples**: View sample payloads and responses
- **Schema Definitions**: Examine data models
- **Try It Out**: Execute requests with custom parameters

### OpenAPI JSON Specification

Access the raw OpenAPI specification at:

**http://localhost:8080/v3/api-docs**

[**SCREENSHOT PLACEHOLDER 2: OpenAPI JSON Response**]
*Description: Raw JSON output of API documentation*

---

## 🗄️ H2 Database Console

### Accessing H2 Console

Navigate to: **http://localhost:8080/console/**

[**SCREENSHOT PLACEHOLDER 3: H2 Console Login Screen**]
*Description: H2 database console login page*

### Login Credentials

Use the following settings to connect:

| Field | Value |
|-------|-------|
| **JDBC URL** | `jdbc:h2:mem:testdb` |
| **User Name** | `sa` |
| **Password** | *(leave empty)* |

[**SCREENSHOT PLACEHOLDER 4: H2 Console Connected View**]
*Description: H2 console after successful login showing database tables*

### Viewing Data

Once logged in, you can:

- Execute SQL queries to view data: `SELECT * FROM PRODUCTS`
- Observe changes after CRUD operations
- Verify database schema and constraints

[**SCREENSHOT PLACEHOLDER 5: SQL Query Results in H2 Console**]
*Description: Result of SELECT query showing product data*

---

## 🔌 API Endpoints

### Base URL

```
http://localhost:8080
```

### Available Endpoints

#### 1. **GET** - Retrieve All Products

```http
GET {{base_url}}/api/v1/products
```

**Response Example:**

```json
[
  {
    "id": 1,
    "name": "Product One"
  },
  {
    "id": 2,
    "name": "Product Two"
  }
]
```

#### 2. **GET** - Retrieve Product by ID

```http
GET {{base_url}}/api/v1/products/{id}
```

**Path Parameter:**
- `id` (Long) - Product identifier

**Response Example:**

```json
{
  "id": 1,
  "name": "Product One"
}
```

#### 3. **POST** - Create New Product

```http
POST {{base_url}}/api/v1/products
```

**Request Body:**

```json
{
  "name": "New Product"
}
```

**Response:** Created product with auto-generated ID

```json
{
  "id": 1,
  "name": "New Product"
}
```

#### 4. **PUT** - Update Existing Product

```http
PUT {{base_url}}/api/v1/products/{id}
```

**Path Parameter:**
- `id` (Long) - Product identifier

**Request Body:**

```json
{
  "name": "New name"
}
```

**Response:** Updated product

#### 5. **DELETE** - Remove Product

```http
DELETE {{base_url}}/api/v1/products/{id}
```

**Path Parameter:**
- `id` (Long) - Product identifier

**Response:** 
- Status: `204 Success without answer`

---

## 🧪 Testing with Postman

### Setting Up Postman

1. **Download Postman**: [https://www.postman.com/downloads/](https://www.postman.com/downloads/)
2. **Create a New Collection**: Name it "JavaProject API Tests"
3. **Set Base URL**: Create an environment variable: `base_url = http://localhost:8080`

### Test Scenarios

#### Scenario 1: Create a Product (POST)

[**SCREENSHOT PLACEHOLDER 6: Postman POST Request**]
*Description: Postman showing POST request to create a new product with request body*

**Steps:**
1. Select **POST** method
2. Enter URL: `{{base_url}}/api/v1/products`
3. Go to **Body** tab → Select **raw** → Choose **JSON**
4. Enter request body:
   ```json
   {
     "name": "Test Product"
   }
   ```
5. Click **Send**
6. Verify response status: `201 Created`

[**SCREENSHOT PLACEHOLDER 7: Postman POST Response**]
*Description: Response showing successfully created product with generated ID*

#### Scenario 2: Retrieve All Products (GET)

[**SCREENSHOT PLACEHOLDER 8: Postman GET All Request**]
*Description: GET request to retrieve all products*

**Steps:**
1. Select **GET** method
2. Enter URL: `{{base_url}}/api/v1/products`
3. Click **Send**
4. Verify response contains array of products

[**SCREENSHOT PLACEHOLDER 9: Postman GET All Response**]
*Description: Response showing list of all products in JSON format*

#### Scenario 3: Retrieve Single Product (GET)

[**SCREENSHOT PLACEHOLDER 10: Postman GET by ID Request**]
*Description: GET request with product ID in URL*

**Steps:**
1. Select **GET** method
2. Enter URL: `{{base_url}}/api/v1/products/1`
3. Click **Send**
4. Verify response contains specific product

#### Scenario 4: Update Product (PUT)

[**SCREENSHOT PLACEHOLDER 11: Postman PUT Request**]
*Description: PUT request with updated product data*

**Steps:**
1. Select **PUT** method
2. Enter URL: `{{base_url}}/api/v1/products/1`
3. Add request body with updated fields
4. Click **Send**
5. Verify updated data in response

[**SCREENSHOT PLACEHOLDER 12: Postman PUT Response**]
*Description: Response showing successfully updated product*

#### Scenario 5: Delete Product (DELETE)

[**SCREENSHOT PLACEHOLDER 13: Postman DELETE Request**]
*Description: DELETE request for specific product*

**Steps:**
1. Select **DELETE** method
2. Enter URL: `{{base_url}}/api/v1/products/1`
3. Click **Send**
4. Verify deletion message

[**SCREENSHOT PLACEHOLDER 14: Postman DELETE Response**]
*Description: Response confirming successful deletion*

### Verifying in H2 Database

After each operation, check the H2 console to verify database changes:

[**SCREENSHOT PLACEHOLDER 15: H2 Console After CREATE**]
*Description: Database table showing newly inserted record*

[**SCREENSHOT PLACEHOLDER 16: H2 Console After UPDATE**]
*Description: Database table showing modified record*

[**SCREENSHOT PLACEHOLDER 17: H2 Console After DELETE**]
*Description: Database table with record removed*

---

## 📖 CRUD Operations Guide

### Create (POST)

**Purpose:** Add new resources to the database

**Implementation:**
```java
@PostMapping
@Operation(summary = "Create product")
public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
}
```

**Testing:**
- Use POST method in Postman
- Provide JSON payload in request body
- Verify auto-generated ID in response
- Check H2 console for new record

### Read (GET)

**Purpose:** Retrieve existing resources

**Implementation - Get All:**
```java
@GetMapping
@Operation(summary = "Find all products")
public ResponseEntity<List<ProductResponse>> findAll() {
        List<ProductResponse> productResponses = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(productResponses);
}
```

**Implementation - Get by ID:**
```java
@GetMapping("/{id}")
@Operation(summary = "Find product by id")
public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        ProductResponse productResponse = productService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
}
```

**Testing:**
- Use GET method
- For single resource, include ID in URL path
- Verify data matches database records

### Update (PUT)

**Purpose:** Modify existing resources

**Implementation:**
```java
@PutMapping("/{id}")
@Operation(summary = "Update product by id")
public ResponseEntity<ProductResponse> update(@PathVariable Long id, @RequestBody UpdateProductRequest updateProductRequest) {
        ProductResponse productResponse = productService.update(id, updateProductRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
```

**Testing:**
- Use PUT method
- Include ID in URL path
- Provide complete updated object in body
- Verify changes in database

### Delete (DELETE)

**Purpose:** Remove resources from database

**Implementation:**
```java
@DeleteMapping("/{id}")
@Operation(summary = "Delete item")
public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
}
```

**Testing:**
- Use DELETE method
- Include ID in URL path
- Verify record removal in H2 console
- Attempting to GET deleted resource should return error

---

## 🗂️ Database Schema

### Product Table

| Column | Type | Constraints | Description |
|--------|------|-------------|-------------|
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique identifier |
| `name` | VARCHAR(255) |  | Product name |

### SQL Schema Example

```sql
CREATE TABLE products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);
```

---

## 📸 Screenshots

1. **Swagger UI Home Page** - Main API documentation interface
2. **OpenAPI JSON Specification** - Raw API documentation
3. **H2 Console Login** - Database console access
4. **H2 Console Connected View** - Database structure view
5. **SQL Query Results** - Data verification in database
6. **Postman POST Request** - Creating a new resource
7. **Postman POST Response** - Successful creation response
8. **Postman GET All Request** - Retrieving all resources
9. **Postman GET All Response** - List of all resources
10. **Postman GET by ID Request** - Retrieving single resource
11. **Postman PUT Request** - Updating a resource
12. **Postman PUT Response** - Successful update response
13. **Postman DELETE Request** - Deleting a resource
14. **Postman DELETE Response** - Successful deletion response
15. **H2 Console After CREATE** - New record in database
16. **H2 Console After UPDATE** - Modified record in database
17. **H2 Console After DELETE** - Removed record from database

---

## 🔧 Troubleshooting

### Common Issues and Solutions

#### Issue 1: Application Won't Start

**Error:** `Port 8080 is already in use`

**Solution:**
- Change port in `application.properties`:
  ```properties
  server.port=8081
  ```
- Or kill process using port 8080:
  ```bash
  # Windows
  netstat -ano | findstr :8080
  taskkill /PID <PID> /F
  
  # Linux/Mac
  lsof -i :8080
  kill -9 <PID>
  ```

#### Issue 2: H2 Console Not Accessible

**Error:** `Whitelabel Error Page` when accessing `/console/`

**Solution:**
- Ensure H2 console is enabled in `application.properties`:
  ```properties
  spring.h2.console.enabled=true
  ```
- Check the console path configuration

#### Issue 3: Swagger UI Not Loading

**Error:** 404 error on `http://localhost:8080/swagger-ui/index.html`

**Solution:**
- Verify Swagger dependency in `pom.xml`
- For Spring Boot 3.x, use: `/swagger-ui/index.html`
- Check application logs for Swagger initialization errors

#### Issue 4: Database Connection Failed

**Error:** `Unable to obtain connection from database`

**Solution:**
- Verify JDBC URL in `application.properties`
- Check H2 dependency is included
- Ensure no typos in database configuration

#### Issue 5: CRUD Operations Return 404

**Error:** `404 Not Found` for API endpoints

**Solution:**
- Verify controller annotations (`@RestController`, `@RequestMapping`)
- Check endpoint paths match your requests
- Review application startup logs for mapping information

---

## 👥 Contributors

- **S0ya13** - [GitHub Profile](https://github.com/S0ya13)
- Akademia Finansów i Biznesu Vistula - University Project

---

## 📄 License

This project is created for educational purposes as part of university coursework.

---

## 🙏 Acknowledgments

- Spring Boot Documentation: [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
- H2 Database Documentation: [https://www.h2database.com/](https://www.h2database.com/)
- Swagger/OpenAPI Documentation: [https://swagger.io/](https://swagger.io/)
- Postman Learning Center: [https://learning.postman.com/](https://learning.postman.com/)

---

## 📞 Contact & Support

For questions, issues, or contributions:

- **GitHub Issues**: [JavaProject Issues](https://github.com/S0ya13/JavaProject/issues)
- **Email**: osavcha1@stu.vistula.edu.pl

---

**Last Updated:** December 2025
