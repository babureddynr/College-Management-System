
# 🎓 College Management System

![College Management System](https://github.com/babureddynr/College-Management-System/blob/main/localhost_8080_index.html%20(1).png) <!-- Replace with your project image -->

## 🚀 Live Demo
Check out the live version of the College Management System: [Live Demo](https://babureddynr.github.io/spring-html-pages/) <!-- Replace with your live demo link -->

## 📸 Screenshots
![Homepage](https://github.com/babureddynr/College-Management-System/blob/main/localhost_8080_index.html%20(1).png) <!-- Replace with actual screenshots -->


## 📜 Description
The **College Management System** is a web application designed to efficiently manage college data. It allows administrators to add, view, and delete college information, streamlining the management of college records. Built using **Spring Boot** and **Thymeleaf**, this project demonstrates core CRUD (Create, Read, Update, Delete) operations.

### Features
- 📚 **View College List**: Display a list of colleges with details such as ID, name, address, and image.
- ➕ **Add New College**: A simple form to add new colleges to the database.
- ❌ **Delete College**: Option to remove college records from the database.
- 📱 **Responsive Design**: User-friendly and responsive HTML pages.

## 🛠 Technologies Used
- **Backend**: Spring Boot
- **Frontend**: Thymeleaf, HTML, CSS
- **Database**: MySQL
- **Version Control**: Git, GitHub

## 📦 API Endpoints
Here are the available API endpoints for interacting with the College Management System:

### College Endpoints
- **GET /api/colleges**: Retrieve a list of all colleges.
- **POST /api/colleges**: Add a new college.
  - **Request Body**:
    ```json
    {
      "name": "College Name",
      "address": "College Address",
      "imageUrl": "Image URL"
    }
    ```
- **DELETE /api/colleges/{id}**: Delete a college by ID.

## 🛠 Getting Started

### Prerequisites
- JDK 11 or higher
- Maven
- MySQL Database

### Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/babureddynr/College-Management-System.git
   cd College-Management-System
   ```
2. **Set up the database**:
   - Create a MySQL database named `college_management`.
   - Update the `application.properties` file with your database credentials.
3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```
4. **Access the application**:
   - Open your web browser and navigate to `http://localhost:8080/colleges`.

## 📧 Contact
For any questions or feedback, feel free to reach out:
- **Email**: your.email@example.com <!-- Replace with your email -->
- **GitHub**: [babureddynr](https://github.com/babureddynr) <!-- Replace with your GitHub profile -->

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.

## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Thank you for checking out the College Management System! 🎉
```
