# 📚 Algoritmos e Lógica de Programação com Java
![Java](https://img.shields.io/badge/Java-ED8A00?style=for-the-badge&logo=java&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)

![Status](https://img.shields.io/badge/Status-On_going-orange)
![Versão](https://img.shields.io/badge/Versão-1.04-blue)



Este repositório contém anotações fundamentais e exemplos práticos sobre lógica de programação, funcionamento da linguagem Java e comandos essenciais de terminal Linux.


## 📌 Índice
1. [Funcionamento das Linguagens](#-1-funcionamento-das-linguagens)
2. [Comandos de Terminal](#-2-comandos-essenciais-terminal-linux)
3. [Desenvolvimento Java](#-3-desenvolvimento-em-java)
    * [3.1 Variáveis e Tipos de Dados](#31-variaveis-e-tipos-de-dados)
    * [3.2 Entradas e Saídas](#32-entradas-e-saidas)
    * [3.3 Expressões Relacionais e Lógicas](#33-expressões-relacionais-e-lógicas)
    * [3.4 Estruturas de Escolha](#34-estruturas-de-escolha)
        * [3.4.1 Estrutura se(if) e se não(else if)](#341-estrutura-se(if)-e-se-não(else-if))
        * [3.4.2 Estrutura caso(switch)](#341-estrutura-caso(switch))
    * [3.5 Estruturas de Repetição](#35-estruturas-de-repetição)
        * [3.5.1 Estrutura while](#351-estrutura-while)
        * [3.5.2 Estrutura do while](#352-estrutura-do-while)
        * [3.5.3 Estrutura for](#353-estrutura-for)


## ⚙️ 1. Funcionamento das Linguagens

### Compiladas vs. Interpretadas
* **Compiladas:** Geram código binário direto para o processador. Verificam erros antes da execução.
* **Interpretadas:** Rodam através de um interpretador em tempo real. Maior flexibilidade e portabilidade.
* **O Híbrido (Java):** O Java compila para um **Bytecode (`.class`)**, que é executado pela **JVM (Java Virtual Machine)**. Isso garante que o código rode em qualquer sistema (portabilidade) com performance otimizada via compilador JIT.

---

## 🖥️ 2. Comandos Essenciais (Terminal Linux)

| Comando | Descrição |
| :--- | :--- |
| `pwd` | Exibe o diretório atual. |
| `ls` | Lista arquivos e pastas. |
| `cd` | Navega entre diretórios. |
| `mkdir` | Cria uma nova pasta. |
| `rm -rf` | Remove arquivos ou pastas (cuidado!). |
| `clear` | Limpa a tela do terminal. |
| `touch`| Cria arquivo.|
| `mv` | Move arquivo|

---

## ☕ 3. Desenvolvimento em Java

### Compilação e Execução via Terminal
```bash
# Compilar o arquivo .java para .class e executar o programa
javac Main.java && java Main

# Compilar o arquivo .java para .class e executar com entrada de argumentos
javac Main.java
java Main 16 29 +
```
[Voltar ao topo ⬆️](#-índice)

### 3.1 Variaveis e Tipos de Dados
| Tipo de dado | Uso |
| :-- | :-- |
| int | inteiros |
| double | reais |
| boolean | verdeiro ou falso |
| char | um caracter |
| String | dois ou mais caracteres |

```java
    // Primeiro
    int numero = 2;
    double numeroReal = 3.1;
    boolean condicao = true;
    char letra = 'a'; // Sempre com aspas simples
    String palavra = "Mais que um caracter."; // Sempre com aspas dublas
```
[Voltar ao topo ⬆️](#-índice)

### 3.2 Entradas e Saidas
* **Entradas:** a estrutura .next() define qual sera o tratamento do dado.

| Tipo | Estrutura de Entrada | Tipo | Especificação de Saída |
| :--- | :--- | :--- | :--- |
| **int** | `.nextInt()` | **int** | `%d` |
| **double** | `.nextDouble()` | **double** | `%f` ou `%.2f` |
| **boolean** | `.nextBoolean()` | **boolean** | `%b` |
| **char** | `.next().charAt(0)` | **char** | `%c` |
| **String** | `.nextLine()` | **String** | `%s` |

```java
    public static Scanner teclado = new Scanner(System.in);

    // Da entrada do usuario para inteiros
    public static int entradaInt(){
        System.out.print("Digite dado: ");
        // No next define como seram tratados os dados(ASCII entrado do teclado) para o tipo de dados(inteiro)
        return teclado.nextInt();
    }
```

* **Saidas:** Sequência de escape.

| Sequência |	Significado |
| :-- | :-- |
| `\n` | 	Quebra de linha (nova linha) |
| `\t` |	Tabulação horizontal (Tab) |
| `\\` |	Barra invertida literal |
| `\"` |	Aspas duplas literais (em C e Java) |
[Voltar ao topo ⬆️](#-índice)

### 3.3 Expressões relacionais e lógicas

* **Operadores relacionais:** Usado na comparação de dois valores sempre retornando um resultado do tipo lógico(verdadeiro ou falso).

| Operador |	Símbolo |	Significado |
| :-- | :-- | :-- |
| Igual |	`==`	| Verifica se dois valores são iguais |
| Diferente |	`!=`	| Verifica se dois valores são diferentes |
| Maior |	`>`	| Verifica se o valor da esquerda é maior |
| Menor |	`<`	| Verifica se o valor da esquerda é menor |
| Maior ou igual | `>=`	| Maior ou igual |
| Menor ou igual |	`<=`	| Menor ou igual |

* **Operadores lógicos**

| Operador |	Símbolo	| Significado |
| :-- | :-- | :-- |
| E	| `&&` |	Ambas as condições devem ser verdadeiras |
| Ou |	`\|\|` |	Ao menos uma condição deve ser verdadeira |
| Não	| `!`	| Inverte o resultado da condição |
[Voltar ao topo ⬆️](#-índice)


### 3.4 Estruturas de Escolha

* Avalia valores de uma expreção e direciona a execução para o caso correspondente, existem duas estruturas se(if) e caso(switch) realizam em partes a mesma função com limitações diferentes.

[Voltar ao topo ⬆️](#-índice)

#### 3.4.1 Estrutura se(if) e se não(else if)
> 📄 [Ver exemplo completo em Java](Algoritimos/Aulas/Aulas_04/Aula_25-04/Main.java)

* Pode ser usado para todos os caso, se destaca pois permite realizar comparações complexas.

* **Exemplo 1:** Verificar se um individuo é maior de idade.

``` java
    public static boolean verificaIdade(int idade){
        if (idade >= 18){
            return true;
        } else {
            return false;
        }
    }
```
* **Exemplo 2:** Verifica se um aluno foi aprovado.

``` java
    public static String estadoAluno(double nota, int presenca, int total_presenca) {
    String mensagem;
    double frequencia = (presenca * 100.0) / total_presenca;

    if (frequencia >= 75.0 && nota >= 70.0) {
        mensagem = "Aluno aprovado";
    } else if (frequencia >= 75.0 && nota < 70.0) {
        mensagem = "Aluno reprovado por nota";
    } else { // A frequência é menor que 75%
        mensagem = "Aluno reprovado por falta";
    }
    return mensagem;
}
```
[Voltar ao topo ⬆️](#-índice)

#### 3.4.2 Estrutura caso(switch)

> 📄 [Ver exemplo completo em Java](Algoritimos/Aulas/Aulas_04/Aula_23-04/Main.java)

* Ideal quando se sabe qual dado será comparado.

``` java
    int seleciona_caso;

    System.out.println("1: Verifica Idade.");
    System.out.println("2: Verifica se aluno foi aprovado ou reprovado.");
    System.out.println("3: Verifica se um numero é perfeito (Soma dos divisores igual ao número)."); 

    seleciona_caso = entradaInt("Digite o numero da função que deseja executar: ");
    
    // As variáveis abaixo devem ser capturadas via Scanner antes do switch
    switch (seleciona_caso) {
    case 1:
        // Exemplo: assumindo que 'idade' foi lida antes
        boolean ehMaior = verificaIdade(idade);
        System.out.println("Maior de idade: " + ehMaior);
        break;
    case 2:
        // Exemplo: assumindo que nota e presenças foram lidas
        String status = estadoAluno(nota, presenca, total_presenca); 
        System.out.println(status);
        break;
    case 3:
        // Exemplo: assumindo que 'numero' foi lido
        divisoresPerfeitos(numero);
        break;
    default:
        System.out.println("Não existe função correspondente");
        break;
    }
```
[Voltar ao topo ⬆️](#-índice)

### 3.5 Estruturas de repetição

* Permite realizar uma mesma comparação ou ação repetidamente, dependendo da escolha do desenvolvedor da estrutura usada.
* Existem 3 estruturas **while**, **do while**, **for**. Essas estruturas podem realizar as mesmas tarefas, exeto quando não se sabe a quantidades de repetições nestes casos a estrutura **for** não pode ser usada.

[Voltar ao topo ⬆️](#-índice)

#### 3.5.1 Estrutura while

> 📄 [Ver exemplo completo em Java](Algoritimos/Aulas/Aulas_04/Aula_29-04/Main.java)

* Verifica a condição e repete até que ela seja atendida, não garante que a estrutura seja executada caso a condição no primeiro ciclo não seja verdadeira, para o caso em que exista um contador ele deve estar dentro da estrutura, caso isso não aconteça a estrutura entra em repetição infinita.

* **Exemplo:** Contagem regressiva denominando numeros como par ou impar. 

``` java
    public static void saidaWhileEntradaRegressivoCondicaoParImpar(int numero) {
        System.out.println("Do numero do usuario até 0");
        while (numero >= 0) {
            if (numero % 2 == 0 && numero != 0) {
                System.out.println("numero "+ numero + " e par");
            } else if (numero == 0){
                System.out.println("numero "+ numero);
            } else {
                System.out.println("numero "+ numero + " e impar");
            }
            numero = numero - 1;
        }
    }
```
[Voltar ao topo ⬆️](#-índice)

#### 3.5.2 Estrutura do while
> 📄 [Ver exemplo completo em Java](Algoritimos/Aulas/Aulas_05/Aula_07-05/Main.java)

* Essa estrutura garante que será executado ao menos uma vez, ideal para verificar quando são se sabe a quantidade de repetições.

* **Exemplo 1:** Com a quantidade de votos determina o resultado da eleição.

``` java
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
            System.out.printf("\nA eleição teve %d votos totais, dos quais:\nVotos para o Candidado_1: %d\nVotos para o Candidato_2: %d\nVotos nulos: %d\nO vencedor da eleição foi Candidato_1\n", quandidade_votos, candidato_1, candidato_2, voto_nulo);
        } else {
            System.out.printf("\nA eleição teve %d votos totais, dos quais:\nVotos para o Candidado_1: %d\nVotos para o Candidato_2: %d\nVotos nulos: %d\nO vencedor da eleição foi Candidato_2\n", quandidade_votos, candidato_1, candidato_2, voto_nulo);
        }
    }
```

* **Exemplo 2**: Dependendo do usuario executar funções até o usario selecionar saida(0);

``` java
int seleciona_caso;

do {
    System.out.println("1: Verifica Idade.");
    System.out.println("2: Verifica se aluno foi aprovado ou reprovado.");
    System.out.println("3: Verifica se um numero é perfeito.");
    System.out.println("0: Sair do programa.");  
    
    seleciona_caso = entradaInt("Digite a opção: ");

    switch (seleciona_caso) {
        case 0:
            System.out.println("Saindo...");
            break;            
        case 1:
            System.out.println("Maior de idade: " + verificaIdade(idade));
            break;
        case 2:
            System.out.println(estadoAluno(nota, presenca, total_presenca));
            break;
        case 3:
            divisoresPerfeitos(numero);
            break;
        default:
            System.out.println("Opção inválida!");
            break;
    }
    System.out.println("-----");

} while (seleciona_caso != 0); 
```
[Voltar ao topo ⬆️](#-índice)

#### 3.5.3 Estrutura for

> 📄 [Ver exemplo completo em Java](Algoritimos/Aulas/Aulas_05/Aula_06-05/Main.java)

* Ideal quando se sabe a quantidade de repetições, define todas as condições na condicional do laço.

* Exemplo: Saida uma lista de numeros ao quadrado;

``` java
    public static void numerosQuadradosFor(int valor_inteiro){
        for (int i = 1; i <= valor_inteiro; i++){
            System.out.println(i * i);
        }
    }
```
[Voltar ao topo ⬆️](#-índice)