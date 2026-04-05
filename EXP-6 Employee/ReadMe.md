# 🚀 Employee Management System (Java OOP)

## 📌 Problem Statement

Create an Employee class as a root class with attributes such as name, PAN number, joining date, designation, employee ID, etc., and include an abstract method `calcCTC()`.

Develop:

* `FullTimeEmployee` and `ContractEmployee` as child classes
* Override `calcCTC()` based on role and employment type
* Create a `Manager` class as a subclass of `FullTimeEmployee`

---

## 🧠 Concepts Used

* Abstraction
* Inheritance
* Method Overriding
* Polymorphism
* Encapsulation

---

## 🏗️ Class Structure

### 🔹 Employee (Abstract Class)

* Attributes:

  * `name`
  * `PANNo`
  * `joiningDate`
  * `designation`
  * `empId`
* Method:

  * `calcCTC()` (abstract)

---

### 🔹 FullTimeEmployee (Extends Employee)

* Additional Attributes:

  * `baseSalary`
  * `perfBonus`
  * `hiringCommission`
  * `role`

* CTC Calculation:

  * **SWE** → `baseSalary + perfBonus`
  * **HR** → `baseSalary + hiringCommission`

---

### 🔹 ContractEmployee (Extends Employee)

* Additional Attributes:

  * `noOfHours`
  * `hourlyRate`

* CTC Calculation:

  * `CTC = noOfHours × hourlyRate`

---

### 🔹 Manager (Extends FullTimeEmployee)

* Additional Attributes:

  * `TA` (Travel Allowance)
  * `eduAllowance`

* CTC Calculation:

  * `CTC = baseSalary + perfBonus + TA + eduAllowance`

---

## 📁 Project Structure

```
Employee.java
FullTimeEmployee.java
ContractEmployee.java
Manager.java
Main.java
```

---

## ⚙️ How to Run

1. Open project folder in VS Code
2. Compile all Java files:

   ```bash
   javac *.java
   ```
3. Run the program:

   ```bash
   java Main
   ```

---

## 📊 Sample Output

```
Name: Rahul
PAN No: ABCDE1234F
Joining Date: 01-01-2023
Designation: Engineer
Employee ID: 101
CTC: 60000.0

Name: Anita
PAN No: XYZAB5678K
Joining Date: 15-03-2022
Designation: HR
Employee ID: 102
CTC: 47000.0

Name: Ravi
PAN No: LMNOP9876Q
Joining Date: 10-06-2023
Designation: Consultant
Employee ID: 103
CTC: 60000.0

Name: Priya
PAN No: AAAAA1111A
Joining Date: 05-05-2021
Designation: Manager
Employee ID: 104
CTC: 93000.0
```

---

## 🎯 Key Learnings

* Understanding abstract classes and their importance
* Implementing inheritance hierarchy in Java
* Overriding methods for different behaviors
* Designing reusable and scalable code

---

## 💡 Conclusion

This project demonstrates how object-oriented programming concepts like abstraction and inheritance can be used to design a flexible employee management system. Different employee types calculate their CTC differently, showcasing polymorphism in action.

---

## 👨‍💻 Author
TRIKA JAISWAL


