// Faça um algoritmo que leia três números reais e os exiba na tela, cada um em uma linha, com 3 casas decimais.

// javac Exercicio_13.java && java Exercicio_13

import java.util.Scanner;

public class Exercicio_13 {
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
        double a = entradaDouble(""), b = entradaDouble(""), c = entradaDouble("");
        saida(a,b,c);
    }

    public static void saida(double a, double b, double c){
        System.out.printf("Valor 1: %.3f\nValor 2: %.3f\nValor 3: %.3f\n", a,b,c);
    }
}