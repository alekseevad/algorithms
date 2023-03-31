package LC_849_Danil;

public class Solution {

    public static void main(String[] args) {
        int[] input1 = {1,0,0,0,1,0,1}; // 2
        int[] input2 = {1,0,0,0}; // 3
        int[] input3 = {0,1}; // 1

        System.out.println(maxDistToClosest(input1));
        System.out.println(maxDistToClosest(input2));
        System.out.println(maxDistToClosest(input3));
    }

    public static int maxDistToClosest(int[] seats) {
        int result = 0;
        int left = -1;
        int index = 0;

        while(index != seats.length) {
            if(left == -1 && seats[index] == 1) {
                result = Math.max(result, index);
                left = index;
                index ++;
            }
            else if(index == seats.length-1 && seats[index] == 0) {
                result = Math.max(result, index-left);
                index ++;
            }
            else if(seats[index] == 1) {
                result = Math.max(result, (index-left)/2);
                left = index;
                index++;
            }
            else {
                index++;
            }
        }
        return result;
    }

}
