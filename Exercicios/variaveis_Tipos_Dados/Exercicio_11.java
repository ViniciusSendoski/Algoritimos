// Criar um algoritimo que leia o valor da prestação, taxa de juros e o tempo de atraso em meses
// user@user:~$ javac Exercicio_11.java && java Exercicio_11

import java.util.Scanner;

public class Exercicio_11 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[4];

        System.out.print("Digite o valor da prestação: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Digite a taxa de juros em %: ");
        valor[1] = scanner.nextDouble();
        System.out.print("Digite o tempo de atraso em meses: ");
        valor[2] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args){
        double[] valor = new double[4];

        valor = entradaDouble();
        
        valor = calculo(valor);

        saida(valor);
    }

    public static double[] calculo(double[] valor){
        valor[3] = valor[0] + (valor[1] * valor[2]);

        return valor;
    }

    public static void saida(double[] valor){
        System.out.println("\nSua parecela: " + valor[0] + "\nSua taxa de juros: " + valor[1] + "\nSeus meses em atraso:" + valor[2] + "\nTotal da divida: " + valor[3]);
    }

}