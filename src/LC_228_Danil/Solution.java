package LC_228_Danil;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (i+1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (a != nums[i]) {
                list.add(a + "->" + nums[i]);
            }
            else {
                list.add(a + "");
            }
        }
        return list;
    }

}