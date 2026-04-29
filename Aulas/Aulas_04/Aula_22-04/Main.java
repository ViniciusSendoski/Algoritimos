// Switch case default 
// Estrutura de condicao, usada quando se sebe exatamente quais dados podem ser comparados para uma resposta.

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
    
    public static void main(String[] args){
        int numero;

        numero = entradaInt("Digite o numero do mês:");
    }
}
