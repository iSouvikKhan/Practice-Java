# Practice-Java

A small repository of Java practice exercises demonstrating core object-oriented concepts.

## Contents

### Farmer Wants Loan

`Farmer Wants Loan/Farmer.java` calculates simple interest on a loan at a fixed rate of 6.8% using a `FarmerExpenses` class. It demonstrates:

- A static block (initializes the shared interest rate)
- An instance initializer block (counts and prints the number of objects created)
- A default constructor that reads the principal and duration (in years) from the keyboard
- Parameterized constructors, including constructor chaining with `this(...)` (the one-argument constructor defaults the duration to 4 years)

The `main` method creates three objects: one from user input, one with principal 100 for 4 years, and one with principal 200 (defaulting to 4 years), and prints the simple interest for each.

## Prerequisites

- JDK 8 or later

## How to Run

The source file declares `package Assignment_4;`, so compile it into an output folder and run it by its fully qualified name. From the repository root:

```bash
javac -d out "Farmer Wants Loan/Farmer.java"
java -cp out Assignment_4.Farmer
```

These commands work the same on Windows, Linux, and macOS.

When prompted, enter the principal amount and the time duration in years (whole numbers).
