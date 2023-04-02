package Yandex_Meet_up_1_Arseniy;

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("input.txt")) {

        }
        catch (IOException ex){

            System.out.println(ex.getMessage());
        }
        String koktail = "\\             /" +
                ".|           |..|           |." +
                "..\\         /.....|       |..." +
                "...|       |.......\\     /...." +
                ".....\\___/.....";

        System.out.println(koktail.length());
        int n = 8;
        int m = 15;
        String output = "";
        int k1 = 2;
        int k2 = 5;
        char c1 = '%';
        char c2 = '*';
        System.out.println(output);
        for (int i = koktail.length() - 1; i >= ((n-1-k1) * m); --i) {
            if(koktail.charAt(i) == ' ') {
                koktail = koktail.substring(0, i) + c1 + koktail.substring(i + 1);
            }
        }
        for(int i = koktail.length() - m * (n - k2 - 1 ) - 1; i >= ((n-1-k2 - k1) * m); --i)
        {
            if(koktail.charAt(i) == ' ') {
                koktail = koktail.substring(0, i) + c2 + koktail.substring(i + 1);
            }
        }
        System.out.println(koktail);
    }


}
