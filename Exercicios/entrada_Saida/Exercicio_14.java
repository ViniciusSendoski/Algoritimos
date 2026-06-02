// Faça um algoritmo que leia a placa (string), o ano de fabricação (inteiro) e o valor de mercado (real) de um veículo. Exiba essas informações de forma organizada, com o valor exibido com 2 casas decimais

// javac Exercicio_14.java && java Exercicio_14

import java.util.Scanner;

public class Exercicio_14 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static double entradaDouble(String mensagem){
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static String entradaString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String placa = entradaString("");
        int ano = entradaInt("");
        double valor = entradaDouble("");

        saida(placa, ano, valor);
    }

    public static void saida(String a, int b, double c){
        System.out.printf("=========================\nPlaca do Veiculo: %s\nAno do Veiculo: %d\nValor de Mercado do Veiculo: %2.f\n=========================\n",a,b,c);
    }
}