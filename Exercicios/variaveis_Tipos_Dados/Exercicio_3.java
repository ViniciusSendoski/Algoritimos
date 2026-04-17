// Criar um algoritimo que leia e mostre o anterior o numero e posterior
// user@user:~$ javac Exercicio_3.java && java Exercicio_3

// Bibliotecas
import java.util.Scanner;

public class Exercicio_3 {
    public static Scanner scanner = new Scanner(System.in); 
    
    public static int entradaInt(){
        int numero;

        System.out.print("Digite valor:");
        numero = scanner.nextInt();

        return numero;
    }

    public static void main(String[] args){
        int numero;

        numero = entradaInt();
        saidaIntegrada(numero);
    }

    public static void saidaIntegrada(int numero){
        System.out.println("Numero anterior: " + (numero - 1) + "\nNumero: " + numero + "\nNumero posterior:" + (numero + 1));
    }
}