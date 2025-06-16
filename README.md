# 🧰 Side Projects & Mini‑Apps Repository

A curated collection of **Python *and Java* projects** built while learning core programming concepts, data structures, and problem‑solving. Each folder is self‑contained and includes its own README, source files, and sample usage.

---

## 📁 Projects Overview

| Project Folder         | Status      | Description                                                                                               |
| ---------------------- | ----------- | --------------------------------------------------------------------------------------------------------- |
| 🏦 **BankApp**         | ✅ Completed | Console‑based banking system (Java) featuring accounts, deposit/withdraw, and simple transaction history. |
| 💰 **Payroll**         | ✅ Completed | Company payroll calculator (Java); demonstrates inheritance, abstract classes, and polymorphism.          |
| 📇 **contacts\_book**  | ✅ Completed | Command‑line contact manager using Python dictionaries.                                                   |
| 🧠 **quiz\_cli**       | ✅ Completed | CLI general‑knowledge quiz with multiple‑choice questions.                                                |
| 🗃 **flashcard\_tool** | ✅ Completed | Flashcard utility for spaced repetition via the terminal.                                                 |
| 🧮 **calculator\_app** | ✅ Completed | Simple calculator CLI with input validation and error handling.                                           |
| 🏁 **hangman\_game**   | ✅ Completed | Classic hangman game implemented for the terminal in Python.                                              |
| ✅ **todo\_app**        | ✅ Completed | To‑Do list manager (Python) supporting add/remove, sort/search, and completion flags.                     |

> Every project folder has a dedicated `README.md` that details setup, features, and key learnings.

---

## 📦 Directory Structure (excerpt)

```
.
├── BankApp/
│   ├── src/
│   │   └── ...java
│   └── README.md
├── Payroll/
│   ├── src/
│   │   └── ...java
│   └── README.md
├── contacts_book/
│   └── contact_book.py
├── quiz_cli/
│   └── quiz.py
├── flashcard_tool/
│   └── flashcards.py
├── calculator_app/
│   └── calculator.py
├── hangman_game/
│   └── hangman.py
├── todo_app/
│   └── todo.py
└── README.md   # ← this file
```

---

## 🚀 Getting Started

Clone the repo and run any project:

```bash
git clone https://github.com/nolifer-jpg/Side_projects.git
cd Side_projects/BankApp   # example
# For Java projects
javac -d bin src/**/*.java
java -cp bin MainClass

# For Python projects
cd ../contacts_book
python contact_book.py
```

---

## 🧠 Key Learnings Across Projects

* **Python fundamentals**: control flow, functions, exception handling.
* **Java OOP**: inheritance, polymorphism, abstract classes, encapsulation.
* Building **CLI interfaces**.
* Basic **file I/O** and data persistence.
* Writing clean, modular code and detailed documentation.

---

## 🔧 Roadmap / Future Work

* Add unit tests for each project (PyTest / JUnit).
* Introduce persistent storage (JSON or a lightweight DB) for contacts\_book and todo\_app.
* Expand BankApp with interest calculation and simple authentication.
* Dockerize selected apps for easier deployment.

---

## 👤 Author

Built with 💻 and 💡 by **Souhard Roy**
🔗 [https://github.com/nolifer-jpg](https://github.com/nolifer-jpg)
Always open to feedback and collaboration!
