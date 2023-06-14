package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 100;

        int valor = MaiorNUM(a, b, c);


    }

    public static int MaiorNUM(int a, int b, int c) {
        int Maior = a;
        if (b > Maior) {
            System.out.println("O menor valor é:  " +b);
        }
        if (c > Maior) {
            System.out.println("O maior valor é: " +c);
        }

        return Maior;
    }
}



