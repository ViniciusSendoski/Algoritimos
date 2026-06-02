// Faça um algoritmo que leia um único caractere e o exiba com a mensagem: O caractere digitado foi: <char>

// javac Exercicio_5.java && java Exercicio_5

import java.util.Scanner;

public class Exercicio_5 {
    public static Scanner scanner = new Scanner(System.in);

    public static char entradaChar(String mensagem) {
        System.out.print(mensagem);
        return scanner.next().charAt(0);
    }

    public static void main(String[] args) {
        char letra;

        letra = entradaChar("");

        saida(letra);
    }

    public static void saida(char letra){
        System.out.printf("O caractere digitado foi: %c\n", letra);
    }
}