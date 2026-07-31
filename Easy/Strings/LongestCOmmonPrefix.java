// Problem: Longest Common Prefix
// Platform: GeeksforGeeks
// Difficulty: Easy
// Time Complexity: O(n × m)
// Space Complexity: O(1)

class Solution {
    public String longestCommonPrefix(String arr[]) {

        if (arr == null || arr.length == 0)
            return "";

        for (int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (i == arr[j].length() || arr[j].charAt(i) != ch) {
                    return arr[0].substring(0, i);
                }
            }
        }

        return arr[0];
    }
}
