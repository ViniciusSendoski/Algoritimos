# Conseitos e Comandos para Algoritmos e Logica de Programação
## Diferenças entre Compiladas e Interpretadas
### Linguagens Compiladas  
AO executar o codigo é gerado um arquivo que roda direto no processador, assim antes de verificando erros antes de gerar o arquivo de execução, sendo o mesmo especifico para o sistema em que foi compilado, necessitando recompilar novamente para outra maquina de arquitetura diferente.

### Linguagens Interpretadas
A execução é feita de forma diferente, rodado o codigo fonte é gerando um arquivo capaz de rodar em qualquer maquina se o interpretador estiver instalado, o arquivo é passado para o interpretador o qual traduz para o sistema e o processador, garantindo flexibilidade e rapidez para testes.

### Onde se encontra o Java
O Java usa uma abordagem hibrida, onde e compilado um Bytecode <*.class> com o JVM realizando o trabalho de execução, dessa forma garante portabilidade ao codigo, entretanto o consumo de memoria e o tempo de resposta são afetados, ele abrange uma estrategia de dividir o codigo em partes e sempre compilando em tempo real as partes mais usadas.

## Comandos no terminal

### Procurar, Criação e Remoção de arquivos
Comando **pwd**, responsavel por apontar onde esta o terminal do sistema Linux. Exemplo:
   >
   > user@user:~$ pwd
   >
   >> /home/user
   >   
Comando **ls**, imprime no terminal os arquivos e pastas que estão no diretorio apontado.
   >
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos
   >   
Comando **cd** o comando cd move o diretorio para aonde for apontado, já o comando **cd ..** move o o ponteiro para a pasta anterior. Exemplos:
   > user@user:~$ cd Documentos/
   >
   > user@user:~/Documentos$
   >
   > user@user:~/Documentos$ cd ..
   >   
   > user@user:~$
   >   
Comando **clear** limpa entradas anteriores do terminal, por isso é uma boa pratica para visualização do que sera executado no terminal.

Comando **touch** permite criar arquivos no direterio atual, util caso queria por exemplo fazer uma lista de exercicios e tenha preguiça de criar cada novo arquivo.
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos
   >
   > user@user:~$ touch Exercicio_1.java 
   >
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos Exercicio_1.java
   >
   > user@user:~$ touch Exercicio_{2..5}.java 
   >
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos Exercicio_1.java Exercicio_2.java Exercicio_3.java Exercicio_4.java Exercicio_5.java
   
Comando **rm** apaga arquivos, util para organizar arquivos.
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos Exercicio_1.java Exercicio_2.java Exercicio_3.java Exercicio_4.java Exercicio_5.java Exercicio_1.class
   >
   > user@user:~$ rm Exercicio_1.class
   >
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos Exercicio_1.java Exercicio_2.java Exercicio_3.java Exercicio_4.java Exercicio_5.java 
   >
   > user@user:~$ rm *.java
   >
   > user@user:~$ ls
   >
   >> 'Área de trabalho'   Downloads   Modelos    Público  Documentos  Imagens Músicas Vídeos

### Compilar arquivos com o Java
O comando abaixo executa a 'interpretador' java, criando um novo arquivo que vai ser compilado *.class

> user@user:~$ javac *.java

### Executando o arquivo Java
Para executar basta usar <JAVA> mais o nome do arquivo *.class

> user@user:~$ java *

## Variáveis e tipos de Dados

### Variáveis

Uma variavel armazena um determinado dado, logo ao pedir uma variavel é separado um espaço de memoria. Por exemplo:

      int numero;

No caso a variavel numero é um identificador, o qual é regido por algumas regras:

1. Sempre deve começa com uma letra (a-z) ou (A-Z);
2. Uma variável pode ser seguida por caracteres, numeros (0-9) ou _; 
3. Não pode conter caracteres especiais ou operadores;
4. Todas as linguagens possuem palavras reservadas que não devem ser usadas (public; int; for; if; ...)

Existem algumas convenções para o uso de variaveis, dependendo com contexto de uso:

* camalCase: Onde a variavel começa em minusculo com separação em Maiusculo juntos.

   * numeroCamisa
   * vascoDaGama
   * maiorPalavra

* snake_case: palavras são separadas por _:

   * nuemro_camisa
   * vasco_da_gama
   * maior_palavra

* PascalCase: onde a primeira string é sempre maiuscula:

   * NumeroCamisa
   * VascoDaGama
   * MaiorPalavra

* UPPER_CASE: onde todos os caracteres são Maiusculos com separação por _:

   * NUMERO_CAMISA
   * VASCO_DA_GAMA
   * MAIOR_PALAVRA

### Tipos de Dados

Se refere a forma que é armazenado o dado presente na variavel, inicialmente os tipos de dados são primitivo, eles são:

      Inteiro: int 4Bytes -> 8; 0; -82
      Real: double 8Bytes -> 1.2; 87.34; - 3,365
      Lógico: boolean 1Byte -> True, False
      Caracter: char 2Bytes -> 'c'

É importante notar que um caracter deve ser declarodo com aspas simples ' '.

Existe tambem um tipo de variavel comun que é muito usada e esta proxima das variaveis primitivas, mas não é uma delas, é usado para conjunto de caracteres, sendo assim deve ser declarada com as aspas duplas:
      
      Conjunto de caracteres: String ?Bytes [depende da codificação de caracteres] -> "Florianopolis" ou 12345 [depende da forma que a variavel for atribuida]

Assim é precisso declara que tipo de entrada é esperada na variavel. 


## Entrada e Saida

Aqui para estamos lidando com entrada e saida simples direto do terminal, essa entrada é escrita em ASCII ou sejá não tem um contexto definido, logo no codigo deve ser especificado como será considerado esse dado, um dado pode ser: Inteiro, Real, String(Palavra) e Boolean(Logica de verdadeiro ou falso).

No java para ler uma entrada no terminal é usado o Scanner, mas na hora de armazenar os dados é preciso apontar o tipo de dados, assim existe o .next com o tipo de dado.

No java a função Scanner não é nativa, sendo proviniente de uma função importada, logo para usar esta estrutura deve possui o importe e a chamada de função que para a entrada de teclado.

Exemplo com Inteiro:

``` Java
// Importa a função Scanner para a entrada no terminal
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      // Declaração para o uso de entrada do teclado.
      // Com o public static define que a função é global e afeta todo algoritimo.
      public static Scanner teclado = new Scanner(System.in);
      int valor;

      System.out.print("Digite um numero: ");

      // O uso do *.nextInt(); para definir que a entrada em valor será um numero inteiro.
      valor = teclado.nextInt();
   }
}
```
Exemplo com Real:

``` Java
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      // Declaração para o uso de entrada do teclado.
      // Com o public static define que a função é global e afeta todo algoritimo.
      public static Scanner teclado = new Scanner(System.in);
      double valor;

      System.out.print("Digite um numero: ");

      // O uso do *.nextDouble(); para definir que a entrada em valor será um numero real.
      valor = teclado.nextDouble();
   }
}
```

