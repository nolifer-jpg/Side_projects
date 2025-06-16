# Payroll System (Java OOP Demo)

A tiny **Java** program that demonstrates fundamental object‑oriented concepts—**inheritance, abstraction, and polymorphism**—through a simple company payroll calculation.

---

## 🗂️ Project Structure
```
src/
 └─ oops_implementation/
     ├─ Employee.java           (abstract base class)
     ├─ SalariedEmployee.java   (annual‑salary formula)
     ├─ HourlyEmployee.java     (hourly‑rate formula)
     ├─ CommissionEmployee.java (base + commission formula)
     └─ MainPayroll.java        (program entry‑point)
```

### Class Diagram
```
                 ┌─────────────────────┐
                 │   «abstract»        │
                 │     Employee        │
                 │─────────────────────│
                 │ - name : String     │
                 │─────────────────────│
                 │ + monthlyPay() : double  «abstract» │
                 │ + toString() : String              │
                 └─────────▲───────────┘
          ┌───────────────┼───────────────┐
          │               │               │
┌─────────────────┐ ┌─────────────────┐ ┌──────────────────────┐
│ SalariedEmployee │ │ HourlyEmployee │ │ CommissionEmployee   │
│─────────────────│ │─────────────────│ │──────────────────────│
│ - annualSalary  │ │ - hourlyRate    │ │ - baseSalary         │
│                 │ │ - hoursWorked   │ │ - commission         │
│─────────────────│ │─────────────────│ │──────────────────────│
│ + monthlyPay()  │ │ + monthlyPay()  │ │ + monthlyPay()       │
└─────────────────┘ └─────────────────┘ └──────────────────────┘
```

---

## 💡 How It Works
1. **`Employee`** is an _abstract_ superclass holding common data (`name`) and declaring the abstract method `monthlyPay()`.
2. Each concrete subclass implements its **own pay formula** while reusing the `name` field via `super(name)`.
3. In `MainPayroll`, we store different employee types in a **single `Employee[]` array**.  
   When we call `monthlyPay()` or `toString()` on each element, Java’s _dynamic dispatch_ picks the correct subclass method at run‑time.
4. The loop also sums all returns from `monthlyPay()` to produce the total payroll.

---

## 🏗️ Build & Run
```bash
# from project root
javac src/oops_implementation/*.java
java  -cp src oops_implementation.MainPayroll
```

---

## 🖥️ Sample Output
```
name= Aria, pay= 70000.0
name= Ben,  pay= 48000.0
name= Chloe,pay= 43000.0
Total payroll = $161000.0
```

---

## 🚀 Possible Extensions
- Add **tax deductions** or **benefits** to each employee type.
- Persist employee data to a **database** or **JSON** file.
- Build a simple CLI menu for adding/removing employees at run‑time.

---

*Happy coding!*  
