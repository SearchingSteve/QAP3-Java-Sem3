# Sem3-QAP3-Java

# Table of Contents

1. [Introduction](#introduction)
2. [Project Structure](#project-structure)
3. [Problems Overview](#problems-overview)
   - [Problem 1: Inheritance with Person, Student, Teacher, and CollegeStudent Classes](#problem-1-inheritance-with-person-student-teacher-and-collegestudent-classes)
   - [Problem 2: Inheritance with Point and MovablePoint Classes](#problem-2-inheritance-with-point-and-movablepoint-classes)
   - [Problem 3: Abstract Shapes - Shape, Ellipse, Circle, Triangle, and EquilateralTriangle](#problem-3-abstract-shapes---shape-ellipse-circle-triangle-and-equilateraltriangle)
   - [Problem 4: Scalable Interface with Shapes](#problem-4-scalable-interface-with-shapes)
4. [How to Run the Code](#how-to-run-the-code)
5. [License](#license)
6. [Author](#author)


## Introduction 

This project includes solutions to four object-oriented programming problems as part of the **QAP assignment** for **Semester 3 - Java**. Each problem focuses on class design, inheritance, abstract classes, interfaces, and object composition using Java. The project also includes test drivers, documentation, and proof of output for each problem.



## Project Structure

- **Problem1/**: Contains the implementation of the `Person`, `Student`, `Teacher`, and `CollegeStudent` classes to demonstrate inheritance and method overriding, along with test drivers.
- **Problem2/**: Contains the implementation of the `Point` and `MovablePoint` classes, focusing on inheritance and method extension, along with test drivers.
- **Problem3/**: Contains implementations of various shapes (`Shape`, `Ellipse`, `Circle`, `Triangle`, and `EquilateralTriangle`), demonstrating abstract classes, method overriding, and polymorphism, with test drivers.
- **Problem4/**: Contains the `Scalable` interface and integrates it with `Shape` subclasses to demonstrate interface implementation and scaling, along with test drivers.
- **ProofOfWork/**: Contains output proofs for each problem, showing screenshots of the running code.
- **Feedback.md**: Contains responses to feedback questions regarding the difficulty, resources used, and confidence level.

## Problems Overview

### Problem 1: Inheritance with Person, Student, Teacher, and CollegeStudent Classes

In this problem, you’ll extend a `Person` superclass to create `Student`, `Teacher`, and `CollegeStudent` subclasses. Each subclass adds unique properties and methods, demonstrating inheritance and polymorphism.

- **Deliverables**:
  1. `Person.java`: Defines a base class with basic properties.
  2. `Student.java`: Extends `Person` to add student-specific properties.
  3. `Teacher.java`: Extends `Person` to add teacher-specific properties.
  4. `CollegeStudent.java`: Extends `Student` with additional college-related properties.
  5. `Demo.java`: A test driver to verify the functionality of each class.

- **Key Concepts**:
  - Class inheritance and extension.
  - Method overriding with `toString()` to display object details.

### Problem 2: Inheritance with Point and MovablePoint Classes

This problem demonstrates inheritance by creating a `Point` class, which is then extended by `MovablePoint` to add movement functionality.

- **Deliverables**:
  1. `Point.java`: Models a point with `x` and `y` coordinates.
  2. `MovablePoint.java`: Extends `Point` to add movement capabilities with speed attributes.
  3. `Demo.java`: A test driver to demonstrate movement functionality.

- **Key Concepts**:
  - Inheritance to extend a basic class.
  - Encapsulation of position and speed attributes.

### Problem 3: Abstract Shapes - Shape, Ellipse, Circle, Triangle, and EquilateralTriangle

In this problem, you’ll design an inheritance hierarchy of shapes using an abstract `Shape` class, and implement subclasses for various shapes with specific calculations for area and perimeter.

- **Deliverables**:
  1. `Shape.java`: An abstract class defining the structure of all shapes.
  2. `Ellipse.java`: Implements area and perimeter for ellipses.
  3. `Circle.java`: A subclass of `Ellipse` with identical major and minor axes.
  4. `Triangle.java`: Implements area and perimeter for general triangles.
  5. `EquilateralTriangle.java`: A subclass of `Triangle` with equal side lengths.
  6. `Demo.java`: A test driver to instantiate and test each shape.

- **Key Concepts**:
  - Abstract classes and methods.
  - Polymorphism through shared interfaces.
  - Specific implementations of area and perimeter calculations.

### Problem 4: Scalable Interface with Shapes

This problem introduces an interface `Scalable` that adds scaling functionality to the shape classes from Problem 3. Each shape’s dimensions are adjusted based on a scaling factor.

- **Deliverables**:
  1. `Scalable.java`: An interface with a `scale()` method for scaling dimensions.
  2. `Shape` subclasses implementing `Scalable`: Modify existing classes to scale properties.
  3. `Demo.java`: A test driver that scales each shape and prints the results before and after scaling.

- **Key Concepts**:
  - Interface implementation for flexible scaling.
  - Polymorphism with an array of `Scalable` shapes.
  - Testing of objects before and after scaling.

## How to Run the Code

1. Clone the repository:

   ```
   git clone https://github.com/YourUsername/QAP-Java-Sem3.git
   ```

2. Navigate to the respective problem directory and compile the code. For example, to compile and run Problem 1:

   ```
   cd QAP-Java-Sem3/Problem1
   javac Person.java Student.java Teacher.java CollegeStudent.java Demo.java
   java Demo
   ```

3. Similarly, navigate to the respective directories to compile and run each test driver:

   **Problem 2**:

   ```
   cd ../Problem2
   javac Point.java MovablePoint.java Demo.java
   java Demo
   ```

   **Problem 3**:

   ```
   cd ../Problem3
   javac Shape.java Ellipse.java Circle.java Triangle.java EquilateralTriangle.java Demo.java
   java Demo
   ```

   **Problem 4**:

   ```
   cd ../Problem4
   javac Scalable.java Shape.java Ellipse.java Circle.java Triangle.java EquilateralTriangle.java Demo.java
   java Demo
   ```

Each test driver will output the expected results for the problem it is testing.
"""

## License

This project is provided for **personal use only**. Redistribution, modification, or commercial use in any form is strictly prohibited without prior written permission from the author.

For detailed license terms, refer to the [LICENSE](./LICENSE.md) file.

## Author
- **[Stephen Crocker](https://github.com/SearchingSteve)** 
