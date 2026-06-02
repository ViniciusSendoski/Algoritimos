// Faça um algoritmo que leia o nome da empresa, o nome do responsável e o mês de referência (inteiro de 1 a 12). Exiba um cabeçalho de relatório com essas informações.

// javac Exercicio_12.java && java Exercicio_12

import java.util.Scanner;

public class Exercicio_12 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static String entradaString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nomeEmpresa = entradaString("");
        String nomeResponsavel = entradaString("");
        int ano = entradaInt("");
        saida(nomeEmpresa, nomeResponsavel, ano);
    }

    public static void saida(String nomeE, String nomeR, int ano){
        System.out.printf("============================\nEmpresa: %s\nResponsável: %s\nRefência: Mês %d\n============================\n", nomeE, nomeR, ano);
    }
}