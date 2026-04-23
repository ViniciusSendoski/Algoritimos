// Faça um programa para um caixa eletrônico.
// O programa deverá perguntar ao usuário a valor que deseja sacar e em seguida informar quantas notas de cada valor serão fornecidas, apresentando o maior número possível de notas de maior valor.
// As notas disponíveis são de 1, 5, 10, 50 e 100 Reais. 
// O valor mínimo é de R$ 1,00 e o máximo de R$ 600,00. 
// O programa não deve se preocupar com a quantidade de notas existentes na máquina.

// $ javac Ex04.java && java Ex04

import java.util.Scanner;

public class Ex04 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int valor, nota100, nota50, nota10, nota5, nota1;

        // Chama funcao com entrada de valor
        valor = entradaInt("valor: ");

        // Chama funcoes que calculao o numero de notas
        nota100 = calculaNota100(valor);
        valor = calculaValorMenosNota(valor, nota100 * 100);
        nota50 = calculaNota50(valor);
        valor = calculaValorMenosNota(valor, nota50 * 50);
        nota10 = calculaNota10(valor);
        valor = calculaValorMenosNota(valor, nota10 * 10);
        nota5 = calculaNota5(valor);
        nota1 = calculaValorMenosNota(valor, nota5 * 5);

        // Chama funcao com estruturas de condicao que apresentao a saida
        saidaComCondicao(nota100, nota50, nota10, nota5, nota1);
    }
    
    public static int calculaValorMenosNota(int valor,int nota){
        return valor - nota;
    } 

    public static int calculaNota100(int valor){
        return valor / 100;
    }
    
    public static int calculaNota50(int valor){
        return valor / 50;
    }

    public static int calculaNota10(int valor){
        return valor / 10;
    }

    public static int calculaNota5(int valor){
        return valor / 5;
    }

    public static void saidaComCondicao(int nota100, int nota50, int nota10, int nota5, int nota1){
        if (nota100 == 0){
            // Nao faz nada pois nao tem notas
        } else if (nota100 == 1) {
            System.out.printf("%d nota de R$100\n", nota100);
        } else {
            System.out.printf("%d notas de R$100\n", nota100);
        }

        if (nota50 == 0){
            // Nao faz nada pois nao tem notas
        } else if (nota50 == 1) {
            System.out.printf("%d nota de R$50\n", nota50);
        } else {
            System.out.printf("%d notas de R$50\n", nota50);
        }

        if (nota10 == 0){
            // Nao faz nada pois nao tem notas
        } else if (nota10 == 1) {
            System.out.printf("%d nota de R$10\n", nota10);
        } else {
            System.out.printf("%d notas de R$10\n", nota10);
        }

        if (nota5 == 0){
            // Nao faz nada pois nao tem notas
        } else if (nota5 == 1) {
            System.out.printf("%d nota de R$5\n", nota5);
        } else {
            System.out.printf("%d notas de R$5\n", nota5);
        }

        if (nota1 == 0){
            // Nao faz nada pois nao tem notas
        } else if (nota1 == 1) {
            System.out.printf("%d nota de R$1\n", nota1);
        } else {
            System.out.printf("%d notas de R$1\n", nota1);
        }
    }
}