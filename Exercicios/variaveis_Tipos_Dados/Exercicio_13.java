// Criar um algoritimo que leia o total de eleitores, votos em branco, nulos e validos. saida porcentagem em relação ao numero total de eleitores
// user@user:~$ javac Exercicio_13.java && java Exercicio_13

import java.util.Scanner;

public class Exercicio_13 {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] entradaInt(){
        int[] valor = new int[3];

        System.out.print("Digite Total de eleitores: ");
        valor[0] = scanner.nextInt();
        System.out.print("Digite Votos em branco: ");
        valor[1] = scanner.nextInt();
        System.out.print("Digite Votos nulos: ");
        valor[2] = scanner.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int[] valor = new int[4];
        double[] porcentagem = new double[3];

        valor = entradaInt();
        porcentagem = calculo(valor);

        saida(porcentagem, valor);
    }

    public static double[] calculo(int[] valor) {
        double[] porcentagem = new double[3];

        // Numeros devem ter .0 para forçar a dizer que é double
        porcentagem[0] = (valor[1] * 100.0) / valor[0];
        porcentagem[1] = (valor[2] * 100.0) / valor[0];
        porcentagem[2] = ((valor[0] - valor[1] - valor[2]) * 100.0) / valor[0];

        return porcentagem;
    }

    public static void saida(double[] porcentagem, int[] valor) {
        // printf(); permite formatacao complexa, para grandes contextos e entradas
        System.out.printf("\nNumero total de votos: %d \nVotos Validos: %d ou %.2f%%\nVotos em Branco: %d ou %.2f%% \nVotos Nulos: %d ou %.2f%% \n"
        ,valor[0],(valor[0] - valor [1] - valor[2]), porcentagem[2], valor[1],porcentagem[0],valor[2],porcentagem[1]); // Com isso separa saida de dados que estao na saida.s
    }
}