// Faça um algoritmo que leia o nome de um aluno, sua nota (real) e seu conceito (um único caractere: A, B, C ou D). Exiba as informações formatadas.

// javac Exercicio_11.java && java Exercicio_11

import java.util.Scanner;

public class Exercicio_11 {
    public static Scanner scanner = new Scanner(System.in);

    public static double entradaDouble(String mensagem){
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static String entradaString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nome = entradaString("");
        double nota = entradaDouble("");
        scanner.nextLine();
        String conceito = entradaString("");

        saida(nome, nota, conceito);
    }

    public static void saida(String nome, double nota, String conceito){
        System.out.printf("Aluno: %s\nNota: %.2f\nConceito: %s\n", nome, nota, conceito);
    }
}