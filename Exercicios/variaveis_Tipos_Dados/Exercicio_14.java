// Criar um algoritimo que leia o largura e comprimento de um terreno  e o valor do metro quadrado, saida area do terreno e valor total
// user@user:~$ javac Exercicio_14.java && java Exercicio_14

import java.util.Scanner;

public class Exercicio_14 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[5];

        System.out.print("Digite a Largura do terreno: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Digite o Comprimento do terreno: ");
        valor[1] = scanner.nextDouble();
        System.out.print("Digite o Valor do metro guadrado: ");
        valor[2] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args) {
        double[] valor = new double[5];

        valor = entradaDouble();
        valor = calculo(valor);

        saida(valor);
    }

    public static double[] calculo(double[] valor){
        valor[3] = valor[1] * valor[0];
        valor[4] = valor[2] * valor[3];

        return valor;
    }

    public static void saida(double[] valor){
        System.out.printf("\nArea de terreno: %.0f m²\nValor total do terreno: R$ %.2f\n", valor[3], valor[4]);
    }
}