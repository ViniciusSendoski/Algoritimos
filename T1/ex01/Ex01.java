// Faça um algoritmo que leia os coeficientes a, b, c e d do sistema abaixo. Em seguida, leia os valores x1​ e x2​ e mostre os valores dos resultados y1​ e y2​.
// Formula : ax1​+bx2​=y1
// Formula : ​cx1​+dx2​=y2​​

// $ javac Ex01.java && java Ex01

import java.util.Scanner;

public class Ex01 {
    public static Scanner entrada = new Scanner(System.in);

    // Funcao para captar entradas do programa
    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int a, b, c, d, x1, x2, y1, y2;

        // Chama funcao de entrada
        a = entradaInt("a: ");
        b = entradaInt("b: ");
        c = entradaInt("c: ");
        d = entradaInt("d: ");
        x1 = entradaInt("x1: ");
        x2 = entradaInt("x2: ");

        // Chama funcao que calcula valores de y1 e y2
        y1 = calculoY1(a, b, x1, x2);
        y2 = calculoY2(c, d, x1, x2);

        // Chama funcao que apresenta saida
        saida(y1, y2);
    }

    public static int calculoY1(int a, int b, int x1, int x2){
        return a * x1 + b * x2;
    }

    public static int calculoY2(int c, int d, int x1, int x2){
        return c * x1 + d * x2;
    }

    public static void saida(int y1, int y2){
        System.out.printf("y1: %d\ny2: %d\n", y1, y2);
    }
}