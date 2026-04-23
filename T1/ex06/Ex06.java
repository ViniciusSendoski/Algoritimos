// Faca um Programa que peça um numero correspondente a um determinado ano e em seguida informe se este ano e ou nao bissexto.
//  Para saber se determinado ano é bissexto, ele deve atender a pelo menos um dos seguintes critérios:
// ser divisível por 4 e não ser divisível por 100;
// ser divisível por 400. 

// $ javac Ex06.java && java Ex06

import java.util.Scanner;

public class Ex06 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }
    
    public static void main(String[] args) {
        int ano;

        // Chama funcao com entrada do programa
        ano = entradaInt("ano: ");
    
        // Chama funcao que utiliza condicao e da saida
        saidacomCondicao(ano);
    }

    public static void saidacomCondicao(int ano){
        if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}