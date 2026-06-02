// Faça um algoritmo que leia dois valores inteiros, a e b, e os exiba na ordem inversa da leitura.

// javac Exercicio_8.java && java Exercicio_8

import java.util.Scanner;

public class Exercicio_8 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numero_1, numero_2;

        numero_1 = entradaInt("");
        numero_2 = entradaInt("");

        saida(numero_1, numero_2);
    
    }

    public static void saida(int numero_1, int numero_2){
        System.out.println("Primeiro: " + numero_2 + "\nSegundo: " + numero_1);
    }

}