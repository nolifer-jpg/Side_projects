def main():
    while True:
        try:
            action = int(input("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\nWhat to do? "))
            if action == 1:
                x = int(input("Enter first number: "))
                y = int(input("Enter second number: "))
                print(f"Result: {add(x, y)}")
            elif action == 2:
                x = int(input("Enter first number: "))
                y = int(input("Enter second number: "))
                print(f"Result: {subtract(x, y)}")    
            elif action == 3:
                x = int(input("Enter first number: "))
                y = int(input("Enter second number: "))
                print(f"Result: {multiply(x, y)}")    
            elif action == 4:
                x = int(input("Enter first number: "))
                y = int(input("Enter second number: "))
                print(f"Result: {divide(x, y)}" )
            elif action == 5:
                print("Thank you for using our app!!!")
                break  
        except ValueError:
            print("Invalid input. Please enter a number.")

def add(x, y):
    return x+y


def subtract(x, y):
    return x-y


def multiply(x, y):
    return x*y


def divide(x, y):
    try:
        return x/y
    except ZeroDivisionError:
        return "Error: Cannot divide by zero."
    

main()    