// Criar um algoritimo que leia a base e altura, saindo sua area e perimetro de um retangulo
// user@user:~$ javac Exercicio_9.java && java Exercicio_9

import java.util.Scanner;

public class Exercicio_9 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[4];

        System.out.print("Valor da base do retangulo: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Valor da altura do retangulo: ");
        valor[1] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args){
        double[] valor = new double[4];

        valor = entradaDouble();
        valor = calculo(valor);

        saidaIntegrada(valor);
    }

    public static double[] calculo(double[] valor){
        valor[2] = valor[0] * valor[1]; // Calculo de Area do retangulo
        valor[3] = 2 * (valor[0] + valor[1]); // Calculo do perimetor

        return valor;
    }

    public static void saidaIntegrada(double[] valor){
        System.out.println("\nSua area do retangulo: " + valor[2] + "\nSeu perimetor do retangulo: " + valor[3]);
    }
}