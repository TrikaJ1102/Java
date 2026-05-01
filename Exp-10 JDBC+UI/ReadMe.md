# 🍽️ Restaurant Management System (JavaFX + JDBC)

## 📌 Overview

This project is a **JavaFX-based desktop application** that performs **CRUD operations (Create, Read, Update, Delete)** on a MySQL database using **JDBC**.
It provides a simple graphical interface to manage restaurants and their menu items.

---

## 🎯 Objective

* To understand **JDBC connectivity with MySQL**
* To build a **JavaFX GUI application**
* To perform **CRUD operations through UI**
* To integrate **frontend (JavaFX) with backend (Database)**

---

## 🛠️ Technologies Used

* **Java (JDK 8 or above)**
* **JavaFX**
* **MySQL**
* **JDBC (Java Database Connectivity)**

---

## 📂 Project Structure

```
MainApp.java          → Entry point (Main Menu UI)
RestaurantUI.java     → Restaurant CRUD UI
MenuItemUI.java       → Menu Item CRUD UI
RestaurantJDBC.java   → Database operations (JDBC)
```

---

## 🗄️ Database Details

* Database Name: `restaurant_db`

### Tables:

#### 1. Restaurant

| Column  | Type         |
| ------- | ------------ |
| Id      | INT (PK)     |
| Name    | VARCHAR(255) |
| Address | VARCHAR(255) |

#### 2. MenuItem

| Column | Type         |
| ------ | ------------ |
| Id     | INT (PK)     |
| Name   | VARCHAR(255) |
| Price  | DOUBLE       |
| ResId  | INT (FK)     |

---

## ⚙️ Features

* ✅ Insert new restaurant

* ✅ View all restaurants

* ✅ Update restaurant details

* ✅ Delete restaurant

* ✅ Insert menu items

* ✅ View all menu items

* ✅ Update menu items

* ✅ Delete menu items

* ✅ Filter menu items by price

---

## 🚀 How to Run

### 1. Setup Database

* Install MySQL
* Update credentials in:

```java
static final String USER = "root";
static final String PASS = "your_password";
```

---

### 2. Add MySQL Connector

* Download MySQL Connector JAR
* Add it to project libraries

---

### 3. Configure JavaFX

* Add JavaFX SDK
* Set VM options (if needed):

```
--module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml
```

---

### 4. Run the Application

* Run `MainApp.java`

---

## 🖥️ Application Flow

1. Launch app → Main Menu
2. Choose:

   * Manage Restaurants
   * Manage Menu Items
3. Perform CRUD operations via UI
4. Data is stored/retrieved from MySQL database

---

## 📸 Output

* Restaurant Table Operations (Insert, Update, Delete)
* Menu Item Table Operations (Insert, Update, Delete, Filter)

---

## ⚠️ Important Notes

* Ensure MySQL server is running
* Database will be **created automatically**
* Tables will be **created automatically**
* Foreign key constraint is applied between MenuItem and Restaurant

---

## 📚 Learning Outcomes

* Hands-on experience with **JDBC**
* Understanding of **JavaFX UI design**
* Implementation of **CRUD operations**
* Integration of **frontend and database**

---

## 👨‍💻 Author

**Name:** Trika Jaiswal
**PRN:** 24070126129

---

## 🔗 GitHub Repository

https://github.com/TrikaJ1102/Java/tree/main/Exp-10%20JDBC%2BUI

