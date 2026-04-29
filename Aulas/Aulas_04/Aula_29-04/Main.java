// Estruturas de repetição while (enquanto)
// $ javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        int numero;
        int valor_inicial, valor_final;
    
        saidaWhile();
        saidaQuebraLinha();

        numero = entradaInt("Digite até que numero deve repetir: ");
        saidaWhileEntrada(numero);
        saidaQuebraLinha();

        saidaWhileEntradaRegressivo(numero);
        saidaQuebraLinha();

        saidaWhileEntradaRegressivoCondicaoParImpar(numero);
        saidaQuebraLinha();

        valor_inicial = entradaInt("Valor inicial: ");
        valor_final = entradaInt("Valor final: ");
        saidaWhileDuasEntradasCresente(valor_inicial, valor_final);
        saidaQuebraLinha();

        numero = entradaInt("Digite o numero para taboada: ");
        saidaWhileEntradaTaboada(numero);
        saidaQuebraLinha();
    }

    public static void saidaWhile(){
        int i = 1;

        while (i <= 3) {
            System.out.println("numero "+ i);
            // Sem a incrementação a variavel de controle se repete infinitamente
            // Se a condicao por exemplo(i > 0), se repetira infinitamente por que i sempre sera maior que 0 
            i = i + 1;
        }
    }

    public static void saidaWhileEntrada(int numero) {
        int i = 1;

        while (i <= numero) {
            System.out.println("numero "+ i);
            i = i + 1;
        }
    }

    public static void saidaWhileEntradaRegressivo(int numero) {
        System.out.println("Do numero do usuario até 0");
        while (numero >= 0) {
            System.out.println("numero "+ numero);
            numero = numero - 1;
        }
    }

    public static void saidaWhileDuasEntradasCresente(int valor_inicial, int valor_final){
        if (valor_inicial <= valor_final) {
            while (valor_inicial <= valor_final) {
                System.out.println("numero "+ valor_inicial);
                valor_inicial ++; // Incrementa valor inicial + 1
            }
        } else {
            System.out.println("Seu valor inicial e maior que o final, essa funcao incrementa do incial até o final.");
        }
    }

    public static void saidaWhileEntradaTaboada(int numero) {
        int i = 1;
        //  Taboada até 20 para a entrada do usuario
        while (i <= 20) {
            System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
            i = i + 1;
        }
    }

    public static void saidaWhileEntradaRegressivoCondicaoParImpar(int numero) {
        System.out.println("Do numero do usuario até 0");
        while (numero >= 0) {
            if (numero % 2 == 0 && numero != 0) {
                System.out.println("numero "+ numero + " e par");
            } else if (numero == 0){
                System.out.println("numero "+ numero);
            } else {
                System.out.println("numero "+ numero + " e impar");
            }
            numero = numero - 1;
        }
    }

    public static void saidaQuebraLinha(){
        System.out.print("-----\n");
    }
}
