// Faça um algoritmo que leia a base e a altura de um retângulo e exiba seu perímetro com 2 casas decimais. O perímetro é calculado por P=2×(base+altura)P=2×(base+altura).

// javac Exercicio_18.java && java Exercicio_18

import java.util.Scanner;

public class Exercicio_18 {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static double entradaDouble(String mensagem){
        System.out.print(mensagem);
        return scanner.nextDouble();
    }
    
    public static void main(String[] args) {
        double a = entradaDouble("Base: "), b = entradaDouble("Altura: ");
        saida(a,b);
    }

    public static void saida(double a, double b){
        System.out.printf("Perimetro = %.2f\n",(a+b)*2);
    }
}