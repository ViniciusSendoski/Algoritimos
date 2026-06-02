// javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int numero, valor_inteiro;

        saidaFuncoes();

        do {
            valor_inteiro = entradaInt("Escolha a função: ");
            quebraLinha();

            switch (valor_inteiro) {
                case 1:
                    numero = entradaInt("Digite o tamanho do quadrado: ");
                    quadradoFor(numero);
                    quebraLinha();
                    break;
            
                default:
                    break;
            }
        } while (valor_inteiro != 0);
        

        
    }

    public static void quadradoFor(int numero){
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
        public static void quebraLinha(){
        System.out.println("#-----#-----#-----#");
    }

    public static void saidaFuncoes(){
        System.out.println("1 : Desenhe, desenhe um quadrado");
        System.out.println("0 : Sair do programa");
    }
}
