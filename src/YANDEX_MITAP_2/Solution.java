package YANDEX_MITAP_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solve("src/YANDEX_MITAP_2/input.txt"));
    }

    public static int solve(String path) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            int n = Integer.parseInt(String.valueOf(line.charAt(0)));
            int m = Integer.parseInt(String.valueOf(line.charAt(2)));

            line = bufferedReader.readLine();
            List<Integer> plates = new ArrayList<>();
            String[] split = line.split(" ");
            for(int i = 0; i < n; i++) {
                plates.add(Integer.parseInt(split[i]));
            }
            line = bufferedReader.readLine();
            List<Integer> guards = new ArrayList<>();
            split = line.split(" ");
            for(int i = 0; i < m; i++) {
                guards.add(Integer.parseInt(split[i]));
            }

            // Отсюда алгоритм

            List<Integer> temp = new ArrayList<>();
            temp.add(plates.get(n-1));
            int cover = plates.get(n-1);
            int max = Collections.max(plates);

            for(int i = n-1; i >= 0; i--) {
                if(plates.get(i) > cover) {
                    temp.add(plates.get(i)-cover);
                    cover = plates.get(i);
                }
            }

            int result = 0;

            for (Integer guard : guards) {
                for (int i = 0; i < temp.size(); i++) {
                    if (temp.get(i) >= guard) {
                        result++;
                        temp.remove(i);
                        break;
                    }
                }
            }

            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
