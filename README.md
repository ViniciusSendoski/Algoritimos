# 📚 Algoritmos e Lógica de Programação com Java

![Status](https://img.shields.io/badge/Status-Ongoing-orange)
![Versão](https://img.shields.io/badge/Versão-1.1-blue)


Este repositório contém anotações fundamentais e exemplos práticos sobre lógica de programação, funcionamento da linguagem Java e comandos essenciais de terminal Linux.

---

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

### Variaveis e Tipos de Dados
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

### Entradas e Saidas
* **Entradas:** a estrutura .next() define qual sera o tratamento do dado.
* **Saidas:**

| Tipo de dado | Estrutura |
| :-- | :-- |
| int | .nextInt() |
| double | .nextDouble() |
| boolean | .nextBoolean() |
| char | .next().charAt(0) |
| String | .nextLine() |

```java
    public static Scanner teclado = new Scanner(System.in);

    // Da entrada do usuario para inteiros
    public static int entrada(){
        System.out.print("Digite dado: ");
        // No next define como seram tratados os dados(ASCII entrado do teclado) para o tipo de dados(inteiro)
        return teclado.nextInt();
    }
```

