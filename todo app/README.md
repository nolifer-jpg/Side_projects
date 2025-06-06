# 📝 CLI To-Do App (Python)

A simple command-line To-Do list manager built using Python. This project helps you learn how to work with **lists**, **dictionaries**, **functions**, **input validation**, and **basic algorithms** like **Selection Sort** — all while solving a real-world problem.

---

## 🚀 Features

- ✅ Add tasks with priority (1–5) and optional due date
- 📋 List all tasks, sorted by priority (lowest number = highest priority)
- ✅ Mark tasks as completed
- 🔍 Search tasks by name
- 🛡️ Input validation and error handling
- 📦 Uses list of dictionaries to store task data in memory

---

## 📦 How Tasks Are Stored

Tasks are stored as dictionaries inside a list, like this:

```python
tasks = [
  {"name": "Finish project", "priority": 2, "status": "Not Done", "due date": "2025-06-15"},
  {"name": "Clean desk", "priority": 4, "status": "Done", "due date": None}
]
```

---

## 💻 Example Usage

```bash
Press 1 for adding task
Press 2 for listing task
Press 3 for marking down completed task
Press 4 for searching task
Press 5 for exiting task
```

### ➕ Add Task
```
Enter task name: Finish DSA Sheet
Enter priority from 1 to 5: 2
Do you want to add due date? y/n: y
Enter Due Date: 2025-06-10
```

### 📋 List Tasks
```
---- TO-DO LIST ----
1. [2] Finish DSA Sheet — Not Done (Due: 2025-06-10)
```

### ✔️ Mark as Done
```
Enter the index of the task you want to mark as done: 1
Task Finish DSA Sheet marked as done.
```

### 🔍 Search
```
Enter the name of the task: Finish DSA Sheet
1. [2] Finish DSA Sheet — Done (Due: 2025-06-10)
```

---

## 📚 What You’ll Learn

- Working with Python collections (`list`, `dict`)
- Designing menu-driven CLI apps
- Implementing selection sort on dictionaries
- Modular code with reusable functions
- Input validation and edge case handling

---

## 📈 Future Improvements

- Save tasks to a file (e.g. `tasks.json`)
- Add task categories or tags
- Support editing or deleting tasks
- Color-coded terminal output (with `colorama`)

---

## 🙌 Author

Built by **Souhard Roy** as part of a daily challenge to improve programming fundamentals and build real-world projects.

🔗 GitHub: [@nolifer-jpg](https://github.com/nolifer-jpg)  
🔗 LinkedIn: [Souhard Roy](https://www.linkedin.com/in/souhard-roy-654456361)  
🔗 X: [@souhard_roy](https://x.com/souhard_roy)
