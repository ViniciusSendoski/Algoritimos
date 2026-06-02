// Faça um algoritmo que leia o nome de um objeto, sua largura, altura e profundidade (valores reais em metros). Exiba os dados em formato de tabela, com as dimensões exibidas com 2 casas decimais.

// javac Exercicio_9.java && java Exercicio_9

import java.util.Scanner;

public class Exercicio_9 {
    public static Scanner scanner = new Scanner(System.in);

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
        double altura, largura, profundidade;

        nome = entradaString("");
        altura = entradaDouble("");
        largura = entradaDouble("");
        profundidade = entradaDouble("");

        saida(nome, altura, largura, profundidade);
    }

    public static void saida(String nome, double altura, double largura, double profundidade){
        System.out.printf("---Informação Produto---\nNome:\t%s\nAltura:\t%.2f m\nLargura:\t%.2f m\nProfundidade\t%.2f m\n------------------------\n",nome, altura, largura, profundidade);
    }
}