package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 100;

        int valor = MaiorNUM(a, b, c);


    }

    public static int MaiorNUM(int a, int b, int c) { 
        //A declaração de função está correta ela retorna um valor inteiro 
        //E recebe 3 nos parametros

        // A variavel 'Maior' começa a ter o mesmo valor que a variavel 'a', 
        //sendo assim porque não usar apenas a variavel a?
        int Maior = a;

        //Vamos para as condicionais se b for maior que Maior então ele imprime que b é o valor menor
        if (b > Maior) {
            System.out.println("O menor valor é:  " +b);
        }
        //Se c for maior que Maior então ele imprime o maior valor é c 
        if (c > Maior) {
            System.out.println("O maior valor é: " +c);
        }

        //Na primeira condicional ele ve se b é maior que Maior, mas se b for menor que c isso significa que b não é o menor valor
        
        //Já na segunda condicional você ve se c é maior que Maior, mas se b for maior que c isso tambem significa que c não é o maior valor

        //Vamos pensar assim
        //Temos 3 valores 'A' 'B' e 'C'
        //queremos saber qual desses 3 valores é o maior entre eles
        //então para o 'A' for o maior valor ele tem que obrigatóriamente ser maior que 'B' e 'C'
        //para o 'B' ser o maior valor ele tem que ser maior que 'A' tanto 'C'
        //e para o 'C' a mesma coisa.

        return Maior;
    }
}



