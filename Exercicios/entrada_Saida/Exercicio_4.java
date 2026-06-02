// Faça um algoritmo que leia um número real e o exiba com 2 casas decimais e a mensagem: O valor digitado foi: <valor>

// javac Exercicio_4.java && java Exercicio_4

import java.util.Scanner;

public class Exercicio_4 {
    public static Scanner scanner = new Scanner(System.in);

    public static double entradaDouble(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        double numero;

        numero = entradaDouble("");

        saida(numero);
    }

    public static void saida(double numero){
        System.out.printf("O valor digitado foi: %.2f\n", numero);
    }
}