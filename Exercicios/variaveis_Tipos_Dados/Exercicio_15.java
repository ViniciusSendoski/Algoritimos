// Na equação AX + B = 0, quanto é X
// user@user:~$ javac Exercicio_15.java && java Exercicio_15

import java.util.Scanner;

public class Exercicio_15 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[3];

        System.out.print("Digite Valor A: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Digite Valor B: ");
        valor[1] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args) {
        double[] valor = new double[3];

        valor = entradaDouble();

        if (valor[0] == 0){
            System.out.println("Valor A, não pode ser zero(Divisão por zero).");
        }else if (valor[1] == 0){ 
            System.out.println("Valor B é 0, logo X é 0.");
        }else{
            valor = calculo(valor);

            saida(valor);   
        }
    }

    public static double[] calculo(double[] valor){
            valor[2] = (-valor[1]) / valor[0];

        return valor;
    }

    public static void saida(double[] valor){
        System.out.printf("\n Na equação AX + B = 0, quanto é X: %.2f\n",valor[2]);
    }
}