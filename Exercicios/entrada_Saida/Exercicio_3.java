// Faça um algoritmo que leia um número inteiro e o exiba novamente na tela com a mensagem: O número digitado foi: <numero>

// javac Exercicio_3.java && java Exercicio_3

import java.util.Scanner;

public class Exercicio_3 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numero;
        
        numero = entradaInt("");

        saida(numero);
    }

    public static void saida(int numero){
        System.out.println("O número digitado foi: " + numero);
    }
}