// Este arquivo define entrada e saida 
// Run: javac Main.java && java Main

// Chamada da funcao externa Scanner para entrada no terminal
import java.util.Scanner;

public class Main{
    // Chama função que le do teclado
    public static Scanner teclado = new Scanner(System.in);

    // Para entrada de Inteiro
    public static int entradaInt(){
        int numero;

        System.out.print("Digite um numero inteiro: ");
        numero = teclado.nextInt();

        return numero;
    }

    public static int entradaIntIntegrada(String mensagem){
        int numero;

        System.out.print(mensagem);
        numero = teclado.nextInt();

        return numero;
    }

    // Para entrada de Real
    public static double entradaDouble(){
        double numero;

        System.out.print("Digite um numero real(separa numero use a virgula): ");
        numero = teclado.nextDouble();

        return numero;
    }

    public static double entradaDoubleIntegrada(String mensagem){
        double numero;

        System.out.print(mensagem);
        numero = teclado.nextDouble();

        return numero;
    }

    // Para entrada de Boolean(Logico verdadeiro ou falso)
    public static boolean entradaBoolean(){
        boolean escolha;

        System.out.print("Digite se é verdadeiro ou falso(true/false): ");
        escolha = teclado.nextBoolean();

        return escolha;
    }

    public static boolean entradaBooleanIntegrada(String mensagem){
        boolean escolha;

        System.out.print(mensagem);
        escolha = teclado.nextBoolean();

        return escolha;
    }

    // Para entrada de para um Caracter
    public static char entradaChar(){
        char letra;

        System.out.print("Digite um caracter: ");
        letra = teclado.next().charAt(0);

        return letra;
    }

    public static char entradaCharIntegrada(String mensagem){
        // É
        System.out.print(mensagem);

        return teclado.next().charAt(0);
    }


    // Para entrada de um conjunto de Caracteres
    public static String entradaString(){
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = teclado.nextLine();

        return palavra;
    }

        public static String entradaStringIntegrada(String mensagem){
        // Diferente dos tipos anteriores é possivel lançar direto o resultado na saida de função
        System.out.print(mensagem);

        return teclado.nextLine();
    }

    public static void main(String[] args){
        int numero;
        double numeroReal;
        boolean escolha;
        char letra;
        String palavra;

        // Entrada com mensagem na função
        numero = entradaInt();
        numeroReal = entradaDouble();
        escolha = entradaBoolean();
        letra = entradaChar();

        // O nextLine não trata do Enter caso venha depois de uma entrada anterior
        // O comando que limpa o buffer para dar uma String
        teclado.nextLine();

        palavra = entradaString();

        quebraLinha();

        // Tambem é possivel realizar a entrada com uma mensagem integrada
        // Muito util para reutilizar a função varias vezes sem precisar altera-la

        numero = entradaIntIntegrada("Digite um numero: ");
        numeroReal = entradaDoubleIntegrada("Digite um numero real(separa numero use a virgula): ");
        escolha = entradaBooleanIntegrada("Digite se é verdadeiro ou falso(true/false): ");
        letra = entradaCharIntegrada("Digite um caracter: ");

        // O comando que limpa o buffer para dar uma String
        teclado.nextLine();

        palavra = entradaStringIntegrada("Digite uma palavra: ");

        // Fecha o Scanner logo não permite mais entradas
        // Boa pratica para adicionar a o fim do Main no java
        teclado.close();
    }

    public static void quebraLinha(){
        System.out.println(" --- --- ---");
    }
}