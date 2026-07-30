// Problem: Largest Odd Number in a String
// Platform: GeeksforGeeks
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public String maxOdd(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if ((ch - '0') % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }

        return "";
    }
}
