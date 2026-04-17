// Criar um algoritimo que leia a salario e vendas e entregue comissao mais vendas
// user@user:~$ javac Exercicio_7.java && java Exercicio_7

import java.util.Scanner;

public class Exercicio_7 {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] entradaDouble(){
        double[] valor = new double[4];

        System.out.print("Digite o salario base: ");
        valor[0] = scanner.nextDouble();
        System.out.print("Vendas do mês: ");
        valor[1] = scanner.nextDouble();

        return valor;
    }

    public static void main(String[] args) {
        double[] valor = new double[4];
        
        valor = entradaDouble();
        valor = calculoComissao(valor);

        saidaIntegrada(valor);
    }

    public static double[] calculoComissao(double[] valor){
        valor[2] = (valor[1] * 5) / 100;
        valor[3] = valor[2] + valor[0]; // Salario + comissao

        return valor;
    }

    public static void saidaIntegrada(double[] valor){
        System.out.println("Seu salario: " + valor[0] + "\nSeu valor em vendas: " + valor[1] + "\nSeu valor de 5% em comissoes: " + valor[2] + "\nSeu Salario total:" + valor[3]);
    }
}