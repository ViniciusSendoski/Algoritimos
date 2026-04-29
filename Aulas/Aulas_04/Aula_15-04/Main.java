// if and if else
// javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static void main(String[] args){
        int valor;
        boolean escolha;

        valor = entradaInt("digite um numero: ");

        if (valor >= 0) {
            escolha = true;
        } else {
            escolha = false;
        }

        saida(escolha);
    }

    public static void saida(boolean escolha) {
        System.out.printf("Seu valor é maior que 0? %b\n", escolha);
    }
}
