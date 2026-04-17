// Explicação de Saidas
// $ javac Main.java && java Main

public class Main {

    public static int entradaInt(){
        return 123;
    }

    public static double entradaDouble(){
        return 105.123456789;
    }

    public static char entradaChar(){
        return 'A';
    }

    public static String entradaString(){
        return "Uma frase com certeza parece uma frase";
    }

    public static void main(String[] args) {
        // Variaveis recebendo direto entrada
        int numero = entradaInt();
        double numeroVirgula = entradaDouble();
        char letra = entradaChar();
        String palavra = entradaString();

        //Saidas

        saidaQuebraLinha();
        saida();
        saidaQuebraLinha();
        saidaExemploEscape();
        saidaQuebraLinha();
        saidaInt(numero);
        saidaQuebraLinha();
        saidaDouble(numeroVirgula);
        saidaQuebraLinha();
        saidaChar(letra);
        saidaQuebraLinha();
        saidaString(palavra);
        saidaQuebraLinha();
        saidaBoolean();
        saidaQuebraLinha();
    }

    public static void saida(){
        System.out.print("(print) Saida mais simples sem quebra de linha apos o final, ideal para entrada onde o Enter do teclado e captado criando a quebra de linha.\nSuporta seguencia de escape, mas não suporta tabela de especificadores de formato(C e Java)\n");
        System.out.println("\n(println) Saida com a quebra de linha já integrada.\nSuporta seguencia de escape, mas não suporta tabela de especificadores de formato(C e Java)");
        System.out.printf("\n(printf) Saida sem quebra de linha apos o final,\nSuporta seguencia de escape, suporta tabela de especificadores de formato(C e Java)\n");
    }

    public static void saidaQuebraLinha(){
        System.out.println("====================");
    }

    public static void saidaExemploEscape(){
        // Exemplo tabela de especificadores de formato(C e Java)
        System.out.println("");
    }

    public static void saidaInt(int numero) {
        System.out.printf("%d\n", numero);
    }

    public static void saidaDouble(double numeroVirgula) {
        // numeroVirgula = 105.123456789
        System.out.printf("Valor completo: %f \n", numeroVirgula);
        System.out.printf("Valor com 2 casas decimais: %.2f\n", numeroVirgula);
        System.out.printf("Valor com 5 casas decimais: %.5f\n", numeroVirgula);
        System.out.printf("Valor com 7 casas decimais: %.7f\n", numeroVirgula);
        System.out.printf("Valor com 9 casas decimais: %.9f\n", numeroVirgula);
        System.out.printf("\nSe não definir as casa decimais é exibido até 6 casas.\nPara exibir todos as casas decimais se deve definir exatamente quantas mostrar.\nPara float/double ultima casa decimal é arredondada.\n");
    }

    public static void saidaChar(char letra) {
        System.out.printf("%c\n", letra);
    }

    public static void saidaString(String palavra) {
        System.out.printf("%s\n", palavra);
    }

    public static void saidaBoolean(){
        System.out.printf("%b\n", true);
        System.out.printf("%b\n", false);
    }
}