// Faça um algoritmo que recebe 3 números. Mostre-os em ordem, do menor para o maior.
// $ javac Ex05.java && java Ex05

import java.util.Scanner;

public class Ex05 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(){
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int menor, meio, maior;

        // Chama funcao com entrada do programa
        menor = entradaInt(); // Não foi solicitado nenhuma mensagem de entrada
        meio = entradaInt();
        maior = entradaInt();

        // Chama funcao com condicao e saida
        saidaComCondicao(menor, meio, maior);
    }

    public static void saidaComCondicao(int menor, int meio, int maior){
        // if () {}
    }
}
