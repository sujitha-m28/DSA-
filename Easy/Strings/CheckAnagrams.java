// Problem: Valid Anagram
// Platform: GeeksforGeeks
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        // Step 1: Check length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] freq = new int[26];

        // Step 3: Count characters in first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Step 4: Subtract characters of second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // Step 5: Check if all frequencies are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
