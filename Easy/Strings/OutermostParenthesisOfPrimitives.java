// Problem: Outermost Parentheses of Primitives
// Platform: GeeksforGeeks
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public String removeOuter(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}
