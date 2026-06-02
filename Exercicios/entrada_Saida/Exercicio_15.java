// Faça um algoritmo que leia dois textos quaisquer e os exiba separados por uma linha com 40 hifens (-). Cada texto deve aparecer em sua própria linha.

// javac Exercicio_15.java && java Exercicio_15

import java.util.Scanner;

public class Exercicio_15 {
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
        String a = entradaString(""), b = entradaString("");
        saida(a,b);
    }

    public static void saida(String a, String b){
        System.out.printf("%s\n----------------------------------------\n%s\n",a,b);
    }
}