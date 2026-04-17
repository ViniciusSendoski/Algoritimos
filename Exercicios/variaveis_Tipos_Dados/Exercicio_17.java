// Na equação AX1 + BX2 = Y1 // CX1 + DX2 = Y2, entradas a b c d x1 x2, saida y1 e y2
// user@user:~$ javac Exercicio_17.java && java Exercicio_17

import java.util.Scanner;

public class Exercicio_17 {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] entradaInt(){
        int[] valor = new int[8];

        System.out.print("Digite Valor A: ");
        valor[0] = scanner.nextInt();
        System.out.print("Digite Valor B: ");
        valor[1] = scanner.nextInt();
        System.out.print("Digite Valor C: ");
        valor[2] = scanner.nextInt();
        System.out.print("Digite Valor D: ");
        valor[3] = scanner.nextInt();
        System.out.print("Digite Valor X1: ");
        valor[4] = scanner.nextInt();
        System.out.print("Digite Valor X2: ");
        valor[5] = scanner.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int[] valor = new int[8];

        valor = entradaInt();

        valor = calculo(valor);

        saida(valor);   
    }

    public static int[] calculo(int[] valor){
        // Y1
        valor[6] = (valor[0] * valor[4]) + (valor[1] * valor[5]);
        // Y2
        valor[7] = (valor[2] * valor[4]) + (valor[3] * valor[5]);

        return valor;
    }

    public static void saida(int[] valor){
        System.out.printf("\nNa equacao AX1 + BX2 = Y1, Y1: %d \nNa eguacao CX1 + DX2 = Y2, Y2: %d\n",valor[6], valor[7]);
    }
}