# MAX SUM SUBARRAY OF SIZE K :blush:
## DAY :two: :seven: -December 11, 2023

## Code Overview

The provided Java code aims to find the maximum sum subarray of size `K` from a given ArrayList of integers `Arr`. It employs a sliding window approach to efficiently compute the maximum sum subarray.

## Key Features

- Determines the maximum sum subarray of size `K`.
- Utilizes a sliding window technique for efficient computation.
- Calculates the sum of subarrays and keeps track of the maximum sum encountered.

## Code Breakdown

The `Solution` class contains the following methods:

- `maximumSumSubarray(int K, ArrayList<Integer> Arr, int N)`: This method takes three parameters: `K` (size of the subarray), `Arr` (the ArrayList containing integers), and `N` (the size of the ArrayList). It iterates through the ArrayList using two pointers `i` and `j`, maintaining a sliding window of size `K`. It computes the sum of elements within the window and updates the maximum sum encountered (`res`). This process continues until the end of the ArrayList is reached.

The `main` method demonstrates the usage of the `maximumSumSubarray` method by providing sample inputs (`N = 4`, `K = 2`, `Arr = [100, 200, 300, 400]`) and printing the result.

## Usage

1. Copy the code into your Java environment.
2. Ensure that you have the `Solution` class available.
3. Provide the desired size of the subarray `K`, the ArrayList of integers `Arr`, and its size `N`.
4. Call the `maximumSumSubarray` method with these parameters.
5. It will return the maximum sum subarray of size `K`.


## Output

![Reference Image](s27.png)

## Link
<https://auth.geeksforgeeks.org/user/asantamarptz2>