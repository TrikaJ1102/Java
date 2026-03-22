# 🏦 Experiment 5: Banking Application using Java (OOP & Inheritance)

## 📌 Objective

To design and implement a banking system in Java demonstrating:

* Inheritance
* Method Overriding
* ArrayList usage
* Object-Oriented Programming concepts

---

## 🧠 Problem Statement

Design a banking application with the following class structure:

* `Customer`
* `Account` (Base Class)
* `SavingsAccount` (extends Account)
* `LoanAccount` (extends Account)

Implement methods:

* `deposit()`
* `withdraw()`

Override these methods in child classes where required.

In the main class:

* Create multiple customers and accounts
* Store them using `ArrayList`
* Display consolidated account information for each customer

---

## 🏗️ Class Structure

### 🔹 Customer Class

Attributes:

* `customerId`
* `customerName`
* List of accounts associated with the customer

Responsibilities:

* Store and manage customer details
* Link multiple accounts to a single customer

---

### 🔹 Account Class (Base Class)

Attributes:

* `accountNumber`
* `balance`

Methods:

* `deposit(amount)`
* `withdraw(amount)`

---

### 🔹 SavingsAccount Class (Child Class)

* Inherits from `Account`
* Overrides:

  * `withdraw()` (may include minimum balance constraint)

---

### 🔹 LoanAccount Class (Child Class)

* Inherits from `Account`
* Overrides:

  * `deposit()` (repayment logic)
  * `withdraw()` (loan disbursement logic)

---

### 🔹 Main Class

Responsibilities:

* Create `Customer` objects
* Create `SavingsAccount` and `LoanAccount` objects
* Store them in `ArrayList`
* Display all customer-account relationships
* Perform transactions

---

## ⚙️ Key Concepts Used

* ✅ Inheritance (`extends`)
* ✅ Method Overriding
* ✅ Polymorphism
* ✅ ArrayList Collection
* ✅ Object-Oriented Design
* ✅ Encapsulation

---

## 🔄 Working of the Program

1. Customers are created
2. Accounts are created and linked to customers
3. Transactions performed:

   * Deposit
   * Withdraw
4. Method overriding ensures:

   * Different behavior for savings and loan accounts
5. All data is stored in `ArrayList`
6. Program displays consolidated account details for each customer

---

## 📊 Sample Output

```id="k3m9xp"
Customer: Trika
Account Type: SavingsAccount
Balance: 5000

Customer: Trika
Account Type: LoanAccount
Balance: -20000

-----------------------------------
Customer: John
Account Type: SavingsAccount
Balance: 8000
```

---

## ⚠️ Important Observations

* One customer can have **multiple accounts**
* Method overriding enables **different behaviors**
* Loan accounts may have **negative balance (loan amount)**
* ArrayList helps manage dynamic data efficiently

---

## 🚀 Conclusion

This experiment demonstrates how real-world systems like banking can be modeled using Java OOP concepts such as inheritance, polymorphism, and collections. It highlights how different account types can share common behavior while implementing specialized functionality.

---

## 📁 Files Included

* `Customer.java`
* `Account.java`
* `SavingsAccount.java`
* `LoanAccount.java`
* `Main.java`

---

## 🔮 Future Scope

* Add interest calculation for savings accounts
* Implement transaction history
* Add database integration
* Build GUI or web-based banking system
* Add authentication and security features

---
