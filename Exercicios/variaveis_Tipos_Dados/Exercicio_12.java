// Criar um algoritimo que leia o comprimento, largura e altura; saida volume do retangulo
// user@user:~$ javac Exercicio_12.java && java Exercicio_12

import java.util.Scanner;

public class Exercicio_12 {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] entradaInt(){
        int[] valor = new int[4];

        System.out.print("Digite comprimento do retangulo: ");
        valor[0] = scanner.nextInt();
        System.out.print("Digite largura do retangulo: ");
        valor[1] = scanner.nextInt();
        System.out.print("Digite altura do retangulo: ");
        valor[2] = scanner.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int[] valor = new int[4];

        valor = entradaInt();

        valor = calculo(valor);

        saida(valor);
    }

    public static int[] calculo(int[] valor){
        valor[3] = valor[0] * valor[1] * valor[2];

        return valor;
    }

    public static void saida(int[] valor) {
        System.out.println("\nO volume de um retangulo é: " + valor[3] + " cm³");
    }
}