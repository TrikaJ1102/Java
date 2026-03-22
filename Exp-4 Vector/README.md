# ➗ Experiment 4: Vector Operations using Java (Exception Handling & OOP)

## 📌 Objective

To implement a Java program that performs vector operations while demonstrating:

* Object-Oriented Programming (OOP)
* Constructor validation
* User-defined exception handling
* Mathematical operations on vectors

---

## 🧠 Problem Statement

Design a `Vector` class that supports only **2D and 3D vectors**.

* If a vector of any other dimension is created, throw a user-defined exception `VectorException`.
* Implement vector operations:

  * Addition
  * Subtraction
  * Dot Product

Also ensure that operations are performed only on vectors of the same dimension.

---

## 🏗️ Class Structure

### 🔹 Vector Class

Attributes:

* Array to store vector components
* Dimension of the vector

Constructor:

* Accepts vector elements
* Validates dimension (only 2D or 3D allowed)
* Throws `VectorException` if invalid

Methods:

* `add(Vector v)` → returns a new Vector
* `subtract(Vector v)` → returns a new Vector
* `dotProduct(Vector v)` → returns a scalar value
* `checkDimension(Vector v)` → validates dimensions
* `display()` → prints vector values

---

### 🔹 VectorException Class

* Custom user-defined exception
* Thrown when:

  * Invalid dimension is used
  * Vector operations are attempted on mismatched dimensions

---

### 🔹 Main Class (Driver)

Responsibilities:

* Create Vector objects
* Perform vector operations
* Handle exceptions using `try-catch`
* Display results

---

## ⚙️ Key Concepts Used

* ✅ Classes and Objects
* ✅ Constructor Validation
* ✅ Custom Exception Handling
* ✅ Arrays
* ✅ Mathematical Computation
* ✅ Method Design

---

## 🔄 Working of the Program

1. Vector objects are created with given dimensions
2. Constructor checks if dimension is **2 or 3**

   * If not → throws `VectorException`
3. Before operations, dimensions are validated
4. Operations performed:

   * Addition → returns new vector
   * Subtraction → returns new vector
   * Dot Product → returns scalar
5. Results are displayed using `display()` method

---

## 📊 Sample Output

```id="p9k2xq"
Vector 1: (2, 3)
Vector 2: (4, 5)

Addition: (6, 8)
Subtraction: (-2, -2)
Dot Product: 23
```

---

## ⚠️ Important Observations

* Only **2D and 3D vectors** are allowed
* Dimension mismatch leads to `VectorException`
* Operations return **new objects**, preserving original data
* Dot product returns a **single scalar value**

---

## 🚀 Conclusion

This experiment demonstrates how mathematical concepts like vector operations can be implemented using Java OOP and exception handling. It highlights the importance of validation and error handling in building robust applications.

---

## 📁 Files Included

* `Vector.java`
* `VectorException.java`
* `Main.java` (or driver class)

---

## 🔮 Future Scope

* Extend to n-dimensional vectors
* Add cross product (for 3D vectors)
* Implement vector magnitude and normalization
* Build graphical visualization of vectors

---

