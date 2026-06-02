// Faça um algoritmo que leia dois números reais e exiba a média aritmética deles com 2 casas decimais

// javac Exercicio_17.java && java Exercicio_17

import java.util.Scanner;

public class Exercicio_17 {
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
        double a = entradaDouble(""), b = entradaDouble("");
        saida(a,b);
    }

    public static void saida(double a, double b){
        System.out.printf("%.2f\n",(a+b)/2);
    }
}