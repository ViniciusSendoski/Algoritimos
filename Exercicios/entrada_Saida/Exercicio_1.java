// Faça um algoritmo que leia o nome de uma pessoa e exiba a mensagem: Olá, <nome>!

// javac Exercicio_1.java && java Exercicio_1

import java.util.Scanner;

public class Exercicio_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static String entradaString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nome;

        nome = entradaString("");

        saida(nome);
    }

    public static void saida(String nome){
        System.err.printf("Olá, %s \n", nome);
    }
}