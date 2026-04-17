// Faça um algoritmo que leia a distância percorrida por um veículo e a quantidade de combustível gasta. Mostre o consumo médio em quilômetros por litro.
// Formula : distancia / combustivel  = consumo

// $ java Ex03.java && java Ex03

import java.util.Scanner;

public class Ex03 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int distancia, combustivel;
        double consumo;

        // Chama funcao de entrada
        distancia = entradaInt("distancia: ");
        combustivel = entradaInt("combustivel: ");

        // Chama funcao que calcula consumo
        consumo = calculaConsumo(distancia, combustivel);

        // Chama funcao que apresenta consumo
        saida(consumo);
    }

    public static double calculaConsumo(int distancia, int combustivel){
        return distancia / combustivel;
    }

    public static void saida(double consumo){
        System.out.printf("consumo: %.1f\n", consumo);
    }
}