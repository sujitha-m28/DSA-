// Problem: Isomorphic Strings
// Platform: GeeksforGeeks
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class Solution {
    public boolean areIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            // Check mapping from s1 -> s2
            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2)
                    return false;
            } else {
                map1.put(ch1, ch2);
            }

            // Check mapping from s2 -> s1
            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch1)
                    return false;
            } else {
                map2.put(ch2, ch1);
            }
        }

        return true;
    }
}
