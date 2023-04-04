package Yandex_Meet_Up_3_Arseniy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Yandex_Meet_Up_3_Arseniy/input.txt"))) {
            Map<Integer, Float> lIndex = new HashMap<>();
            bufferedReader.readLine();
            ArrayList<Integer> line = new ArrayList<>(Arrays.stream(bufferedReader.readLine().split(""))
                    .map(Integer::parseInt)
                    .toList());

            int count = 0;
            int c1 = 0;
            int c0 = 0;
            int element = line.get(0);

            if(element == 1)
                ++c1;
            else
                ++c0;

            for(int i = 1; i < line.size(); ++i) {
                element = line.get(i);
                if(element == 1)
                    ++c1;
                else
                    ++c0;

                if(c1 > c0)
                    lIndex.put(i, 1.0f);
                else if (c1 < c0)
                    lIndex.put(i, 0.0f);
                else
                    lIndex.put(i, 0.5f);
                for(int j = 0; j < i; ++j){


                }
                count = 0;

            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
