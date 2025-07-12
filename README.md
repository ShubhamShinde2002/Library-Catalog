
### Prerequisites
- Java 8 or higher
- Maven 3.x
- IDE (e.g., IntelliJ IDEA or VS Code)

### Steps to Run
1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/library-catalog.git
   cd library-catalog

2. **Build and Run with Maven**
   mvn spring-boot:run

3.**Access API**
   Visit: http://localhost:8080/books


### Sample API Requests and Responses

 Add a New Book
Endpoint: POST /books

Request Body:
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "available": true
}
Response:

{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "available": true
}

Get All Books
Endpoint: GET /books

Response:


[
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "isbn": "9780132350884",
    "available": true
  }
]


Get Book by ID
Endpoint: GET /books/{id}

Example: GET /books/1

Response:
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "available": true
}


Delete a Book
Endpoint: DELETE /books/{id}

Example: DELETE /books/1

Response:1

Update Book Availability
Endpoint: PUT /books/{id}/availability?available=false

Example: PUT /books/1/availability?available=false

Response:
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "available": false
}