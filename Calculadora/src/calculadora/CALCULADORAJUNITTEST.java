package calculadora;

/**@author Gustavo Costa
 * @version 1.1
 * @since 05/11/2023**/

/**Esses são os imports dos métodos assertEquals e assertThrows do JUnit**/
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
/**Esse import traz ao projeto o framework JUnit.**/
import org.junit.jupiter.api.Test;

/**Essa é a declaração da classe CALCULADORAJUNITTEST. É nela que é construído a estrutura para efetuar teste unitários automatizados.**/
public class CALCULADORAJUNITTEST {
	/**Esses são os objetos criados para testar as classes com suas funções matemáticas**/
    private Soma soma = new Soma();
    private Subtracao subtracao = new Subtracao();
    private Multiplicacao multiplicacao = new Multiplicacao();
    private Divisao divisao = new Divisao();

    /**Esse é o teste unitário que utiliza JUnit para verificar o método somar com números positivos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    /* Testes classe de adição */
    // Testa a adição de dois números positivos
    @Test
    public void testeClasseSomaNumerosPositivos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int adicaoPositivos = soma.somar(4, 5);
        
   /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
    * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
    * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
    * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(adicaoPositivos, 9);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método somar com números negativos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    @Test
    public void testeClasseSomaNumerosNegativos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int adicaoNegativos = soma.somar(-5, -5);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(adicaoNegativos, -10);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método somar com o número zero. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a adição de um número e zero
    @Test
    public void testeClasseSomaNumeroEZero() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int adicaoZero = soma.somar(6, 0);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(adicaoZero, 6);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método subtrair com números positivos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    /* Testes classe de subtracao */
    // Testa a subtração de dois números positivos
    @Test
    public void testeClasseSubtracaoNumerosPositivos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int subtracaoPositivos = subtracao.subtrair(4, 5);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(subtracaoPositivos, -1);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método subtrair com números negativos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a subtração de dois números negativos
    @Test
    public void testeClasseSubtracaoNumerosNegativos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int subtracaoNegativos = subtracao.subtrair(-5, -5);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(subtracaoNegativos, 0);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método subtrair com o número zero. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a subtração de um número e zero
    @Test
    public void testeClasseSubtracaoNumeroEZero() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int subtracaoZero = subtracao.subtrair(6, 0);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(subtracaoZero, 6);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método multiplicar com números positivos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    /* Testes classe de multiplicação */
    // Testa a multiplicação de dois números positivos
    @Test
    public void testeClasseMultiplicacaoNumerosPositivos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int multiplicacaoPositivos = multiplicacao.multiplicar(2, 4);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(multiplicacaoPositivos, 8);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método multiplicar com números negativos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a multiplicação de um número negativo e um positivo
    @Test
    public void testeClasseMultiplicacaoNumeroNegativo() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int multiplicacaoNegativo = multiplicacao.multiplicar(-5, 4);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(multiplicacaoNegativo, -20);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método multiplicar com um número negativo e zero. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a multiplicação de um número por zero
    @Test
    public void testeClasseMultiplicacaoNumeroZero() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int multiplicacaoZero = multiplicacao.multiplicar(-5, 0);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(multiplicacaoZero, 0);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método dividir com números positivos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    /* Testes classe de divisão */
    // Testa a divisão de dois números positivos
    @Test
    public void testeClasseDividirNumerosPositivos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int dividirPositivo = divisao.dividir(100, 5);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(dividirPositivo, 20);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método dividir com números positivos e negativos. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a divisão de um número positivo por um número negativo
    @Test
    public void testeClasseDividirNumerosNegativos() {
    	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
        int dividirNegativo = divisao.dividir(100, -5);
        
        /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
         * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada.
         * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
         * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertEquals(dividirNegativo, -20);
    }

    /**Esse é o teste unitário que utiliza JUnit para verificar o método dividir com número zero. A estrutura desse método é parecida com a dos métodos primitivos da
     * ClasseDeTeste mas existem distinções. O primeiro detalhe é a marcação @Test que marca esse método como um método de execução estilo JUnit. Isso faz com que esse método seja
     * executado automaticamente nos parâmetros do JUnit, ao atribui-lo a lista de execução do framework.**/
    // Testa a adição de dois números negativos
    // Testa a divisão por zero, esperando uma exceção ArithmeticException
    @Test
    public void testeClasseDividirNumeroZero() {
    	   /**Outro detalhe é que existem métodos de comparação no JUnit e eles são utilizados para fazer a verificação do valor esperado com o valor recebido.
    	    * Nessa lógica no método a seguir é comparado o valor resultante da chamada do método em testagem com o valor que o testador espera receber com essa chamada, que
    	    * nesse caso é uma exception.
    	    * A lógica é parecida com a estrutura primitiva de testes manuais mas a diferença é que além de possuir uma estrutura de testagem mais enxuta, temos também uma 
    	    * multiplicidade de resultados comparados e examinados simultaneamente através da janela do painel JUnit.**/
        assertThrows(ArithmeticException.class, () -> {
        	/**Essa é a variável que recebe o resultado da chamada do método a ser testado.**/
            int dividirZero = divisao.dividir(100, 0);
        });
    }
    
}
