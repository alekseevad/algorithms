package YandexContestArseniy.Yandex_Intern_Arseniy.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/YandexContestArseniy.Yandex_Intern_Arseniy/Task1/input.txt"))) {
            long N = Long.parseLong(bufferedReader.readLine().split(" ")[0]);
            HashMap<Long, Long> dictionary = new HashMap<>();
            Long[] ids = Arrays.stream(bufferedReader.readLine().split(" "))
                    .map(Long::parseLong)
                    .toArray(Long[]::new);
            Long[] rows = Arrays.stream(bufferedReader.readLine().split(" "))
                    .map(Long::parseLong)
                    .toArray(Long[]::new);
            for(int i = 0; i < N; ++i) {
                dictionary.put(ids[i], rows[i]);
            }
            long K = Long.parseLong(bufferedReader.readLine().split(" ")[0]);
            Long[] text = Arrays.stream(bufferedReader.readLine().split(" "))
                    .map(Long::parseLong)
                    .toArray(Long[]::new);
            int count = 0;
            for (int i = 0; i < K - 1; ++i) {
                if(!Objects.equals(dictionary.get(text[i]), dictionary.get(text[i + 1]))) {
                    ++count;
                }
            }
            System.out.println(count);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
