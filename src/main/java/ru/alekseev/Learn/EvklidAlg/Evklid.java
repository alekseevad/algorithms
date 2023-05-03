package ru.alekseev.Learn.EvklidAlg;

public class Evklid {
    public static void main(String[] args) {
        System.out.println(evklidAlg(270, 192));
    }
    public static int evklidAlg(int a, int b) {
         if(a == 0)
             return b;
         if(b == 0)
             return a;
         int q = a / b;
         int r = a - q * b;
         return evklidAlg(b, r);
    }
}
