package ru.alekseev.algorithms.LC_3_Test;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;
import org.mockito.Mock;
import ru.alekseev.LeetCodeArseniy.LC_3_Arseniy.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Suite
public class TestCases {
    @Mock
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        assertEquals(3, solution.compute("abcabcbb"));
        assertEquals(1, solution.compute("bbbb"));
        assertEquals(3, solution.compute("pwwkew"));

    }

}
