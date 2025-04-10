# Hostel Management System – Backend

This is the backend implementation of a feature-rich Hostel Management System built using **Spring Boot** and **MySQL**. The application supports various user roles such as Student, Warden, Admin, and Maintenance Staff, each with tailored access.

This backend powers key features like complaint booking, sick food requests, and roommate preference collection — all managed through secure REST APIs.

---

## Feature Overview (Backend Only)

- **Complaint Booking System**  
  Students can submit complaints; wardens and staff can view and resolve them.

- **Sick Food Request**  
  Students can request food when unwell. Wardens and admins manage approvals.

- **Roommate Preference Matching**  
  Students submit lifestyle and preference data for future roommate matching.

- **Role-Based Login**  
  Users (Student, Admin, Warden, Maintenance) log in with role-restricted access.

---

## Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web + Spring Data JPA**
- **MySQL**
- **REST APIs (JSON)**

---


## Database Tables Used

- `user_mst` – stores user accounts and roles  
- `role_mst` – defines permissions for each user role  
- `complaint_mst` – complaint records filed by students  
- `food_request_mst` – sick food requests  
- `roommate_preferences` – lifestyle preferences for roommate matching  

---

## How to Run (Backend Only)

1. Create a MySQL database named `hostelmanagement`.
2. Import the schema from the provided `.sql` script.
3. Open the Spring Boot project in your IDE.
4. Update `application.properties` with your DB credentials.
5. Run the application. Server will start on `http://localhost:8080`.

---

## Sample API Endpoints

- `POST /api/users/login` – Login
- `POST /api/complaints` – Submit a complaint
- `POST /api/food-requests` – Raise a sick food request
- `POST /api/roommate-preferences` – Submit roommate preference form

---

## Notes

- This is a backend-only setup.
- Passwords are stored as plain text (for now).
- No email or notification system included.

---

Designed for internal use. Meant to be simple. Built to make life easier.
