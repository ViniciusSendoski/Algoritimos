// Faça um algoritmo que leia o nome, o código (inteiro) e o preço (real) de um produto. 
// Exiba uma ficha formatada com todos os dados, exibindo o preço com 2 casas decimais.

// javac Exercicio_6.java && java Exercicio_6

import java.util.Scanner;

public class Exercicio_6 {
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
        double preco;

        nome = entradaString("");
        codigo = entradaInt("");
        preco = entradaDouble("");

        saida(nome, codigo, preco);
    }

    public static void saida(String nome, int codigo, double preco){
        System.out.printf("-----Ficha de Produtos-----\nNome:\t%s\nCodigo:\t%d\nPreço:\t%.2f\n---------------------------\n",nome, codigo, preco);
    }
}