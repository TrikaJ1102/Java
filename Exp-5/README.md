# 💻 Exp 5: Banking Application (Java)

## 📌 Objective
To design a banking system using Object-Oriented Programming concepts like inheritance, polymorphism, and encapsulation.

---

## 🧠 Concepts Used
- Classes & Objects
- Inheritance
- Method Overriding
- Encapsulation
- ArrayList (Collection Framework)

---

## 🏗️ Classes Implemented

### 1. Customer
- Stores customer details
- Holds multiple accounts

### 2. Account (Base Class)
- Attributes: accNo, balance, accType
- Methods:
  - deposit()
  - withdraw()

### 3. SavingsAccount (extends Account)
- Additional:
  - interestRate
  - minBalance
- Overrides:
  - withdraw()

### 4. LoanAccount (extends Account)
- Handles loan repayment
- Overrides:
  - deposit()
  - withdraw()

---

## ⚙️ Features
- Deposit & Withdraw
- Minimum Balance Check
- Loan Repayment System
- Multiple Accounts per Customer
- Consolidated Customer Account Display

---

## ▶️ Sample Output
