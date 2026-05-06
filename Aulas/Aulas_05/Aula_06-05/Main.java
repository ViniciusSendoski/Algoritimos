// Nessa aula foi abordado o laco for
// for é para quanse se sabe o numero exatado da repeticao
// $ Javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    
    public static int entradaInt(String mensagem){
        System.out.print(mensagem);
        return entrada.nextInt();
    }
    public static void main(String[] args) {
        // Variaveis
        int valor_inteiro, valor_funcao, fim_programa;
        fim_programa = 1;
        
        // Chamadas de funcao no switch
        saidaExplicacaoFuncoes();
        while (fim_programa == 1) {
            // Deve ficar no inicio para não rodar 2 vezes antes de fechar
            valor_funcao = entradaInt("Digite o numero da função executar: ");
            quebraLinha();
            
            switch (valor_funcao) {
            case 0:
                fim_programa = 0;
                break;
            
            case 1:
                whileAteDez(); // Visto na ultima aula
                quebraLinha();
                break;
            
            case 2:
                // Ideial quando a atualizacao do contador já sabe o numero total de atualizações.
                primeiroFor(); 
                quebraLinha();
                break;

            case 3:
                valor_inteiro = entradaInt("Nuemro para a taboada: ");
                taboadaFor(valor_inteiro);
                quebraLinha();
                break;

            case 4:
                valor_inteiro = entradaInt("Digite um numero e mostre os quadrados de 1 ao numero por linha: ");
                numerosQuadradosFor(valor_inteiro);
                break;

            case 5:
                valor_inteiro = entradaInt("Digite N: ");
                somaNpares(valor_inteiro);
                quebraLinha();
                break;

            case 6:
                valor_inteiro = entradaInt("Digite um numero para saber os divisores: ");
                divisoresMesmoNfor(valor_inteiro);
                quebraLinha();
                break;

            case 7:
                valor_inteiro = entradaInt("Digite um numero para testar se é primo: ");
                primoFor(valor_inteiro);
                quebraLinha();
                break;            
            default:
                break;
            }
        }  
    }

    public static void whileAteDez(){
        int i;
        i = 0;

        while (i <= 10) { // Mostre os numeros inteiros de 0 a 10
            System.out.println(i);
            i++;
        }
    }

    public static void primeiroFor(){
        for (int i = 0; i <=10; i++){
            System.out.println(i);
        }
    }

    public static void taboadaFor(int valor_inteiro){
        // i = i + 1
        // i += 1
        // i++
        for (int i = 0; i <=10; i++){
            System.out.printf("%d x %d = %d\n", valor_inteiro, i, valor_inteiro*i);
        }
    }

    public static void numerosQuadradosFor(int valor_inteiro){
        for (int i = 1; i <= valor_inteiro; i++){
            System.out.println(i * i);
        }
    }

    public static void somaNpares(int valor_inteiro) {
        // se o usuario digita 3 a saida é 2 + 4 + 6
        // soma = soma + (2 * i)
        // soma += 2 * i
        int soma = 0;
        for (int i = 1; i <= valor_inteiro; i++){
            soma += 2 * i;
        }
        System.out.println("A soma dos pares de " + valor_inteiro + " é igual a " + soma);
    }

    public static void divisoresMesmoNfor(int valor_inteiro){
        for (int i = 1; i < valor_inteiro; i++){
            if (valor_inteiro % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void primoFor(int valor_inteiro){
        int primo = 0;
        for (int i = 1; i <= valor_inteiro; i++){
            if (valor_inteiro % i == 0) {
                primo++;
            }
        }
        
        if (primo == 2) {
            System.out.println(valor_inteiro + " é um numero primo");
        } else {
            System.out.println(valor_inteiro + " não é um numero primo");
        }
        boolean eh_primo = true;

        for (int j = 2; j < valor_inteiro; j++){
            if (valor_inteiro % j == 0) {
                eh_primo = false;
            }
        }
        
        if (eh_primo) {
            System.out.println(valor_inteiro + " é um numero primo");
        } else {
            System.out.println(valor_inteiro + " não é um numero primo");
        }
    }

    public static void quebraLinha(){
        System.out.println("-----");
    }

    public static void saidaExplicacaoFuncoes(){
        // System.out.println("");
        System.out.println("1 : Funcao while explicada da ultima aula");
        System.out.println("2 : Desmostação de for de 1 a 10");
        System.out.println("3 : Taboada com for");
        System.out.println("4 : Digite um numero e mostre o quadrado até o numero");
        System.out.println("5 : Usuario digita N, a saida é a soma dos pares até N");
        System.out.println("6 : Desenvolva um algoritmo que mostra todos os divisores de um número que são menores que ele");
        System.out.println("7 : Digite um numero e diga se é primo ou não");
        System.out.println("0 : Sair do programa");
    }
}
