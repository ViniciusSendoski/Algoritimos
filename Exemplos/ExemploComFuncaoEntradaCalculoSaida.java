// Exemplo a soma de a e b é maior que C, se não for multiplique a mais b por C
// $ javac ExemploComFuncaoEntradaCalculoSaida.java && java ExemploComFuncaoEntradaCalculoSaida

import java.util.Scanner;

public class ExemploComFuncaoEntradaCalculoSaida {
    // Declara função Scanner de forma publica permitindo ser usada em qualquer funcao
    public static Scanner teclado = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return teclado.nextInt();
    }

    public static void main(String[] args){
        // Atribui variaveis que serão usadas
        int a, b, c, somaAB, multiC;

        // Chama Função de Entradas do codigo
        a = entradaInt("Digite o primeiro valor: ");
        b = entradaInt("Digite o segundo valor: ");
        c = entradaInt("Digite o terceiro valor: ");

        // Processamento
        somaAB = calculoSomaAB(a,b);
        multiC = calculoMultiC(somaAB, c);

         // Decisao logica
        if (somaAB > c) {
            // Saida True
            saidaSomaAB(a,b,c);
        } else 
        {
            // Saida False
            saidaMultiC(a,b,c,multiC);
        }
    }

    public static int calculoSomaAB(int a, int b){
        return a + b;
    }

    public static int calculoMultiC(int somaAB, int c) {
        return somaAB * c;
    }

    public static void saidaSomaAB(int a, int b, int c){
        System.out.printf("A soma de %d e %d e maior que %d \n", a, b, c);
    }

     public static void saidaMultiC(int a, int b, int c, int multiC){
        System.out.printf("A soma de %d e %d sendo multiplidaca por %d : %d \n", a, b, c, multiC);
     }
}