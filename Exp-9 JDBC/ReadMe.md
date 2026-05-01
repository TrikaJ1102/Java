# 🗄️ JDBC Database Connectivity (Java + MySQL)

## 📌 Overview

This project demonstrates how to connect a Java application to a MySQL database using **JDBC (Java Database Connectivity)**.
It performs basic **database operations using SQL queries**.

---

## 🎯 Objective

* To understand **JDBC architecture**
* To establish connection between Java and MySQL
* To execute **SQL queries using Java**
* To perform database operations programmatically

---

## 🛠️ Technologies Used

* **Java**
* **MySQL**
* **JDBC API**
* **SQL**

---

## 📂 Project Structure

```id="jdbc9"
Exp-9 JDBC/
│
├── JDBCProgram.java     → Java program for DB operations
├── JDBC SQL Part.sql   → SQL queries (table creation, insert, etc.)
├── ReadMe.md           → Documentation
```

---

## 🗄️ Database Details

* Database: MySQL
* Tables created using `.sql` file

---

## ⚙️ Features

* ✅ Establish database connection
* ✅ Execute SQL queries
* ✅ Insert data into database
* ✅ Retrieve data from database
* ✅ Demonstrate JDBC workflow

---

## 🔄 JDBC Workflow

1. Load JDBC Driver
2. Establish Connection
3. Create Statement
4. Execute Query
5. Process Results
6. Close Connection

---

## 🚀 How to Run

### 1. Setup Database

* Open MySQL
* Run:

```sql
source JDBC SQL Part.sql;
```

---

### 2. Add MySQL Connector

* Add MySQL Connector JAR to project

---

### 3. Compile Program

```id="jdbc9c"
javac JDBCProgram.java
```

---

### 4. Run Program

```id="jdbc9r"
java JDBCProgram
```

---

## 🖥️ Working Flow

1. Java program connects to MySQL database
2. Executes SQL queries
3. Displays results in console

---

## ⚠️ Important Notes

* Ensure MySQL server is running
* Update DB credentials in Java code
* Add JDBC driver before running

---

## 📚 Learning Outcomes

* Understanding of **JDBC connectivity**
* Execution of **SQL via Java**
* Real-world database interaction
* Backend development basics

---

## 👨‍💻 Author

**Name:** Trika Jaiswal

---

## 📝 Conclusion

This experiment provides practical knowledge of connecting Java applications with databases and executing SQL operations using JDBC.

