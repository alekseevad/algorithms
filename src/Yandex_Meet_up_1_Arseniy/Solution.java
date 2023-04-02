package Yandex_Meet_up_1_Arseniy;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Yandex_Meet_up_1_Arseniy/input.txt"))) {
            String firstLine = bufferedReader.readLine();
            String[] lineArray = firstLine.split(" ");

            int n = Integer.parseInt(lineArray[0]);
            int m = Integer.parseInt(lineArray[1]);
            int size = n * m + 4 + firstLine.length();
            char[] charBuf = new char[size];

            bufferedReader.read(charBuf, 0, size);
            String cocktail =String.copyValueOf(charBuf, 0, size);

            int k = Integer.parseInt(bufferedReader.readLine());
            int prevCount = 0;
            ++m;

            for(int j = k; j > 0; --j) {
                String[] toppings = bufferedReader.readLine().split(" ");
                char c = toppings[2].charAt(0);
                int count = Integer.parseInt(toppings[1]);

                for(int i = m * (n - prevCount - 1 ) - 1; i >= ((n-1- count - prevCount) * m); --i) {
                    if(cocktail.charAt(i) == ' ') {
                        cocktail = cocktail.substring(0, i) + c + cocktail.substring(i + 1);
                    }
                }
                prevCount += count;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/Yandex_Meet_up_1_Arseniy/output.txt"));
            writer.write(cocktail);

            writer.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
