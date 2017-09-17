package technicalProblems.arrays;

import java.util.HashSet;
import java.util.Set;

public class largestSubstringWithoutRepeatedCharacters {
    // "abc ab cb b"
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> substring = new HashSet<>();
        String substring = "";

        int maxCount = 0;
        int count = 0;
        int substringStart = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (substring.contains("" + currentChar)) {
                if (maxCount < count) {
                    maxCount = count; // 3
                }

                int lastRepeated = 0;
                for (int k = substringStart; k < i; k++) {
                    if (s.charAt(k) == currentChar)
                        lastRepeated = k;
                }
                substringStart = lastRepeated + 1;

                substring = "";
                count = 0;
                for (int j = substringStart; j <= i; j++) {
                    substring += s.charAt(j);
                    count++;
                }
            } else {
                substring += currentChar;
                count++;
            }
        }

        if (maxCount < count)
            maxCount = count;

        return maxCount;
    }

    public int lengthOfLongestSubstringWindow(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}