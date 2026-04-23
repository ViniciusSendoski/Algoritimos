// Faça um algoritmo que recebe 3 números. Mostre-os em ordem, do menor para o maior.
// Considere apenas a função chamada no main(String[] ars), uma que eu descobri gracas a AI e escolhi não usar, a outra foi passada na aula de fluxograma. 
// $ javac Ex05.java && java Ex05

import java.util.Scanner;

public class Ex05 {
    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(){
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int menor, meio, maior;

        // Chama funcao com entrada do programa
        menor = entradaInt(); // Não foi solicitado nenhuma mensagem de entrada
        meio = entradaInt();
        maior = entradaInt();

        // Chama funcao com condicao e saida
        saidaComCondicaoForcaBruta(menor, meio, maior); // Existem 3! possibilidades para se testar
    }

    // Boa e velha forca bruta
    public static void saidaComCondicaoForcaBruta(int menor, int meio, int maior){
        int temp;
        if (menor <= meio && meio <= maior){ // Esta na ordem correta - menor meio maior
        } else if (menor >= meio && meio >= maior){ 
            temp = maior; // Esta ao contrario. Ordem  - maior meio menor
            maior = menor;
            menor = temp;
        } else if (menor <= maior && meio >= maior) { 
            temp = maior; // meio e o maior. Ordem - menor maior meio
            maior = meio;
            meio = temp;
        } else if (meio <= menor && maior >= menor) { 
            temp = meio; // menor esta no meio. Ordem - meio menor maior
            meio = menor;
            menor = temp;
        } else if (maior <= menor && meio >= menor) { 
            temp = maior; // menor e maior e maior esta no meio. Ordem - maior menor meio
            maior = menor;
            menor = temp;
            temp = maior; // meio e o maior. Ordem - menor maior meio
            maior = meio;
            meio = temp;
        } else { 
            temp = maior;  // Ordem - meio maior menor
            maior = menor;
            menor = temp;
            temp = meio; // Ordem - meio menor maior
            meio = menor;
            menor = temp;  
        } 
        System.out.printf("%d\n%d\n%d\n",menor, meio, maior);
    }

}
