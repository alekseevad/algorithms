package YandexContestArseniy.Yandex_Meet_Up_2_Arseniy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/YandexContestArseniy.Yandex_Meet_Up_3_Arseniy.Yandex_Meet_Up_2_Arseniy/input.txt"))){

            String[] firstLine = bufferedReader.readLine().split(" ");
            long n = Long.parseLong(firstLine[0]);
            long m = Long.parseLong(firstLine[1]);
            for(long i = 0; i < n; ++i) {

            }
            List<Integer> floorLengths = Arrays.stream(bufferedReader.readLine().split(" "))
                    .map(Integer::parseInt)
                    .toList();
            ArrayList<Integer> validFloors = new ArrayList<>();
            for(int i = 1; i < floorLengths.size(); ++i) {
                int difference = floorLengths.get(i - 1) - floorLengths.get(i);
                if(difference > 0)
                    validFloors.add(difference);
            }
            validFloors.add(floorLengths.get(floorLengths.size() - 1));

            ArrayList<Integer> guards = new ArrayList<>(Arrays.stream(bufferedReader.readLine().split(" "))
                    .map(Integer::parseInt)
                    .toList());

            Collections.sort(guards);
            Collections.sort(validFloors);

            Integer count = 0;

            for(int i = 0; i < guards.size(); ++i) {
                for(int j = 0; j < validFloors.size(); ++j) {
                    if(guards.get(i) <= validFloors.get(j)) {
                        ++count;
                        for(int k = j; k > 0; --k)
                            validFloors.remove(0);
                        break;
                    }

                }
            }
            System.out.println(count);
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/YandexContestArseniy.Yandex_Meet_Up_3_Arseniy.Yandex_Meet_Up_2_Arseniy/output.txt"));
            writer.write(count.toString());
            writer.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
