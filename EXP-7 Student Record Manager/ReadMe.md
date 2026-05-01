# 🎓 Student Record Manager (Java)

## 📌 Overview

This project is a **Java-based Student Record Management System** that performs basic **CRUD operations** (Create, Read, Update, Delete) on student data stored in a **CSV file**.
It demonstrates file handling and data manipulation using Java.

---

## 🎯 Objective

* To understand **file handling in Java**
* To perform **CRUD operations using CSV files**
* To manage student records efficiently
* To practice **Java programming concepts**

---

## 🛠️ Technologies Used

* **Java**
* **CSV File Handling**
* **OOP Concepts**

---

## 📂 Project Structure

```id="w4kq7z"
EXP-7 Student Record Manager/
│
├── ReadMe.md          → Project documentation
├── StudentCRUD.java   → Main Java program (CRUD logic)
├── Students.csv       → Data storage file
```

---

## 📄 CSV File Format

The `Students.csv` file stores student data in the following format:

```id="f2j8qv"
ID,Name,Age,Course
101,John,20,AIML
102,Ananya,19,CS
```

---

## ⚙️ Features

* ✅ Add new student record
* ✅ View all student records
* ✅ Update existing student record
* ✅ Delete student record
* ✅ Store and retrieve data using CSV file

---

## 🚀 How to Run

### 1. Compile the Program

```id="9m1k3a"
javac StudentCRUD.java
```

### 2. Run the Program

```id="x8p2ls"
java StudentCRUD
```

---

## 🖥️ Working Flow

1. Program starts with a menu
2. User selects operation:

   * Add Student
   * View Students
   * Update Student
   * Delete Student
3. Data is read/written to `Students.csv`
4. Output is displayed in console

---

## ⚠️ Important Notes

* Ensure `Students.csv` exists in the same directory
* Data is stored permanently in CSV file
* Avoid duplicate IDs for consistency

---

## 📚 Learning Outcomes

* Understanding of **Java File I/O**
* Implementation of **CRUD operations without database**
* Working with **CSV file format**
* Improved **problem-solving using Java**

---

## 👨‍💻 Author

**Name:** Trika Jaiswal

---

## 📝 Conclusion

This project demonstrates how Java can be used to build a simple **data management system without using a database**, relying on file handling techniques for persistent storage.

