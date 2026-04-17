// Criar um algoritimo que leia a idade em anos dias e meses, tendo a saida em dias
// user@user:~$ javac Exercicio_10.java && java Exercicio_10

import java.util.Scanner;

public class Exercicio_10 {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] entradaInt(){
        int[] valor = new int[4];

        System.out.print("Digite os anos da sua idade: ");
        valor[0] = scanner.nextInt();
        System.out.print("Digite os meses da sua idade: ");
        valor[1] = scanner.nextInt();
        System.out.print("Digite os dias da sua idade: ");
        valor[2] = scanner.nextInt();
    
        return valor;
    }

    public static void main(String[] args){
        int[] valor = new int[4];

        valor = entradaInt();
        valor = calculo(valor);

        saida(valor);

    }

    // Para Mês é considerado 30 como media de dias dos 12 meses, para anos é 365
    public static int[] calculo(int[] valor){
        valor[3] = (valor[0] * 365) + (valor[1] * 30) + valor[2];

        return valor;
    }

    public static void saida(int[] valor) {
        System.out.println("\nSua Idade em dias é: " + valor[3]);
    }

}