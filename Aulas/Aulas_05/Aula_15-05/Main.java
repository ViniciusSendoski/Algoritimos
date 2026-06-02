//

// javac Main.java && java Main

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

        saidaFuncoes();

        do {
            valor_inteiro = entradaInt("Escolha a função: ");
            quebraLinha();

            switch (valor_inteiro) {
                case 1:
                    numero = entradaInt("Digite tamanho piramide: ");
                    saidaPiramide(numero);
                    quebraLinha();
                    break;
                
                case 2:
                    scanner.nextLine(); // Limpa Buffer de entrada, evita que ao executar de mensagem antes de pedir leitura.
                    senhaFixa();
                    quebraLinha();
                    break;

                case 3:
                    corridaLesma();
                    quebraLinha();
                    break;

                default:
                    break;
            }
        } while (valor_inteiro != 0);
    }

    public static void saidaPiramide(int numero){
        int i, j, k = 0, n_i = 0, n_j = 1;
        
        n_i = numero - 1;

        while (k<numero) {
            for(i = 0; i<n_i; i++){
                System.out.print("_");
            }
            for(j = 0; j<n_j; j++){
                System.out.print("*");
            }
            for(i = 0; i<n_i; i++){
                System.out.print("_");
            }
            System.out.println();
            n_j+=2;
            n_i--;
            k++;
        }
    }
    

    public static void senhaFixa(){
        String lockedKey;
        
        do {
            lockedKey = entradaString("");
            if (!lockedKey.equals("2002")){
                System.out.println("Senha Invalidada");
            }
        } while (!lockedKey.equals("2002"));
        System.out.println("Acesso Permitido");
    }

    public static void corridaLesma(){
        int l, vi, vi_max = 0;

        l = entradaInt("");
        
        for (int i = 0; i < l; i++){
            vi = entradaInt("");
            if (vi > vi_max){
                vi_max = vi;
            } 
        }
        if (vi_max < 10) {
            System.out.println(1);
        } else if (vi_max >= 10 && vi_max < 20) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    public static void quebraLinha(){
        System.out.println("#-----#-----#-----#");
    }

    public static void saidaFuncoes(){
        System.out.println("1 : Desenhe, desenhe uma piramide!");
        System.out.println("2 : Senha Fixa, \"2002\"");
        System.out.println("3 : Corrida das lesmas!");
        System.out.println("0 : Sair do programa");
    }
}