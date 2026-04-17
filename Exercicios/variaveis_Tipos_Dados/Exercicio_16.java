// Na equação AX² + BX + C = 0 descubra duas raises da equação e o delta
// user@user:~$ javac Exercicio_16.java && java Exercicio_16

import java.util.Scanner;

public class Exercicio_16 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[6];

        System.out.print("Digite Valor A: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Digite Valor B: ");
        valor[1] = scanner.nextDouble();
        System.out.print("Digite Valor C: ");
        valor[2] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args) {
        double[] valor = new double[6];

        valor = entradaDouble();

        valor = calculo(valor);

        saida(valor);   
    }

    public static double[] calculo(double[] valor){
            // Delta = (-B)² - 4 * A * C
            // Em (-B)², qualquer valor positivo ou negativo ao quadrado fica positivo
            valor[3] = Math.pow((valor[1]), 2.0) - (4.0 * valor[0] * valor[2]); 
            // Para usar pow() e sqrt() é necessario a função do java Math.

            // Raiz positiva = ((-B) + raiz quadrada de Delta) / 2 * A
            valor[4] = ((- valor[1]) + Math.sqrt(valor[3])) / (2.0 * valor[0]);
            // Raiz negativa = ((-B) - raiz quadrada de Delta) / 2 * A
            valor[5] = ((- valor[1]) - Math.sqrt(valor[3])) / (2.0 * valor[0]);

        return valor;
    }

    public static void saida(double[] valor){
        System.out.printf("\n Na equação AX² + BX + C = 0, Delta: %.2f; Raiz positiva: %.2f; Raiz negativa: %.2f\n",valor[3], valor[4], valor[5]);
    }
}