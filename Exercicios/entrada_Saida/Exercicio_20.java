// Faça um algoritmo que leia uma temperatura em graus Celsius e exiba o valor correspondente em Fahrenheit com 2 casas decimais.

// javac Exercicio_20.java && java Exercicio_20

import java.util.Scanner;

public class Exercicio_20 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static double entradaDouble(String mensagem){
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        double a = entradaDouble("");
        saida(a);
    }

    public static void saida(double a){
        System.out.printf("%.2f °C equivale a %.2f °F\n", a, ((9.0 * a)/5.0)+32.0);
    }
}