// Faça um algoritmo que leia uma temperatura em graus Celsius e mostre o valor correspondente em graus Fahrenheit.
// Formula : celsius * (9.0/5.0) +  32.0 = 32.0

// $ javac Ex02.java && java Ex02

import java.util.Scanner;

public class Ex02 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int celsius;
        double fahrenheit;

        // Chama funcao de entrada
        celsius = entradaInt("celsius: ");

        // Chama funcao que calcula conversao celsius para fahrenheit
        fahrenheit = calculaFahrenheit(celsius);

        // Chama funcao que apresenta saida
        saida(fahrenheit);
    }

    public static double calculaFahrenheit(int celsius){
        return celsius * (9.0/5.0) + 32.0; // No java se nao adicionar casas decimais retornar numero inteiro
    }

    public static void saida(double fahrenheit){
        System.out.printf("fahrenheit: %.1f\n", fahrenheit); // Exemplo fornecido apresenta uma casa decimal apos a virgula, considerar isso.
    }
}