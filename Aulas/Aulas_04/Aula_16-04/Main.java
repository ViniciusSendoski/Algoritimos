// Explicação do (String[] args) pega o argumento passado junto na execução do java Main
// Ou seja fica no array args dados colocados em java Main 1 2 3 dados
// Sendo possivel recolher esses dados
// Nesse programa se rodar sem colocar dados nos agumentos havera o erro de: ArrayIndexOutOfBoundsException
// Pois o Arrylist estara vazio!

// $ javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Variaveis
        double valor_1, valor_2;
        char operador;

        System.out.println("=====");

        // Le argumentos passados
        System.out.println(args.length);
        // java Main oi tudo bem
        // =====
        // 3
        // para considerar apenas uma palavra aspas duplas
        // java Main oi "tudo bem"
        // =====
        // 2
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        // java Main oi tudo bem
        // =====
        // 3
        // oi
        // bem
        // tudo

        // Entradas sempre são Strings, deve se usar .parse mais o tipo para definir que dado é o que 
        valor_1 = Double.parseDouble(args[0]);
        valor_2 = Double.parseDouble(args[1]);
        operador = args[2].charAt(0);

        System.out.println("=====");
        System.out.println("valor_1: " + valor_1);
        System.out.println("valor_2: " + valor_2);
        System.out.println("Operador: " + operador);
        // java Main 6.50 4.00 +
    }
}