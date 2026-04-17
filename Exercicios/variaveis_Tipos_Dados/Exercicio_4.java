// Criar um algoritimo que leia e mostre a media
// user@user:~$ javac Exercicio_4.java && java Exercicio_4

import java.util.Scanner;

public class Exercicio_4 {
    public static Scanner scanner = new Scanner(System.in);

    // Estrutura de ArrayLista, tem como objetivo agrupar dados em uma lista na mesma variavel
    // int[] n = new int[3];
    // No exemplo a variavel n é uma lista de pode armazenar 3 valores em 3 posições de uma lista em n
    // A posição N vai de 0, 1, 2, ou seja 3 posições

    public static int[] entradaInt() {
        int[] nota = new int[3];

        System.out.print("Primeira nota: ");
        nota[0] = scanner.nextInt();
        System.out.print("Segunda nota: ");
        nota[1] = scanner.nextInt();
        System.out.print("Terceira nota: ");
        nota[2] = scanner.nextInt();

        return nota;
    }

    public static void main(String[] args) {
        int[] nota = new int[3];

        nota = entradaInt();
        
        saidaIntegrada(nota);
    }

    public static void saidaIntegrada(int[] nota){
        double media;

        media = (nota[0] + nota[1] + nota[2]) / 3;

        System.out.println("Sua media: " + media);
    }
}