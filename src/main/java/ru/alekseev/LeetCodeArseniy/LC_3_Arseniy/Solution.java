package ru.alekseev.LeetCodeArseniy.LC_3_Arseniy;

import org.jetbrains.annotations.NotNull;
import ru.alekseev.BaseClasses.BaseSolution;

public class Solution implements BaseSolution<Integer, String> {
    private BaseSolution<Integer, String> baseSolution;

    public Solution() { }

    public Solution(BaseSolution<Integer, String> baseSolution) {
        this.baseSolution = baseSolution;
    }

    @Override
    public Integer compute(String args) {
        return lengthOfLongestSubstring(args);
    }

    private int lengthOfLongestSubstring(@NotNull String str) {
        int max = 0;
        int start = 0;
        String substr = "";
        for(int i = 0; i < str.length(); ++i) {
            if(substr.contains(String.valueOf(str.charAt(i)))) {
                start += substr.indexOf(str.charAt(i)) + 1;
            }
            substr = str.substring(start, i + 1);
            max = Math.max(substr.length(), max);
        }
        return max;
    }
}
