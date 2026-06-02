// Faça um algoritmo que leia o nome e o sobrenome de uma pessoa separadamente e exiba o nome completo em uma única linha.

// javac Exercicio_2.java && java Exercicio_2

import java.util.Scanner;

public class Exercicio_2 {
    public static Scanner scanner = new Scanner(System.in);

    public static String entradaString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nome, sobrenome;

        nome = entradaString("");
        sobrenome = entradaString("");

        saida(nome, sobrenome);
    }

    public static void saida(String nome, String sobrenome){
        System.out.printf("Nome Completo: %s %s\n",nome, sobrenome);
    }
}