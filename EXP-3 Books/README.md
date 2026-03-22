# 📚 Experiment 3: Book Management System using ArrayList & Exception Handling

## 📌 Objective

To implement a Java program demonstrating:

* Custom Exception Handling
* Constructors (with validation)
* ArrayList usage
* Object-Oriented Programming concepts

---

## 🧠 Problem Statement

Design a `Book` class with appropriate attributes and constructors.
Implement a user-defined exception `InvalidPriceException` which is thrown when the price of a book is negative.

Create multiple `Book` objects, store them in an `ArrayList`, and perform the following operations:

* Display all book details
* Calculate the average price of books
* Filter and display books of a specific genre (e.g., "Fiction")
* Handle invalid price using exception handling

---

## 🏗️ Class Structure

### 🔹 Book Class

Attributes:

* `title`
* `author`
* `price`
* `genre`

Constructors:

* Default Constructor
* Parameterized Constructor

  * Throws `InvalidPriceException` if `price < 0`

Methods:

* Getter methods
* `toString()` (for displaying book details)

---

### 🔹 InvalidPriceException Class

* Custom user-defined exception
* Thrown when book price is invalid (negative)

---

### 🔹 ArrayListOfBooks Class

Responsibilities:

* Create multiple `Book` objects
* Store them in an `ArrayList<Book>`
* Handle exceptions using `try-catch`
* Display all books
* Calculate average price
* Filter books by genre using `forEach()`

---

## ⚙️ Key Concepts Used

* ✅ Custom Exception (`InvalidPriceException`)
* ✅ Exception Handling (`try-catch`)
* ✅ ArrayList Collection
* ✅ Object-Oriented Programming
* ✅ Lambda Expression (`forEach`)
* ✅ Constructor Validation

---

## 🔄 Working of the Program

1. Book objects are created using constructors
2. If a negative price is passed → `InvalidPriceException` is thrown
3. Valid books are added to an `ArrayList`
4. The program:

   * Prints all book details
   * Calculates average price
   * Filters books by genre ("Fiction")

---

## 📊 Sample Output

```id="y8z3pq"
Book Details:
Title: ABC | Author: XYZ | Price: 500 | Genre: Fiction
Title: DEF | Author: LMN | Price: 300 | Genre: Non-Fiction

Average Price: 400.0

Fiction Books:
ABC
```

---

## ⚠️ Important Observations

* Negative price values are **not allowed**
* Custom exceptions improve **code reliability**
* ArrayList allows **dynamic storage of objects**
* `forEach()` simplifies iteration with lambda expressions

---

## 🚀 Conclusion

This experiment demonstrates how Java handles real-world problems using exception handling and collections. It also highlights how validation can be enforced at the object creation stage using constructors.

---

## 📁 Files Included

* `Book.java`
* `InvalidPriceException.java`
* `ArrayListOfBooks.java`

---

## 🔮 Future Scope

* Add search functionality (by title/author)
* Sort books based on price or genre
* Store data in files or databases
* Build GUI for book management

---

