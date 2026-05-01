# 📦 Inventory Management System (Java - Adapter Pattern)

## 📌 Overview

This project implements an **Inventory Management System** using Java and demonstrates the use of the **Adapter Design Pattern**.
It integrates a **legacy system** with a **new product interface**, allowing seamless interaction between incompatible classes.

---

## 🎯 Objective

* To understand the **Adapter Design Pattern**
* To integrate **legacy code with modern systems**
* To manage inventory using object-oriented principles
* To implement abstraction and flexibility in design

---

## 🛠️ Technologies Used

* **Java**
* **OOP Concepts**
* **Design Patterns (Adapter Pattern)**

---

## 📂 Project Structure

```id="inv8"
Exp-8 Inventory/
│
├── Main.java              → Entry point
├── InventoryManager.java → Manages inventory operations
├── Product.java          → Interface for products
├── NewProduct.java       → New system product class
├── LegacyItem.java       → Old/legacy system class
├── ProductAdapter.java   → Adapter to connect legacy with new system
├── ReadMe.md             → Documentation
```

---

## 🧠 Concept Used: Adapter Pattern

The **Adapter Pattern** allows incompatible classes to work together by converting the interface of one class into another expected by the client.

👉 In this project:

* `LegacyItem` → Old system
* `Product` → Target interface
* `ProductAdapter` → Bridges the gap

---

## ⚙️ Features

* ✅ Add products to inventory
* ✅ Support for both **new and legacy products**
* ✅ Unified interface for product handling
* ✅ Demonstrates real-world design pattern usage

---

## 🚀 How to Run

### 1. Compile All Files

```id="inv8c"
javac *.java
```

### 2. Run the Program

```id="inv8r"
java Main
```

---

## 🖥️ Working Flow

1. Program starts from `Main.java`
2. Inventory manager is initialized
3. Products are added:

   * New products directly
   * Legacy items via adapter
4. Inventory is displayed/managed

---

## ⚠️ Important Notes

* Adapter pattern is useful when integrating **old systems with new code**
* Helps avoid modifying existing legacy code
* Improves code reusability and flexibility

---

## 📚 Learning Outcomes

* Understanding of **Design Patterns (Adapter)**
* Practical implementation of **OOP principles**
* Integration of **legacy and modern systems**
* Improved software design thinking

---

## 👨‍💻 Author

**Name:** Trika Jaiswal

---

## 📝 Conclusion

This experiment demonstrates how the Adapter pattern can be used to make incompatible classes work together, ensuring better maintainability and scalability of software systems.

