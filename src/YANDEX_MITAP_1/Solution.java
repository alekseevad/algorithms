package YANDEX_MITAP_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            cockteil("src/YANDEX_MITAP_1/input.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cockteil(String path) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();
            int m = Integer.parseInt(String.valueOf(line.charAt(0)));
            List<String> layer = new ArrayList<>();
            for(int i = 0; i < m; i++) {
                line = bufferedReader.readLine();
                layer.add(line);
            }

            line = bufferedReader.readLine();
            int k = Integer.parseInt(String.valueOf(line.charAt(0)));
            String[] name = new String[k];
            int[] count = new int[k];
            String[] symbol = new String[k];
            for(int i = 0; i < k; i++){
                line = bufferedReader.readLine();
                String[] split = line.split(" ");
                name[i] = split[0];
                count[i] = Integer.parseInt(split[1]);
                symbol[i] = split[2];
            }

            // отсюда сам алгоритм

            List<String> resultList = new ArrayList<>();
            resultList.add(layer.get(layer.size()-1));
            int temp = layer.size()-2;

            for (int a = 0; a < k; a++) {
                String currentSymbol = symbol[a];
                int border = temp - count[a];

                for (int i = temp; i > border; i--) {
                    String currentLine = layer.get(i);
                    resultList.add(currentLine.replaceAll(" ", currentSymbol));
                    temp = i-1;
                }
            }
            for(int i = temp; i >= 0; i--){
                resultList.add(layer.get(i));
            }

            Collections.reverse(resultList);
            resultList.forEach(System.out::println);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
