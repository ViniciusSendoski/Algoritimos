// Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte:
// Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área.
// Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
// Se o número de lados for igual a 5 escrever PENTÁGONO.
// Acrescente as seguintes mensagens à solução do exercício anterior, conforme o caso.
//  Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
//  Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

// $ javac Ex07.java && java Ex07

import java.util.Scanner;

public class Ex08 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static double entradaDouble(String mensagem){
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public static void main(String[] args) {
        int lados;
        double lado;

        // Chama funcoes com entrada do programa
        lados = entradaInt("lados: ");
        lado = entradaDouble("lado: ");

        // Chama funcao que utiliza condicao e da saida
        saidaComCondicao(lados, lado);
    }

    public static void saidaComCondicao(int lados, double lado){
        double area; 
        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (lados == 3) {
            area = (Math.sqrt(3.0)/4.0) * Math.pow(lado, 2.0);
            System.out.printf("TRIÂNGULO\narea: %.1f\n", area);
        } else if (lados == 4) {
            area = Math.pow(lado, 2.0);
            System.out.printf("QUADRADO\narea: %.1f\n", area);
        } else if (lados == 5) { 
            System.out.println("PENTÁGONO");
        } else {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
    }
}
