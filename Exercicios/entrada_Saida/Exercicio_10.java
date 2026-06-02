// Faça um algoritmo que leia o nome de um funcionário e um valor lógico indicando se ele está ativo na empresa. Exiba uma mensagem informando a situação do funcionário.

// javac Exercicio_10.java && java Exercicio_10

import java.util.Scanner;

public class Exercicio_10 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
    
    public static String entradaString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static boolean entradaBoolean(String mensagem){
        System.out.print(mensagem);
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
        String nome = entradaString("");
        boolean estado = entradaBoolean("");

        saida(nome, estado);
    }

    public static void saida(String nome, boolean estado){
        System.out.printf("Funcionário:\t%s\n", nome);
        System.out.printf("Ativo:\t\t%b\n", estado);
    }
}