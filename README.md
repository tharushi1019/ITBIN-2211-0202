# Lesson Planning System Project

This is a **Lesson Planning System** built for the **Object-Oriented Programming (OOP)** module. The system is designed to help manage teachers, subjects, and lessons in an educational environment. The application is built using **Java** and **MySQL** and follows the **MVC (Model-View-Controller)** architecture.

## Features

### Admin Interface
- **Login**: Admins can log in with their credentials.
- **Manage Teachers**: Admins can add and view teachers, and assign usernames and passwords for each teacher.
- **Manage Subjects**: Admins can add new subjects and view existing ones.
- **Manage Lessons**: Admins can add, view, and update lessons associated with subjects, and search for lessons by date.

### Teacher Interface
- **Login**: Teachers can log in with their provided credentials.
- **View Teachers & Subjects**: Teachers can view other teachers and the subjects available in the system.
- **Manage Lessons**: Teachers can add new lessons, set lesson dates and topics, view lessons by date, and update lessons.

## Technologies Used
- **Java**: Core language used for developing the application logic.
- **MySQL**: Database management system used to store teacher, subject, and lesson data.
- **MVC Architecture**: The application follows the MVC architecture for separation of concerns.
  - **Model**: Handles database connection and operations.
  - **View**: Provides user interfaces for login, admin home, and teacher home screens.
  - **Controller**: Manages the interaction between the model and view.

## Code Structure

The code is organized into the following packages to ensure clarity and maintainability:
- **Controller Package**: Contains the controllers that manage the flow of data between the model and the view. Examples include `LessonController`, `LoginController`, `SubjectController`, and `TeacherController`.
- **Model Package**: Contains classes responsible for database connections, searching, and other database-related operations.
- **View Package**: Contains the user interfaces for logging in, admin home, and teacher home screens. These interfaces allow users to interact with the system.

## Demo Video
A full demonstration of the system's features and functionalities can be found on the YouTube link below:

[Lesson Planning System Project Demo](https://www.youtube.com/watch/SFTkt60iBoQ)

## How to Run
1. **Set up MySQL Database**: Create a MySQL database and configure the database connection in the application.
2. **Build and Run the Project**: Use a Java IDE like Eclipse or IntelliJ IDEA to build and run the project. Make sure MySQL is running and accessible.
3. **Login as Admin or Teacher**: After the application is running, log in using the credentials for admin or teacher to access the respective functionalities.

## Summary
This system simplifies the management of teachers, subjects, and lessons for educational institutions, offering efficient tools for both administrators and teachers to interact with and manage lesson plans.
