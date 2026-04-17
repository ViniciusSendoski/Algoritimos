// Na equação v = d/t, v é velocidade, d distancia. saida é o tempo gasto
// user@user:~$ javac Exercicio_18.java && java Exercicio_18

import java.util.Scanner;

public class Exercicio_18 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[3];

        System.out.print("Digite a Velocidade: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Digite a Distancia: ");
        valor[1] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args) {
        double[] valor = new double[3];

        valor = entradaDouble();

        valor = calculo(valor);

        saida(valor);   
    }

    public static double[] calculo(double[] valor){
        valor[2] = valor[1] / valor[0]; 

        return valor;
    }

    public static void saida(double[] valor){
        System.out.printf("\n Na equação V = D/T, Tempo é igual a: %.2f\n",valor[2]);
    }
}