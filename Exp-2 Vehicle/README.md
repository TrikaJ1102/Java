# 🚗 Experiment 4: Vehicle Management System (Java OOP)

## 📌 Objective

To implement a Java program demonstrating Object-Oriented Programming (OOP) concepts such as:

* Classes and Objects
* Constructors (Default & Parameterized)
* Method Overloading
* Arrays of Objects
* Encapsulation (Getters/Setters)

---

## 🧠 Problem Statement

Design a `Vehicle` class with properties like brand name, model name, price, color, manufacturing code, etc.
Create multiple vehicle objects and perform operations such as:

* Calculating mileage
* Displaying vehicle details
* Executing vehicle actions (start, drive, stop)
* Storing multiple vehicles in an array

Finally, display **Brand Name, Model Name, Price, and Mileage in tabular format**.

---

## 🏗️ Class Structure

### 🔹 Vehicle Class

Attributes:

* `brandName`
* `modelName`
* `price`
* `color`
* `mfgCode`
* `auto`

Methods:

* `start()`
* `drive()`
* `stop()`
* `calcMileage()`
* `setMfgCode()`
* `getMfgCode()`

Constructors:

* Default Constructor
* Parameterized Constructors

---

### 🔹 MainForVehicle Class

Responsibilities:

* Create multiple vehicle objects (`v1`, `v2`, `v3`, `v4`)
* Modify object properties
* Store objects in an array (`myFleet`)
* Calculate mileage for each vehicle
* Display data in tabular format
* Call behavior methods (`start`, `drive`, `stop`)

---

## ⚙️ Key Concepts Used

* ✅ Object Creation
* ✅ Constructor Overloading
* ✅ Method Calling
* ✅ Array of Objects
* ✅ Data Encapsulation
* ✅ Reference Assignment (`v4 = v3`)

---

## 📊 Output Format

```
--------------------------------------------------------------
Brand        Model        Price        Mileage
--------------------------------------------------------------
Honda        XYZ          200000       18.33
Maruti       X Cross      200000       19.38
...
--------------------------------------------------------------
```

---

## ⚠️ Important Observations

* `v4 = v3` means both variables refer to the **same object**
* Any changes made using `v4` will also affect `v3`
* Mileage is calculated using different inputs for each vehicle
* Arrays are used to manage multiple objects efficiently

---

## 🚀 Conclusion

This experiment helps in understanding how Java OOP concepts work together to model real-world entities like vehicles. It also demonstrates how to manage multiple objects and present structured output using arrays and methods.

---

## 📁 Files Included

* `Vehicle.java`
* `MainForVehicle.java`

---

