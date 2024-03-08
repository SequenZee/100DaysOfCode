# BETTER STRING COMPARISON ALGORITHM :blush:
## DAY :one: -November 15, 2023

## Code Overview
This Java code implements an efficient algorithm for comparing two strings, str1 and str2, to determine which one generates more distinct subsequences. Such an algorithm is valuable in various applications where selecting the most diverse string is essential.

## Key Features
**Dynamic Programming**: The algorithm utilizes dynamic programming to efficiently compute the number of distinct subsequences for each input string.

**Modular Arithmetic**: To prevent integer overflow and handle large numbers, the code employs modular arithmetic with a predefined constant MOD.

**Efficient Indexing**: Arrays lastIdx1 and lastIdx2 keep track of the last index where each character occurs in str1 and str2, respectively, optimizing the computation process.

## Code Breakdown
The method betterString(String str1, String str2) compares the two input strings and returns the "better" string based on the number of distinct subsequences it can generate.

In the main method, a sample demonstration showcases the usage of the betterString method with example inputs.

## Usage
**Integration**: Copy the Solution class into your Java project.

**Invocation**: Call the betterString method with two strings as arguments to compare them.

**Result Handling**: Utilize the returned string as per your application's requirements.

## Output

![Reference Image](/Day1/s1.png)

## Link
<https://auth.geeksforgeeks.org/user/asantamarptz2>


