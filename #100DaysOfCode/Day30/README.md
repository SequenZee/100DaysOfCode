# PAINTING THE FENCE :blush:
## DAY :three: :zero: -December 14, 2023

## Code Overview

The provided Java code aims to count the number of ways to paint `n` fences using `k` colors, such that no more than two adjacent fences have the same color. It employs dynamic programming to efficiently compute the count of such painting combinations.

## Key Features

- Counts the number of ways to paint `n` fences using `k` colors with the constraint of no more than two adjacent fences having the same color.
- Utilizes dynamic programming to calculate the count efficiently.
- Handles modular arithmetic to prevent overflow for large inputs.

## Code Breakdown

The `Solution` class contains the following methods:

- `countWays(int n, int k)`: This method takes two parameters, `n` (the number of fences) and `k` (the number of colors). It computes the count of ways to paint the fences using the given number of colors while ensuring that no more than two adjacent fences have the same color. It iterates over the fences and colors using dynamic programming, updating the count based on the previous values.

The `main` method demonstrates the usage of the `countWays` method by providing sample inputs `n = 3` and `k = 2` and printing the result.

# Usage

1. Copy the code into your Java environment.
2. Ensure that you have the `Solution` class available.
3. Provide the desired number of fences `n` and colors `k`.
4. Call the `countWays` method with the input parameters.
5. It will return the count of ways to paint the fences.

## Output

![Reference Image](s30.png)

## Link
<https://auth.geeksforgeeks.org/user/asantamarptz2>
