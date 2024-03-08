# FIND THE STRING :blush:
## DAY :two: -November 16, 2023

## Code Overview
This Java solution is designed to find a string of length n where each character in the string is between '0' and 'k-1' (inclusive) and the string is lexicographically smallest among all such strings. It utilizes a HashMap to keep track of visited strings to avoid duplicates and ensures that the generated string meets the required criteria.

## Key Features
**Lexicographically Smallest String Generation**: The main purpose of the algorithm is to generate a lexicographically smallest string of length n, where each character is between '0' and 'k-1' (inclusive).

**HashMap for Efficient Lookup**: It utilizes a HashMap to efficiently keep track of visited strings. This allows the algorithm to avoid generating duplicate strings, improving performance.

**String Manipulation with StringBuilder:** StringBuilder is used extensively for efficient string manipulation. This allows for faster appending and modification of strings compared to traditional string concatenation.

## Code Breakdown
The code snippet consists of a Solution class with a single method findString(int n, int k) that returns a string meeting specified conditions. It includes:

Initialization of StringBuilder and HashMap
Iterative string generation process
Efficient use of StringBuilder for string manipulation
Loop termination condition

## Usage
**Integration**: Copy the Solution class into your Java project or file.

**Invocation**: Invoke the findString method by providing the desired values for n (length of the string) and k (range of characters).

**Result Handling**: Use the returned string for your application's needs.


## Output

![Reference Image](s2.png)
## Link
<https://auth.geeksforgeeks.org/user/asantamarptz2>


