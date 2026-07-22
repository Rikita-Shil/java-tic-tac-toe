# Java Tic-Tac-Toe 🎮

A Java Tic-Tac-Toe project demonstrating the concept of abstraction through a simple command-line game.

---

## 📌 Overview

This project is a simple command-line Tic-Tac-Toe game developed in Java to demonstrate the **abstraction** principle in Object-Oriented Programming (OOP).

The game allows two players to play Tic-Tac-Toe by taking turns entering positions on a 3×3 board. The program automatically validates moves, switches players, checks for winners, and detects draws.

---

## 🎯 Learning Objective

The purpose of this project is to understand how **abstraction** helps simplify program design by separating complex logic into reusable methods.

Instead of writing all the logic inside the `main()` method, responsibilities are divided into methods such as:

- `printBoard()` – Displays the game board.
- `checkWinner()` – Determines whether a player has won.
- `main()` – Controls the overall game flow.

This makes the program easier to read, maintain, and extend.

---

## 🛠 Features

- Command-line interface
- Two-player gameplay (X and O)
- Automatic player switching
- Input validation
- Prevents invalid moves
- Winner detection
- Draw detection
- Modular design using abstraction

---

## 📂 Project Structure

```
Java-Tic-Tac-Toe/
│
├── TicTacToe.java
├── .gitignore
└── README.md
```

---

## ▶️ How to Run

### 1. Compile the program

```bash
javac TicTacToe.java
```

### 2. Run the program

```bash
java TicTacToe
```

---

## 🎮 Example Board

```
0 | 1 | 2
--+---+--
3 | 4 | 5
--+---+--
6 | 7 | 8
```

Players enter a position from **0–8**.

Example:

```
Current player: X
Enter a position from 0 to 8:
4
```

---

## 💻 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Command-Line Interface (CLI)

---

## 🧠 OOP Concept Demonstrated

### Abstraction

This project demonstrates abstraction by hiding complex game logic inside reusable methods.

Instead of placing every statement inside `main()`, the program separates responsibilities into dedicated methods.

Examples include:

- Printing the board
- Checking for a winner
- Managing player turns
- Validating user input

This improves readability, maintainability, and code organization.

---

## 🚀 Future Improvements

Possible enhancements include:

- Single-player mode with AI
- Graphical User Interface (Java Swing or JavaFX)
- Score tracking
- Restart game option
- Better input handling
- Minimax AI algorithm

---

## 👩‍💻 Author

**Rikita Shil**

Bachelor of Engineering (Software Engineering) (Honours)  
Macquarie University

GitHub: https://github.com/Rikita-Shil

---

## 📄 License

This project is for educational purposes and demonstrates the abstraction principle in Java.
