package YandexContestArseniy.Yandex_Intern_Arseniy.Task2;

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/YandexContestArseniy.Yandex_Intern_Arseniy/Task2/input.txt"))) {
            long[] firstLine = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            long N = firstLine[0];
            long X = firstLine[1];
            long T = firstLine[2];
            Writer writer = new BufferedWriter(new FileWriter("src/YandexContestArseniy.Yandex_Intern_Arseniy/Task2/output.txt"));
            long[] sculptures = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            for(int i = 1; i <= N; ++i) {
                Math.abs(X - sculptures[i-1]);
            }
            writer.close();
        }
        catch(IOException e) {

        }
    }
}
