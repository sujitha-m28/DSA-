// Problem: Implement Pow
// Platform: GeeksforGeeks
// Difficulty: Medium
// Algorithm: Binary Exponentiation (Recursion)
// Time Complexity: O(log n)
// Auxiliary Space: O(log n)

class Solution {

    double power(double b, int e) {

        // Base case
        if (e == 0)
            return 1;

        // Handle negative exponent
        if (e < 0)
            return 1 / power(b, -e);

        // Compute half power recursively
        double half = power(b, e / 2);

        // If exponent is even
        if (e % 2 == 0)
            return half * half;

        // If exponent is odd
        return b * half * half;
    }
}
