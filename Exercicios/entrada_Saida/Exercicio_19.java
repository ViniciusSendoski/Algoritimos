// Faça um algoritmo que leia o raio de um círculo e calcule e exiba sua área com 4 casas decimais. Use π≈3.14159π≈3.14159.

// javac Exercicio_19.java && java Exercicio_19

import java.util.Scanner;

public class Exercicio_19 {
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
        double a = entradaDouble(""), b = 3.14159;
        saida(a,b);
    }

    public static void saida(double a, double b){
        System.out.printf("%.4f\n",b * (a*a));
    }
}