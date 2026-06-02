// javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.println(mensagem);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numero, valor_inteiro;
        

        saidaFuncoes();

        do {
            valor_inteiro = entradaInt("Escolha a função: ");
            quebraLinha();

            switch (valor_inteiro) {
                case 1:
                    numero = entradaInt("Digite o numero: ");
                    divisiveisPorRestoDois(numero);
                    quebraLinha();
                    break;
                
                case 2:
                    
                    quebraLinha();
                    break;

                case 3:
                    
                    quebraLinha();
                    break;

                case 4:
                    
                    quebraLinha();
                    break;

                case 5:
                    
                    quebraLinha();
                    break;

                case 6:
                    
                    quebraLinha();
                    break;

                default:
                    break;
            }
        } while (valor_inteiro != 0);
    }
    
    // i=0; de i até 10000, mostre todos os numeroes que divididos por N tenham resto 2
    public static void divisiveisPorRestoDois(int numero) { 
        for (int i= 0; i < 10000; i++) {
            if (i % numero == 2) {
                System.out.println(i);
            }
        }
    }

    public static void quebraLinha(){
        System.out.println("#-----#-----#-----#");
    }

    public static void saidaFuncoes(){
        System.out.println("1 : De 1 até 10000, numeros que divididos por N tem resto 2");
        System.out.println("2 : ");
        System.out.println("3 : ");
        System.out.println("4 : ");
        System.out.println("5 : ");
        System.out.println("6 : ");
        System.out.println("0 : Sair do programa");
    }
}
