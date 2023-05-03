package ru.alekseev.LeetCodeArseniy.LC_228_Arseniy;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        if(nums.length == 0)
            return new ArrayList<String>();
        String range = "";
        range = range.concat(String.valueOf(nums[0]));
        int i = 1;
        int last_int = nums[0];
        List<String> list = new ArrayList<String>();
        while(i != nums.length) {
            if(nums[i] - last_int != 1) {
                if(Integer.parseInt(range) != last_int) {
                    range = range.concat("->" + last_int);
                }
                list.add(range);
                range = String.valueOf(nums[i]);
            }

            last_int = nums[i];
            i++;
        }
        if(Integer.valueOf(range) != last_int){
            range = range.concat("->" + last_int);
        }
        list.add(range);
        return list;
    }
}
