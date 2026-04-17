// Criar um algoritimo que leia e mostre valor ao quadrado
// user@user:~$ javac Exercicio_2.java && java Exercicio_2

// Bibliotecas
import java.util.Scanner;

public class Exercicio_2 {

    public static Scanner scanner = new Scanner(System.in);

    // Funções de entrada
    public static int entradaInt() {
        int numero;
        
        System.out.print("Digite valor: ");
        numero = scanner.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        double numero_quadrado;
        int numero;

        numero = entradaInt();
        numero_quadrado = calculo(numero);
        saida(numero, numero_quadrado);
    }

    // Funções de execução
    public static double calculo(int numero) {
        double numero_quadrado;

        numero_quadrado = numero * numero;

        return numero_quadrado;
    }

    // Saida
    public static void saida(int numero, double numero_quadrado) {
        System.out.println("O valor " + numero + " ao quadrado e " + numero_quadrado);
    }
}