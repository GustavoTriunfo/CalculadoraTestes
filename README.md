# CalculadoraTestes 

## Descrição 📖

Este projeto foi desenvolvido para o aprendizado de testes unitários. Inicialmente o objetivo foi desenvolver classes para uma calculadora e suas operações básicas. Depois disso, para implementar os testes, foi cirada uma classe denominada "ClasseDeTeste" que ficou com a responsabilidade de efetuar testes nos métodos de operações matemáticas. Depois disso, foi criada uma nova classe a "CALCULADORAJUNITTEST" que tem como principal e única responsabilidade aplicar os testes em JUnit dos métodos criados anteriormente. Nesse contexto fica muito evidente a facilidade de trabalhar com teste de uma unidade do código utilizando um framework já pronto. Isso acelera o processo e facilita o desenvolvimento. Por outro lado demanda mais conhecimento do programador para atender as especificações do teste a ser construído.

## Mecânicas dos Testes Unitários: ‍🔧

Os testes unitários desempenham um papel fundamental no desenvolvimento de software, pois ajudam a garantir que o código funcione conforme o esperado e que as mudanças subsequentes não introduzam regressões ou erros. Vamos discutir as mecânicas dos testes mencionados anteriormente e como eles podem ser implementados usando o framework JUnit.

<h3>Testes de Soma, Subtração, Multiplicação e Divisão:</h3>

- Esses testes verificam o comportamento das operações matemáticas básicas com números inteiros positivos.
- Cada teste cria uma instância da classe correspondente (por exemplo, Soma, Subtracao) e chama o método apropriado (por exemplo, somar, subtrair) com valores de entrada específicos.
- Os resultados são comparados com valores esperados para determinar se a operação funciona corretamente.

<h3>Teste de Soma com Zero:</h3>

- Este teste verifica se a operação de soma lida corretamente com um dos operandos sendo zero.
- Ele cria uma instância da classe Soma e chama o método somar com um dos operandos igual a zero.
- O resultado é comparado com o valor esperado.

<h3>Teste de Soma com Números Negativos:</h3>

- Este teste verifica se a operação de soma lida corretamente com números inteiros negativos.
- Ele cria uma instância da classe Soma e chama o método somar com números inteiros negativos como entrada.
- O resultado é comparado com o valor esperado.

<h3>Teste de Divisão por Zero:</h3>

- Este teste verifica se a operação de divisão lida corretamente com a divisão por zero.
- Ele cria uma instância da classe Divisao e chama o método dividir com um denominador igual a zero.
- Espera-se que a operação lance uma exceção ArithmeticException, e o teste verifica se isso ocorre.

## Implementação dos Testes com JUnit:

O JUnit é um framework popular para a realização de testes unitários em Java. Ele oferece uma estrutura mais organizada e automatizada para escrever, executar e relatar testes. Abaixo, mostramos como os testes mencionados anteriormente podem ser implementados usando o JUnit:
```java
@Test
public void testeClasseSomaNumerosPositivos() {
    int adicaoPositivos = soma.somar(4, 5);

    assertEquals(adicaoPositivos, 9);
}
```
🠕 Trecho do código onde há um método de teste JUnit.





## Publicação

Você pode baixar o aquivo zip do projeto no menu de release desse repositório.


## Última atualização: 21/09/2023
