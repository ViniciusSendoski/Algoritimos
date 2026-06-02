// Faça um algoritmo que leia uma medida em metros (real) e exiba os valores equivalentes em centímetros e milímetros, como inteiros.

// javac Exercicio_21.java && java Exercicio_21

import java.util.Scanner;

public class Exercicio_21 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        saida();
    }

    public static void saida(){

    }
}