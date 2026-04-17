// Criar um algoritimo que leia a quantidade de combustivel e altonomia, entregando a media de consumo por litro
// user@user:~$ javac Exercicio_8.java && java Exercicio_8

import java.util.Scanner;

public class Exercicio_8{
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[3];

        System.out.print("Quantidade de Kilometros percorridos: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Quantos litros foram consumidos: ");
        valor[1] = scanner.nextDouble();
    
        return valor;
    }

    public static void main(String[] args){
        double[] valor = new double[3];

        valor = entradaDouble();
        valor = calculo(valor);

        saidaIntegrada(valor);
    }

    public static double[] calculo(double[] valor){
        valor[2] = valor[0] / valor[1]; // media de km por litro

        return valor;
    }

    public static void saidaIntegrada(double[] valor) {
        System.out.println("\nSua Distancia percorrida: " + valor[0] + "\nSeu consumo de combustivel: " + valor[1] + "\nSua media de consumo Km por litro é: " + valor[2]);
    }
}