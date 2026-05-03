# Java Calculator with GUI

A simple desktop calculator built in Java with Swing, supporting the four 
basic arithmetic operations through an interactive graphical interface.

## Overview

Single-window application that takes two numeric inputs and performs addition, 
subtraction, multiplication or division based on the user's selection. 
Includes input validation, error handling for invalid numbers, and a guard 
against division by zero.

## Features

- Two input fields for the operands and one read-only field for the result
- Four operation buttons: Add, Subtract, Multiply, Divide
- Clear button to reset all fields
- Exit button to close the application
- Division-by-zero protection with a user-facing error dialog
- Input validation — non-numeric values trigger an error message instead of crashing

## Technical Details

| Aspect | Implementation |
|---|---|
| Framework | Java Swing (`JFrame`, `JTextField`, `JButton`, `JLabel`, `JOptionPane`) |
| Layout | `FlowLayout` for simple, predictable component arrangement |
| Event Handling | Implements `ActionListener` to dispatch button events |
| Threading | Uses `SwingUtilities.invokeLater` to ensure the GUI runs on the Event Dispatch Thread |
| Error Handling | `try/catch` on `NumberFormatException` plus an explicit zero-division check |

## How to Run

1. Make sure you have Java JDK installed (version 8 or higher)
2. Compile the source file:
```bash
