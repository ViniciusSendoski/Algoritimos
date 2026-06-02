// javac Main.java 
// time java Main

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static String entradaString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        int numero, valor_inteiro;
        String palavra;

        saidaFuncoes();

        do {
            valor_inteiro = entradaInt("Escolha a função: ");
            quebraLinha();

            switch (valor_inteiro) {
                case 1:
                    numero = entradaInt("Digite o tamanho do quadrado cortado na diagonal: ");
                    quadradoDiagonalEsquerda(numero);
                    quebraLinha();
                    break;
                
                case 2:
                    numero = entradaInt("Digite o tamanho do quadrado cortado na diagonal direita: ");
                    quadradoDiagonalDireita(numero);
                    quebraLinha();
                    break;

                case 3:
                    numero = entradaInt("Digite o intervalo que buscara primos: ");
                    buscaPrimeo(numero);
                    quebraLinha();
                    break;

                case 4:
                    numero = entradaInt("Digite o intervalo que buscara primos: ");
                    buscaPrimeoCont(numero);
                    quebraLinha();
                    break;

                case 5:
                    numero = entradaInt("Digite o intervalo que buscara primos: ");
                    buscaPrimeoContEficiente(numero);
                    quebraLinha();
                    break;

                case 6:
                    numero = entradaInt("Digite o numero de para Fibonacci: ");
                    fibonacci(numero);
                    quebraLinha();
                    break;

                default:
                    break;
            }
        } while (valor_inteiro != 0);
    }

    public static void quadradoDiagonalEsquerda(int numero){
        for (int i = 1; i <= numero; i++){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void quadradoDiagonalDireita(int numero){
        int k = 1, j, i, x = numero;

        do {
            for (i = 1; i < x; i++){
                System.out.print(" ");
            }
            for (j = 0; j < k; j++){
                System.out.print("*");
            }
            System.out.println();
            x--;
            k++;
        } while (k <= numero);
    }
    
    public static void buscaPrimeo(int numero){
        Boolean primo;
        for (int i = 2; i < numero; i++){
            primo = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                primo = false;
                }
            }
            if (primo){
                System.out.printf("%d\n", i);
            }
        }
        System.out.println("é primo");
    }

    public static void buscaPrimeoCont(int numero){
        Boolean primo;
        int k = 0;
        for (int i = 2; i < numero; i++){
            primo = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primo = false;
                }
            }
            if (primo){
                k++;
                System.out.printf("%d\n", i);
            }
        }
        System.out.println("é primo, existem "+ k +" no intervalo");
    }

    public static void buscaPrimeoContEficiente(int numero){
        Boolean primo;
        int k = 0;
        for (int i = 2; i < numero; i++){
            primo = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primo = false;
                    break; // finalisa o for (int j), laço atual
                }
            }
            if (primo){
                k++;
                System.out.printf("%d\n", i);
            }
        }
        System.out.println("é primo, existem "+ k +" no intervalo");
    }

    public static void fibonacci(int numero){
        int ultimo = 1, atual = 0;
        int temp;
        for (int i = 0; i < numero; i++){
            if (i == 1 || i == 2){
                System.out.println(i);
            } else {
                temp = ultimo + atual;
                System.out.println(temp); // 1 + 0 = 1 // 1+1 = 2 // 1 + 2 = 3 // 2 + 3 = 5 // 5 + 3 = 8
                atual = ultimo;
                ultimo = temp;
            }
            
        } 
    }

    
    public static void quebraLinha(){
        System.out.println("#-----#-----#-----#");
    }

    public static void saidaFuncoes(){
        System.out.println("1 : Quadrado cortado na diagonal para a esquerda");
        System.out.println("2 : Quadrado cortado na diagonal para a direita");
        System.out.println("3 : Verifica qual numero no intervalo é primo");
        System.out.println("4 : Verifica qual numero no intervalo é primo, contando quantos são no intervalo");
        System.out.println("5 : Verifica qual numero no intervalo é primo, contando quantos são no intervalo, mas eficiente");
        System.out.println("6 : Fibonnaci");
        System.out.println("0 : Sair do programa");
    }
}
