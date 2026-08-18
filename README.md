# Unit 8 Lab 2 - Number Program

## Student Name
Nicholas Prosdocimo

## GitHub Repository URL
https://github.com/Prosdocimo-N/cmsc115_unit8_lab2

---

## Reconstruction Notice

The official UMGC Virtual Lab project and instructor-provided `NumberProgramTest.java`
could not be accessed because the embedded Microsoft login repeatedly refused to
connect. I used ChatGPT to reconstruct comparable JUnit tests from the behavior
explicitly described in the Unit 8 Lab 2 instructions. These reconstructed tests
are not represented as the original instructor-provided tests. If the original
test file becomes available, it should supersede the reconstructed version.

---

# Initial Starter Project

## What is included in the starter project?
- `NumberProgram.java` with an unimplemented `findResult(int[] values)` method.
- A reconstructed `NumberProgramTest.java` based on the lab instructions.
- This README reflection file.
- Maven configuration for Java 21 and JUnit 5.

## Initial commit message
`Initial starter project with reflection file`

---

# Iteration 1

## What does the AI-generated code do?
- The initial AI-generated implementation loops through the array and adds each integer to a running total, then returns the sum.

## Which tests passed or failed?
- The single-element test passed because the sum of a one-element array is also that element. The tests expecting the largest value and the empty-array behavior failed.

## What surprised you?
- The original AI prompt did not explain what "findResult" was supposed to calculate, so the generated implementation could be logically valid while still failing most of the JUnit tests. This showed how important specific requirements are when prompting an AI coding tool.

## Commit message used
`Iteration 1: AI-generated implementation`

---

# Iteration 2

## What changed?
- The method was changed from summing every value to searching the array for the largest integer.

## What improved?
- The new implementation correctly returned the largest value for arrays containing multiple values, negative values, and a single value.

## What still failed and why?
- The empty-array test still failed because the method immediately accesses values[0]. An empty array does not contain an element at index 0, so the method cannot initialize the largest value that way when the array is empty.

## Commit message used
`Iteration 2: largest value implementation`

---

# Iteration 3

## What is the final behavior of the program?
- The final version returns the largest integer contained in the array. If the array is empty, it returns Integer.MIN_VALUE.

## What was fixed?
- I added a check for an empty array before attempting to access values[0]. This prevents the array-index error and provides the required Integer.MIN_VALUE result.

## What did you learn?
- I learned that increasingly specific requirements produce more accurate AI-generated code. The JUnit tests also made it easy to identify exactly which edge case was still missing after Iteration 2.

## Commit message used
`Iteration 3: final version passing all tests`

---

# Final Reflection

## How did the AI-generated implementation change across the three iterations?
- The first implementation interpreted the vague prompt by calculating the sum of the array. The second iteration used a more specific prompt and changed the method to return the largest value. The final iteration added explicit handling for an empty array by returning Integer.MIN_VALUE.

## How did the JUnit tests help guide the changes?
- The JUnit tests provided immediate feedback about which behaviors were correct and which requirements were still missing. Each test run helped narrow down the changes needed for the next iteration.

## What did you learn about giving an AI tool more specific requirements?
- I learned that the quality and accuracy of AI-generated code depends heavily on how specific the prompt is. A vague request can produce valid code that does not solve the intended problem, while clearer requirements produce results that better match the expected behavior.

## What did you learn about using Git commits to track iterative development?
- Git commits created a clear history of each implementation. I could see how the program changed from the initial version through each refinement, which makes debugging, reviewing changes, and returning to an earlier version much easier.
