//  Faça um algoritmo que leia o nome do aluno, sua matrícula (inteiro) e sua nota final (real). Exiba um relatório com essas informações, exibindo a nota com 1 casa decimal.

// javac Exercicio_7.java && java Exercicio_7

import java.util.Scanner;

public class Exercicio_7 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static double entradaDouble(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static String entradaString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nome;
        int codigo;
        double nota;

        nome = entradaString("");
        codigo = entradaInt("");
        nota = entradaDouble("");

        saida(nome, codigo, nota);
    }

    public static void saida(String nome, int codigo, double nota){
        System.out.printf("-----Ficha do Aluno-----\nNome:\t%s\nCodigo:\t%d\nNota:\t%.1f\n------------------------\n",nome, codigo, nota);
    }
}