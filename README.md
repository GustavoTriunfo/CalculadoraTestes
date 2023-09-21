# CalculadoraTestes 

## Descrição 📖

Este projeto foi desenvolvido para o aprendizado de testes unitários. Inicialmente o objetivo foi desenvolver classes para uma calculadora e suas operações básicas. Depois disso, para implementar os testes, foi cirada uma classe denominada "ClasseDeTeste" que ficou com a responsabilidade de efetuar testes nos métodos de operações matemáticas. Depois disso, foi criada uma nova classe a "CALCULADORAJUNITTEST" que tem como principal e única responsabilidade aplicar os testes em JUnit dos métodos criados anteriormente. Nesse contexto fica muito evidente a facilidade de trabalhar com teste de uma unidade do código utilizando um framework já pronto. Isso acelera o processo e facilita o desenvolvimento. Por outro lado demanda mais conhecimento do programador para atender as especificações do teste a ser construído.

## Mecânicas dos Testes Unitários: ‍🔧

Os testes unitários desempenham um papel fundamental no desenvolvimento de software, pois ajudam a garantir que o código funcione conforme o esperado e que as mudanças subsequentes não introduzam regressões ou erros. Vamos discutir as mecânicas dos testes mencionados anteriormente e como eles podem ser implementados usando o framework JUnit.

<h3>Teste de Soma com Números Positivos:</h3>

- Este teste verifica se a operação de soma lida corretamente com um dos operandos sendo zero.
- Ele cria uma instância da classe Soma e chama o método somar com dois operandos positivos.
- O resultado é comparado com o valor esperado.
 
```java
  public static void testarSoma() {
        Soma soma = new Soma();
        int resultado = soma.somar(2, 3);
        // Teste para a operação de soma com números positivos
        if (resultado == 5) {
            System.out.println("Teste de Soma: PASSOU");
        } else {
            System.out.println("Teste de Soma: FALHOU");
        }
    }
```

<h3>Teste de Soma com Zero:</h3>

- Este teste verifica se a operação de soma lida corretamente com um dos operandos sendo zero.
- Ele cria uma instância da classe Soma e chama o método somar com um dos operandos igual a zero.
- O resultado é comparado com o valor esperado.

```java
  public static void testarSomaComZero() {
        Soma soma = new Soma();
        int resultado = soma.somar(0, 5);
        // Teste para a operação de soma com zero
        if (resultado == 5) {
            System.out.println("Teste de Soma com Zero: PASSOU");
        } else {
            System.out.println("Teste de Soma com Zero: FALHOU");
        }
    }
```


<h3>Teste de Soma com Números Negativos:</h3>

- Este teste verifica se a operação de soma lida corretamente com números inteiros negativos.
- Ele cria uma instância da classe Soma e chama o método somar com números inteiros negativos como entrada.
- O resultado é comparado com o valor esperado.

```java
  public static void testarSomaComNegativos() {
        Soma soma = new Soma();
        int resultado = soma.somar(-2, -3);
        // Teste para a operação de soma com números negativos
        if (resultado == -5) {
            System.out.println("Teste de Soma com Negativos: PASSOU");
        } else {
            System.out.println("Teste de Soma com Negativos: FALHOU");
        }
    }
```


<h3>Teste de Divisão por Zero:</h3>

- Este teste verifica se a operação de divisão lida corretamente com a divisão por zero.
- Ele cria uma instância da classe Divisao e chama o método dividir com um denominador igual a zero.
- Espera-se que a operação lance uma exceção ArithmeticException, e o teste verifica se isso ocorre.

```java
  public static void testarDivisaoPorZero() {
        Divisao divisao = new Divisao();
        try {
            int resultado = divisao.dividir(10, 0);
            System.out.println("Teste de Divisão por Zero: FALHOU (não lançou exceção)");
        } catch (ArithmeticException e) {
            System.out.println("Teste de Divisão por Zero: PASSOU");
        }
    }
```
## Implementação dos Testes com JUnit: 🛠️

O JUnit é um framework popular para a realização de testes unitários em Java. Ele oferece uma estrutura mais organizada e automatizada para escrever, executar e relatar testes. Abaixo, mostramos como alguns dos testes mencionados anteriormente podem ser implementados usando o JUnit:
```java
 // Testa a adição de dois números positivos
    @Test
    public void testeClasseSomaNumerosPositivos() {
        int adicaoPositivos = soma.somar(4, 5);
    
        assertEquals(adicaoPositivos, 9);
    }

  // Testa a adição de um número e zero
    @Test
    public void testeClasseSomaNumeroEZero() {
        int adicaoZero = soma.somar(6, 0);

        assertEquals(adicaoZero, 6);
    }

  // Testa a divisão de um número positivo por um número negativo
    @Test
    public void testeClasseDividirNumerosNegativos() {
        int dividirNegativo = divisao.dividir(100, -5);

        assertEquals(dividirNegativo, -20);
    }

 // Testa a divisão por zero, esperando uma exceção ArithmeticException
    @Test
    public void testeClasseDividirNumeroZero() {
        assertThrows(ArithmeticException.class, () -> {
            int dividirZero = divisao.dividir(100, 0);
        });
    }
```




## Contribuição ⬆️

Sinta-se à vontade para contribuir com melhorias, correções de bugs ou adicionar novas funcionalidades a este projeto. Basta criar um fork do repositório, fazer suas modificações e enviar um pull request.

## Publicação 📦

Você pode baixar o aquivo zip do projeto no menu de release desse repositório.


## Última atualização: 21/09/2023
