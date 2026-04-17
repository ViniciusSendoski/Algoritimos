// Criar um algoritimo que leia a emperatura em celsos e retorne em fahrenheit
// user@user:~$ javac Exercicio_6.java && java Exercicio_6

import java.util.Scanner;

public class Exercicio_6 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(){
        int temperatura;

        System.out.print("Escreva a temperatura em Celsos: ");
        temperatura = scanner.nextInt();

        return temperatura;
    }

    public static void main(String[] args){
        int temperatura;

        temperatura = entradaInt();

        saidaIntegrada(temperatura);
    }

    public static void saidaIntegrada(int temperatura) {
        double fahrenheit;

        // Necessario adicionar .0 no valor para forçar ao java considerar o valor como Real e não inteiro
        fahrenheit = (temperatura * (9.0/5.0)) + 32;

        System.out.println("Sua temperatura em Fahrenheit: " + fahrenheit);
    }
}