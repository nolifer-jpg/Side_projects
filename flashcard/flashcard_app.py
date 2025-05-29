import random
def main():
    flashcards = {}
    while True:
        try:
            action = int(input("1. Add Flashcard\n2. View all Flashcard\n3. Quiz me\n4. Exit\nWhat to do? "))
            if action == 1:
                add_flashcard(flashcards)
            elif action == 2:
                view_all_flashcards(flashcards)
            elif action == 3:
                quiz_mode(flashcards)  
            elif action == 4:
                break          
        except ValueError:
            print("Invalid input. Please enter a number.")    


def add_flashcard(flashcards):
    ques = input("Question: ")
    ans = input("Answer: ")
    flashcards[ques]= ans
    return "Added question and answer"

def view_all_flashcards(flashcards):
    if not flashcards:
        print("No flashcard to show.")
    else:
        for ques, ans in flashcards.items():
            print(ques, "->", ans)

def quiz_mode(flashcards):
    length = len(flashcards)
    random_ques = random.randint(0, length-1)
    print(f"Question: {list(flashcards.keys())[random_ques]}")
    ans = input("Enter the answer: ")
    if ans == list(flashcards.values())[random_ques]:
        print("You got it right !!!!")
    else:
        print("Sorry, its not the right answer.")



main()