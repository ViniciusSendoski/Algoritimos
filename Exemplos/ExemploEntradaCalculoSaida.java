// Exemplo a soma de a e b é maior que C, se não for multiplique a mais b por C
// $ javac ExemploEntradaCalculoSaida.java && java ExemploEntradaCalculoSaida

import java.util.Scanner;

public class ExemploEntradaCalculoSaida {
    // Declara função Scanner de forma publica permitindo ser usada em qualquer funcao
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args){
        // Atribui variaveis que serão usadas
        int a, b, c, somaAB, multiC;

        // Entradas do codigo
        System.out.print("Digite o primeiro valor: ");
        a = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = teclado.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = teclado.nextInt();

        // Processamento
        somaAB = a + b;
        multiC = somaAB * c;

        // Decisao logica
        if (somaAB > c) {
            // Saida
            System.out.printf("A soma de %d e %d e maior que %d \n", a, b, c);
        } else 
        {
            // Saida
            System.out.printf("A soma de %d e %d sendo multiplidaca por %d : %d \n", a, b, c, multiC);
        }

        teclado.close(); // Finalisa funcao Scanner
    }
}