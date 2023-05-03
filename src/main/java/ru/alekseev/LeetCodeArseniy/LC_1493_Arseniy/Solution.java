package ru.alekseev.LeetCodeArseniy.LC_1493_Arseniy;

import java.util.Arrays;

public class Solution {
    public static int longestSubarray(int[] num) {
        if(Arrays.stream(num)
            .filter(element -> element == 0 ? true : false)
            .findAny()
            .isEmpty())
            return num.length - 1;
        
        if(Arrays.stream(num)
            .filter(element -> element == 1 ? true : false)
            .findAny()
            .isEmpty())
            return 0;
        
        int maxSub = 0;
        int subSum = 0;

        for(int i = 0; i < num.length; ++i){
            if(num[i] == 0) {
                subSum += rekurs(0, i, 1, num);
                subSum += rekurs(0, i, -1, num);
                maxSub = maxSub < subSum ? subSum : maxSub;
            }
            subSum = 0;
        }

        return maxSub;
    }

    private static int rekurs(int sum, int pos, int step, int[] nums) {
        if(pos + step < 0 || pos + step == nums.length)
            return sum;
        else if(pos + step >= 0 && pos + step != nums.length && nums[pos + step] == 0)
            return sum;
        else {
            ++sum;
            return rekurs(sum, pos + step, step, nums);
        }
    }
}