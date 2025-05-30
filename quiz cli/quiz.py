def quiz():
    questions = {
        "What is the capital of France?": "A. Berlin\nB. London\nC. Paris\nD. Madrid",
        "What does len() do in Python?": "A. Returns the largest number\nB. Returns the number of items\nC. Deletes an element\nD. Appends an item",
        "What is 7 * 6?": "A. 42\nB. 36\nC. 48\nD. 40",
        "Which keyword is used to define a function in Python?": "A. func\nB. method\nC. def\nD. lambda",
        "What will 5 // 2 return in Python?": "A. 2.5\nB. 3\nC. 2\nD. 2.0"
    }

    answers = {
        "What is the capital of France?": "C",
        "What does len() do in Python?": "B",
        "What is 7 * 6?": "A",
        "Which keyword is used to define a function in Python?": "C",
        "What will 5 // 2 return in Python?": "C"
    }

    print("🧠 Welcome to the Quiz! Answer using A, B, C, or D.\n")
    correct = 0
    question_number = 1

    for ques in questions:
        print(f"Q{question_number}. {ques}")
        print(questions[ques])
        user_ans = input("Your Answer: ").strip().upper()

        if user_ans == answers[ques]:
            print("✅ Correct!\n")
            correct += 1
        else:
            print(f"❌ Wrong! Correct answer was: {answers[ques]}\n")

        question_number += 1

    print(f"🏁 You got {correct} out of 5 correct!")

# Run the quiz
quiz()
