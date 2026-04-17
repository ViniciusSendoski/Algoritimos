// Criar um algoritimo que leia e converta dolar para real
// user@user:~$ javac Exercicio_5.java && java Exercicio_5

import java.util.Scanner;

public class Exercicio_5 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[2];

        System.out.print("Digite do Cotação do dolar: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Digite quantidade de dolares: ");
        valor[1] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args) {
        double[] valor = new double[2];

        valor = entradaDouble();

        saidaIntegrada(valor);
    }

    public static void saidaIntegrada(double[] valor){
        System.out.println("A conversão esta em: " + valor[0] + "\nSua quantidade de dolares: " + valor[1] + "\nSeu valor em Real: " + (valor[1]*valor[0]));
    }
}