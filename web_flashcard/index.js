currentIndex =0
const flashcards= [{question:"What is a variable?", answer:"A named container to store data."},
    {question:"What does console.log() do?", answer:"Prints output to the browser's console."},
    {question:"What is the DOM?", answer:"The Document Object Model — a structured representation of HTML."},
    {question:"What is a function?", answer:"A block of code that performs a task when called."},
    {question:"What is an array?", answer:"A list-like structure that can hold multiple values."},
]

document.getElementById("Ques").textContent = flashcards[0].question

const answer = document.getElementById("MyButton")
answer.addEventListener("click", function(e){document.getElementById("Ans").textContent = "Answer: " + flashcards[currentIndex].answer})

const nextQ = document.getElementById("nextQues")
nextQ.addEventListener("click", function(e){document.getElementById("Ques").textContent = printques()
    document.getElementById("Ans").textContent =""
})

function printques(){
    currentIndex++
    if (currentIndex === flashcards.length){
        currentIndex = 0
    }
    return flashcards[currentIndex].question
}

