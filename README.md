# PalindromeCheckerApp

## Palindrome Checker App (Java Console Application)

### Objective
To build a console-based Java application that checks whether a string is a palindrome using multiple approaches across incremental use cases.

This project demonstrates **Git workflow + incremental development** using branches and pull requests.

---

## What is a Palindrome?

A palindrome is a word, phrase, or number that reads the same forward and backward.

**Examples**
- madam ✅
- racecar ✅
- hello ❌

---

# Use Case Implementations

## UC1 — Welcome Page
Displays application startup information.

**Features**
- Application name
- Version number
- Initialization message

**Concepts Used**
- Basic Java program structure
- Git branching & pull request workflow

---

## UC2 — Hardcoded Palindrome Check
Checks whether a hardcoded word is a palindrome using character comparison.

**Logic**
- Compare characters from start and end moving inward.

**Concepts Used**
- Loops
- `charAt()` method

---

## UC3 — Palindrome Using String Reverse
Checks palindrome by reversing the string.

**Logic**
1. Reverse the string
2. Compare original and reversed strings

**Concepts Used**
- String manipulation
- Reverse logic

---

## UC4 — Character Array Method
Checks palindrome using two-pointer technique on a character array.

**Logic**
- Convert string → char array
- Compare start and end pointers

**Concepts Used**
- Arrays
- Two-pointer algorithm

---

## UC5 — Stack Based Palindrome Checker
Uses **Stack (LIFO)** data structure.

**Logic**
1. Push characters into stack
2. Pop characters and compare

**Concepts Used**
- Stack
- LIFO principle

---

## UC6 — Queue + Stack Based Palindrome Checker
Uses both **Queue (FIFO)** and **Stack (LIFO)**.

**Logic**
1. Add characters to Queue and Stack
2. Remove from both and compare

If all match → Palindrome ✔️

**Concepts Used**
- Queue
- Stack
- FIFO vs LIFO

---

# Tech Stack
- Java (JDK 17)
- IntelliJ IDEA
- Git
- GitHub

---

# Git Workflow Followed

For each Use Case:

1. Created new feature branch
2. Implemented logic
3. Committed & pushed branch
4. Created Pull Request
5. Merged into `main`

### Branches Created
- UC1-WelcomePage
- UC2-HardcodedPalindrome
- UC3-StringReversePalindrome
- UC4-CharArrayPalindrome
- UC5-StackPalindrome
- UC6-QueueStackPalindrome

---

# How to Run

1. Open project in IntelliJ
2. Run `PalindromeCheckerApp.java`
3. Enter input in console

---

# Learning Outcome

This project demonstrates:

- Java fundamentals
- Multiple palindrome algorithms
- Stack & Queue data structures
- Professional Git workflow
- Branching & Pull Requests

---

**Project Status: Completed (UC1 – UC6)**