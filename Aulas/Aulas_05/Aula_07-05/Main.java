// Nessa aula foi abordado o laco Do While
// Funciona de forma que laco passe ao menos uma vez antes de verificar a condicao

// $ javac Main.java && java Main

import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int valor_inteiro, fim_programa;
        fim_programa = 0;

        funcoesEmAula();
        quebraLinha();

        do {
            valor_inteiro = entradaInt("Selecione a função: ");
            quebraLinha();
            switch (valor_inteiro) {
                case 0:
                    fim_programa = 1;
                    break;
            
                case 1:
                    doWhile();
                    quebraLinha();
                    break;
                
                case 2:
                    entradaIntNoNegative("Digite um numero não negativo: ");
                    quebraLinha();
                    break;

                case 3:

                    quebraLinha();
                    break;
                
                case 4:
                    valor_inteiro = entradaInt("Digite um numero: ");
                    divisoresPerfeitos(valor_inteiro);
                    quebraLinha();
                    break;

                case 5:
                    valor_inteiro = entradaInt("Digite o numeros de votos para essa eleicao(entrada do usuario):");
                    doisCandidatos(valor_inteiro);
                    quebraLinha();
                    break;
                default:
                    break;
            }
        } while (fim_programa == 0);
    }

    public static void doWhile(){
        int i = 1; 
        do { // passa ao menos uma vez antes que verificar condicao para continuar no programa
            System.out.println(i);
            i++;
        } while (i <= 10); // condicao para rodar novalemente
    }

    public static void doWhileEntrada(){
        int valor_inteiro;
        do {
            System.out.print("Digite um numero inteiro não negativo: ");
            valor_inteiro = entrada.nextInt();
        } while(valor_inteiro < 0);
    }

    public static int entradaIntNoNegative(String mensagem){
        int valor_inteiro;
        do {
            System.out.print(mensagem);
            valor_inteiro = entrada.nextInt();
        } while (valor_inteiro < 0);
        return valor_inteiro;
    }

    public static void divisoresPerfeitos(int valor_inteiro){
        // Um numero onde a soma de seus divisores sejá igual ao numero
        // Exemplo 6 = 3 + 2 + 1
        int i = 1;
        int soma = 0;

        do {
            if (valor_inteiro % i == 0) {
                soma += i; // soma = soma + i;
            }
            i++;
        } while(i < valor_inteiro);
        
        if (soma == valor_inteiro) {
            System.out.println(valor_inteiro + " é perfeito"); // true
        } else {
            System.out.println(valor_inteiro + " não é perfeito");
        }
    }

    public static void doisCandidatos(int quandidade_votos){
        int voto;
        int i = 0, candidato_1 = 0, candidato_2 = 0, voto_nulo = 0;
        do {
            voto = entradaInt("Digite 1 para Candidato_1 ou 2 para Candidato_2: ");
            if (voto == 1){
                candidato_1++;
            } else if (voto == 2){
                candidato_2++;
            } else {
                voto_nulo++;
            }
            i++;
        } while (i < quandidade_votos);

        if (candidato_1 == candidato_2) {
            System.out.printf("\nA eleição teve %d votos totais, dos quais:\nVotos para o Candidado_1: %d\nVotos para o Candidato_2: %d\nVotos nulos: %d\nO vencedor da eleição foi Empate\n", quandidade_votos, candidato_1, candidato_2, voto_nulo);
        } else if (candidato_1 > candidato_2){
            System.out.printf("\nA eleição teve %d votos totais, dos quais:\nVotos para o Candidado_1%d\nVotos para o Candidato_2%d\nVotos nulos%d\nO vencedor da eleição foi Candidato_1\n", quandidade_votos, candidato_1, candidato_2, voto_nulo);
        } else {
            System.out.printf("\nA eleição teve %d votos totais, dos quais:\nVotos para o Candidado_1%d\nVotos para o Candidato_2%d\nVotos nulos%d\nO vencedor da eleição foi Candidato_2\n", quandidade_votos, candidato_1, candidato_2, voto_nulo);
        }
    }

    public static void quebraLinha(){
        System.out.println("-----");
    }

    public static void funcoesEmAula(){
        System.out.println("1: Exemplo Do while");
        System.out.println("2: Entrada com Do while nao negativo");
        System.out.println("3: Do while nao negativo na entrada");
        System.out.println("4: Um numero e perfeito se seus divisores forem nomados e iguais ao numero");
        System.out.println("5: Apartir da quantidade de votos diga qual candidato venceu a eleicao");
        System.out.println("0: Sair do programa");
    }
}