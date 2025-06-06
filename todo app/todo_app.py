def main():
    tasks =[]
    while True:
        print("Press 1 for adding task\nPress 2 for listing task\nPress 3 for marking down completed task\nPress 4 for searching task\nPress 5 for exiting task")
        choice = int(input("What do you want to do? "))
        if choice == 1:
            tasks.append(add_task())
        elif choice == 2:
            list_tasks(tasks)
        elif choice == 3:
            mark_done(tasks)
        elif choice == 4:
            search_task(tasks)
        elif choice == 5:
            print("Thank you for using us!")
            break        
        
def add_task():
    due_date = None
    status = "Not Done"
    task_name = input("Enter task name: ").strip()
    while True:
        try:
            priority = int(input("Enter priority from 1 to 5: "))
        except ValueError:
            print("Enter a number from 1 to 5!!!")  
        else:
            if priority < 1 or priority > 5:
                print("Priority must be between 1 and 5!")
                continue
            break      
    choice = input("Do you want to add due date? y/n: ").strip().lower()
    if choice.startswith("y"):
        due_date = input("Enter Due Date: ")
    task = {"name": task_name, "priority": priority, "status": status, "due date": due_date}
    return task 

def list_tasks(task_list):
    if len(task_list) ==0:
        return "No tasks available"
    else:
        print("---- TO-DO LIST ----")
        selection_sort(task_list)
        for i in range(1, len(task_list)+1):
            task = task_list[i-1]
            print(f"{i}. [{task['priority']}] {task['name']} — {task['status']} (Due: {task['due date'] or 'No due date'})")
    

def selection_sort(lst):
    for i in range(len(lst)-1):
        min_value = i
        for j in range(i+1, len(lst)):
            if lst[j]["priority"]<lst[min_value]["priority"]:
                min_value = j
        if min_value != i:
            lst[i], lst[min_value] = lst[min_value], lst[i]        
    return lst                         

def mark_done(task_list):
    if len(task_list)== 0:
        print("No tasks to mark as done.")
    else:
        while True:
            try:
                idx = int(input("Enter the index of the task you want to mark as done."))
            except ValueError:
                print("Please enter an integer.")
            else:
                if idx <1 or idx> len(task_list):
                    print("Invalid task number.")
                    continue
                break
        task = task_list[idx-1]
        if task["status"] == "Done":
            print("This task is already marked as done.")
        else:
            task["status"] = "Done"
            print(f"Task {task['name']} marked as done.")
    return task

def search_task(task_list):
    inp = input("Enter the name of the task: ").strip().lower()
    found = False
    for i in range(len(task_list)):
        task= task_list[i]
        if task["name"].lower() == inp:
            found = True
            print(f"{i+1}. [{task['priority']}] {task['name']} —{task['status']} Due: ({task['due date'] or 'No due date'}) ")
    if not found:
        print("Task not found")



main()    