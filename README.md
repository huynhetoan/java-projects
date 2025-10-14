# Java Projects

A collection of Java applications showcasing GUI development, file I/O, object-oriented modeling, and data analytics.

## Overview

These projects demonstrate practical Java skills across multiple domains — from interactive interfaces to backend logic and data processing. Each project is modular, well-documented, and built with clarity and reusability in mind.

---

## Projects

### CoffeeShop

A GUI-based Java application simulating a digital coffee shop ordering system.

#### Features
- Built with `JFrame`, `JPanel`, and `GridLayout`
- Modular windows for ordering and viewing items
- Action listeners for responsive button behavior
- Exit confirmation dialog for safe closure

#### Technologies
- Java Swing
- Event-driven programming
- GUI layout management

#### Learning Outcomes
Practiced GUI design, user interaction handling, and modular window logic.

---

### UABSystem

A console-based employee management system that reads from `uabEmployee.txt` and allows users to manage staff records interactively.

#### Features
- Parses employee data into multiple `ArrayList`s
- Supports adding, updating, deleting, and displaying employees
- Uses helper methods in `UABPerson` class for abstraction
- Handles multiple roles: Faculty, Student, Advisor, ITProfessional, Doctor

#### Technologies
- Java I/O
- ArrayLists and object-oriented design
- Role-based class hierarchy

#### Learning Outcomes
Built a multi-role management system with clean separation of concerns and reusable methods.

---

### EmployeeDataAnalyzer

A data analytics tool that processes employee records from a CSV file and outputs insights.

#### Features
- Parses `employee_data.csv` into department objects
- Calculates average salary per department
- Identifies longest-tenured employees and department leads
- Filters employees by years of service

#### Technologies
- Java file I/O
- CSV parsing
- Object modeling and aggregation

#### Learning Outcomes
Applied data processing techniques to extract meaningful insights from structured input.

---

## How to Run

Each project is self-contained. To run:

```bash
javac ProjectName.java
java ProjectName
