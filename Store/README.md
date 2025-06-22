# MiniStore Java Project

A beginner-friendly Java console app that simulates a mini inventory management system for a small store.

## 🧠 Features Implemented

- ✅ Add new products
- ✅ Merge quantities for duplicate products (case-insensitive)
- ✅ Update product prices by name
- ✅ Remove products by name
- ✅ Print all inventory items
- ✅ Calculate total inventory value
- ✅ Print low-stock alerts with a threshold

## 📂 Files

- `Product.java` – defines the Product class (name, price, quantity)
- `Store.java` – manages an array of Products and business logic
- `MiniStore.java` – test runner with sample usage and output

## 🧪 Sample Output

```
name= Pen, price= 10.0, quantity= 45
name= Notebook, price= 40.0, quantity= 5
Total = 850.0
Low stock items (threshold 10):
name= Notebook, price= 40.0, quantity= 5
```

## 🚀 How to Run

1. Clone the repo or copy the three `.java` files into your IDE.
2. Compile the project using `javac` or run directly in IntelliJ or VS Code.
3. Use the `main()` method inside `MiniStore.java` to test the logic.

## 💡 Skills Practiced

- Object-Oriented Programming (OOP) in Java
- Working with arrays of objects
- String comparisons and input validation
- Safe use of null checks and control flow
- Building real-world logic with simple tools

---

Built as part of my pre-college Java learning journey.