// programa que le um numero de 1 a 999 e diz seu valor por extenco.
// javac Main.java && java Main

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
    
    public static void main(String[] args){
        int valor;
        int centena, dezena, unidade;
        String centenaSaida = "", dezenaSaida = "", unidadeSaida = "", ligacao = "", segundaLigacao = "";

        valor = entradaInt("Valor: ");

        centena = valor / 100;
        dezena = (valor % 100) / 10;
        unidade = valor % 10;
        
        switch (centena) {
            case 1:
                if (dezena == 0 && unidade == 0){
                    centenaSaida = "Cem";
                } else {
                    centenaSaida = "Cento";
                }
            break;
            case 2:
                centenaSaida = "Duzentos";
            break;
            case 3:
                centenaSaida = "Trezentos";
            break;
            case 4:
                centenaSaida = "Quatrocentos";
            break;
            case 5:
                centenaSaida = "Quinhentos";
            break;
            case 6:
                centenaSaida = "Seiscentos";
            break;
            case 7:
                centenaSaida = "Setecentos";
            break;
            case 8:
                centenaSaida = "Oitocentos";
            break;
            case 9:
                centenaSaida = "Novecentos";
            break;
            default:
                break;
        }

        if (centena != 0 && (dezena != 0 || unidade != 0)){
            ligacao = " e ";
        }

        switch (dezena) {
            case 2:
                dezenaSaida = "vinte";
            break;
            case 3:
                dezenaSaida = "trinta";
            break;
            case 4:
                dezenaSaida = "quarenta";
            break;
            case 5:
                dezenaSaida = "cinquenta";
            break;
            case 6:
                dezenaSaida = "sesenta";
            break;
            case 7:
                dezenaSaida = "setenta";
            break;
            case 8:
                dezenaSaida = "oitenta";
            break;
            case 9:
                dezenaSaida = "noventa";
            break;
            default:
                break;
        }

        if (dezena >  0 && unidade > 0){
            segundaLigacao = " e ";
        }
        if (dezena == 1 && unidade == 0){
            dezenaSaida = "dez";
        } else if (dezena == 1 && unidade != 0) {
            segundaLigacao = "";
            switch (unidade) {
                case 1:
                    dezenaSaida = "onze";    
                break;
                case 2:
                    dezenaSaida = "doze";    
                break;
                case 3:
                    dezenaSaida = "treze";    
                break;
                case 4:
                    dezenaSaida = "quatorze";    
                break;
                case 5:
                    dezenaSaida = "quize";    
                break;
                case 6:
                    dezenaSaida = "deseseis";    
                break;
                case 7:
                    dezenaSaida = "desesete";    
                break;
                case 8:
                    dezenaSaida = "desoito";    
                break;
                case 9:
                    dezenaSaida = "desenove";    
                break;
                default:
                    break;
            }
        } else {
            switch (unidade) {
                case 1:
                    unidadeSaida = "um";    
                break;
                case 2:
                    unidadeSaida = "dois";    
                break;
                case 3:
                    unidadeSaida = "três";    
                break;
                case 4:
                    unidadeSaida = "quatro";    
                break;
                case 5:
                    unidadeSaida = "cinco";    
                break;
                case 6:
                    unidadeSaida = "seis";    
                break;
                case 7:
                    unidadeSaida = "sete";    
                break;
                case 8:
                    unidadeSaida = "oito";    
                break;
                case 9:
                    unidadeSaida = "nove";    
                break;
                default:
                    break;
            }
        }
        saida(centenaSaida, ligacao, dezenaSaida, segundaLigacao, unidadeSaida);
    }

    public static void saida(String centenaSaida, String ligacao, String dezenaSaida, String segundaLigacao, String unidadeSaida){
        System.out.printf("%s%s%s%s%s\n",centenaSaida, ligacao, dezenaSaida, segundaLigacao, unidadeSaida);
    }
}