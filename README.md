# Equals and HashCode Contract Implementation

This repository demonstrates a clean and correct implementation of the `equals()` and `hashCode()` contract in Java for custom objects with floating-point parameters (`double`).

## Key Features & Concepts Standardized:
- **`equals()` Contract Validation:**
  - Reflexivity, symmetry, transitivity, and consistency checks.
  - Reference equality check (`this == o`).
  - `null` and exact class match verification via `getClass()`.
  - Proper type casting.
  - Safe `double` primitive comparison using `Double.compare()` to handle NaN and floating-point edge cases.
- **`hashCode()` Consistency:**
  - Synchronized hash code generation using `Objects.hash()` based on fields involved in `equals()`.

## Usage
Run `Main.java` to observe object comparison and hash code parity logic in action.
