# MIT 6.0001 Problem Set 2: Hangman

This repository contains my implementation of Problem Set 2 from the MIT 6.0001 (Introduction to Computer Science and Programming in Python) course. The assignment involves building a fully interactive Hangman game using Python.

## 🧩 Problem Overview

You are tasked with implementing a console-based version of the classic game **Hangman**. The player attempts to guess a secret word, one letter at a time, within a limited number of guesses and warnings.

### Key Features:
- Displays the number of guesses and warnings left.
- Shows available letters that haven't been guessed.
- Penalizes incorrect guesses and repeated guesses.
- Extra penalty for guessing wrong vowels.
- Displays the partially guessed word after each round.
- Tracks total score based on remaining guesses and unique letters.

## 🚀 Files Included

- `hangman.py`: Main Python file containing the implementation of the Hangman game logic.
- `words.txt`: Dictionary of words to choose the secret word from.
- `MIT6_0001F16_Pset2.pdf`: Original problem statement PDF provided by MIT.

## 📌 Requirements

- Python 3.x
- No external libraries required

## 💡 How to Run

Run the following command in the terminal:

```bash
python hangman.py
```

You can set your own `secret_word` for testing inside the script.

## 📚 Learning Outcomes

- String manipulation and conditionals
- Looping and control flow
- Modular programming using helper functions
- User input validation
- Game design basics using the command line

---

> This problem set strengthens fundamental programming skills and is a core part of the MIT 6.0001 curriculum.
