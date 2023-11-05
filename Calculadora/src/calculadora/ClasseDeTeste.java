package calculadora;

/**@author Gustavo Costa
 * @version 1.1
 * @since 29/10/2023**/

/** A classe Classe de Teste foi criada para a criação dos testes de uma 
 * forma mais primitiva. Ou seja, não são testes que utilizam algum framework open-source como o JUnit.**/
public class ClasseDeTeste 
{

	/** Aqui temos o método de execução "main" onde os métodos de teste são chamados. 
	 * Todos eles foram criados dentro da própria classe "ClasseDeTeste" e são chamados dentro desse método interno.
	 * Repare como os nomes dos métodos referentes as operações matemáticas são denominados de uma forma clara, auto explicativos.**/
    public static void main(String[] args) 
    {
        testarSoma();
        testarSubtracao();
        testarMultiplicacao();
        testarDivisao();
        testarSomaComZero();
        testarSomaComNegativos();
        testarDivisaoPorZero();
    }

    /**Esse é o teste da operação de adição, ou soma como também é conhecida.**/
    public static void testarSoma() 
    {
    	/**Aqui temos a criação da instância da classe Soma através de seu construtor.**/
        Soma soma = new Soma();

        /**Na sequência temos uma variável que recebe o restultado da chamada do método somar que foi criado na classe Soma. Também podemos reparar 
         * nos argumentos, originalmente denominados parâmetros na estrutura base do método onde se define a entrada, de  que, assim como em todos os métodos 
         * de operações matemáticas, são os números a serem utilizadas no cálculo. Então nesse aspecto
         * vou me atentar a outras explicações lógicas porquê é implicito que os parâmetros devem ser numéricos. Claro, havendo um comportamento diferente do método 
         * devido uma entrada específica de argumento no parâmetro, vou destacar.**/
        int resultado = soma.somar(2, 3);
        
        /**Vale observar como ocorre a validação do resultado esperado com o obtido na chamada do método.
         * Essa comparação é feita através de um bloco de decisão if, onde o resultado obtido e o esperado são comparados.
         * Se o resultado da comparação for um booleano de tipo true o teste é classificado como Passou.
         * Do contrário o teste falhou.**/
        
        // Teste para a operação de soma com números positivos
        if (resultado == 5) 
        {
        	/**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Soma: PASSOU");
        } else 
        {
            System.out.println("Teste de Soma: FALHOU");
        }
    }

    /**Esse é o teste da operação de subtração.**/
    public static void testarSubtracao() 
    {
    	/**Aqui temos a criação da instância da classe Subtracao através de seu construtor.**/
        Subtracao subtracao = new Subtracao();
        
        /**Na sequência temos uma variável que recebe o restultado da chamada do método subtrair que foi criado na classe Subtracao.**/
        int resultado = subtracao.subtrair(5, 3);
        
        /**A lógica utilizada na validação dos métodos de teste dessa classe "ClasseDeTeste" tem a mesma estrutura.
         * São comparados dois resultados. O obtido através da chamada do método a ser testado e o resultado esperado.
         * Se o resultado da comparação for true, sucesso! Se for false, falhou.**/
        
        // Teste para a operação de subtração com números positivos
        if (resultado == 2) 
        {
        	/**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Subtração: PASSOU");
        } else 
        {
            System.out.println("Teste de Subtração: FALHOU");
        }
    }

    /**Esse é o teste da operação de multiplicação.**/
    public static void testarMultiplicacao() 
    {
    	/**Aqui temos a criação da instância da classe Multiplicacao através de seu construtor.**/
        Multiplicacao multiplicacao = new Multiplicacao();
        
        /**Na sequência temos uma variável que recebe o restultado da chamada do método multiplicar que foi criado na classe Multiplicacao.**/
        int resultado = multiplicacao.multiplicar(2, 4);
        
        /**A lógica utilizada na validação dos métodos de teste dessa classe "ClasseDeTeste" tem a mesma estrutura.
         * São comparados dois resultados. O obtido através da chamada do método a ser testado e o resultado esperado.
         * Se o resultado da comparação for true, sucesso! Se for false, falhou.**/
        
        // Teste para a operação de multiplicação com números positivos
        if (resultado == 8) 
        {
        	/**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Multiplicação: PASSOU");
        } else 
        {
            System.out.println("Teste de Multiplicação: FALHOU");
        }
    }

    /**Esse é o teste da operação de divisão.**/
    public static void testarDivisao() 
    {
    	/**Aqui temos a criação da instância da classe Divisao através de seu construtor.**/
        Divisao divisao = new Divisao();
        
        /**Na sequência temos uma variável que recebe o restultado da chamada do método dividir que foi criado na classe Divisao.**/
        int resultado = divisao.dividir(10, 2);
        
        /**A lógica utilizada na validação dos métodos de teste dessa classe "ClasseDeTeste" tem a mesma estrutura.
         * São comparados dois resultados. O obtido através da chamada do método a ser testado e o resultado esperado.
         * Se o resultado da comparação for true, sucesso! Se for false, falhou.**/
        
        // Teste para a operação de divisão com números positivos
        if (resultado == 5) 
        {
        	/**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Divisão: PASSOU");
        } else 
        {
            System.out.println("Teste de Divisão: FALHOU");
        }
    }

    /**Esse é o teste da operação de soma com zero.**/
    public static void testarSomaComZero() 
    {
    	/**Aqui temos a criação da instância da classe Soma através de seu construtor.**/
        Soma soma = new Soma();
        
        /**Na sequência temos uma variável que recebe o restultado da chamada do método somar que foi criado na classe Soma.**/
        int resultado = soma.somar(0, 5);
        
        /**A lógica utilizada na validação dos métodos de teste dessa classe "ClasseDeTeste" tem a mesma estrutura.
         * São comparados dois resultados. O obtido através da chamada do método a ser testado e o resultado esperado.
         * Se o resultado da comparação for true, sucesso! Se for false, falhou.**/
        
        // Teste para a operação de soma com zero
        if (resultado == 5) 
        {
        	/**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Soma com Zero: PASSOU");
        } else 
        {
            System.out.println("Teste de Soma com Zero: FALHOU");
        }
    }

    /**Esse é o teste da operação de soma com números negativos.**/
    public static void testarSomaComNegativos() 
    {
    	/**Aqui temos a criação da instância da classe Soma através de seu construtor.**/
        Soma soma = new Soma();
        
        /**Na sequência temos uma variável que recebe o restultado da chamada do método somar que foi criado na classe Soma.**/
        int resultado = soma.somar(-2, -3);
        
        /**A lógica utilizada na validação dos métodos de teste dessa classe "ClasseDeTeste" tem a mesma estrutura.
         * São comparados dois resultados. O obtido através da chamada do método a ser testado e o resultado esperado.
         * Se o resultado da comparação for true, sucesso! Se for false, falhou.**/
        
        // Teste para a operação de soma com números negativos
        if (resultado == -5) 
        {
        	/**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Soma com Negativos: PASSOU");
        } else 
        {
            System.out.println("Teste de Soma com Negativos: FALHOU");
        }
    }

    /**Esse é o teste da operação de divisão. Um detalhe importante é que esse teste aborda a resposta do teste à divisão por zero.**/
    public static void testarDivisaoPorZero() 
    {
    	/**Aqui temos a criação da instância da classe Soma através de seu construtor.**/
        Divisao divisao = new Divisao();
        
        /**A criação dessa variável denominada resultado**/
        try 
        {
            int resultado = divisao.dividir(10, 0);
            /**As impressões no console vão mostrar ao usuário se o teste passou ou não.**/
            System.out.println("Teste de Divisão por Zero: FALHOU (não lançou exceção)");
        } catch (ArithmeticException e) 
        {
            System.out.println("Teste de Divisão por Zero: PASSOU");
        }
    }
}
