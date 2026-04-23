// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
// “Telefonou para a vítima?”
// “Esteve no local do crime?”
// “Mora perto da vítima?”
// “Devia para a vítima?”
// “Já trabalhou com a vítima?”
// Ao final, o programa deve emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. 
// Caso contrário, ele será classificado como “Inocente”.

// $ javac Ex07.java && java Ex07

import java.util.Scanner;

public class Ex07 {
    public static Scanner entrada = new Scanner(System.in);

    public static char entradaChar(String mensagem){
        System.out.print(mensagem);
        return entrada.next().charAt(0);
    }

    public static void main(String[] args) {
        char resA, resB, resC, resD, resE;
        
        // Chama funcao com entrada do programa
        resA = entradaChar("Telefonou para a vítima? ");
        resB = entradaChar("Esteve no local do crime? ");
        resC = entradaChar("Mora perto da vítima? ");
        resD = entradaChar("Devia para a vítima? ");
        resE = entradaChar("Já trabalhou com a vítima? ");

        // Chama funcao que utiliza condicao e da saida
        saidaComCondicao(resA, resB, resC, resD, resE);
    }

    public static void saidaComCondicao(char resA, char resB, char resC, char resD, char resE){
        int respostas = 0; 
        if (resA == 's') { // Conta questoes confirmadas
            respostas = respostas + 1;
        }
        if (resB == 's') {
            respostas = respostas + 1;
        }
        if (resC == 's') {
            respostas = respostas + 1;
        }
        if (resD == 's') {
            respostas = respostas + 1;
        }
        if (resE == 's') {
            respostas = respostas + 1;
        }
        if (respostas == 2) { // Com base nas questões define o estado do individuo
            System.out.println("Suspeita");
        } else if (respostas == 3 || respostas == 4) {
            System.out.println("Cúmplice");
        } else if (respostas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}