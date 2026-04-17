// Criar um algoritimo que mostre valor ao quadrado
// user@user:~$ javac Exercicio_1.java && java Exercicio_1

public class Exercicio_1 {
    // Funções de entrada
    public static int entradaInt(){
        int numero;

        numero = 76;

        return numero;
    }

    public static void main(String[] args) {
        double numero, numero_quadrado;

        numero = entradaInt();
        numero_quadrado = calculo(numero);
        saida(numero, numero_quadrado);
    }

    // Funções de execução
    public static double calculo(double numero) {
        double numero_quadrado;

        numero_quadrado = numero * numero;

        return numero_quadrado;
    }

    public static void saida(double numero, double numero_quadrado) {
        System.out.println("O valor " + numero + " ao quadrado e " + numero_quadrado);
    }
}