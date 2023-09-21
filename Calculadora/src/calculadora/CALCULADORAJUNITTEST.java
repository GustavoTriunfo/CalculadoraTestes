package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class CALCULADORAJUNITTEST {
    private Soma soma = new Soma();
    private Subtracao subtracao = new Subtracao();
    private Multiplicacao multiplicacao = new Multiplicacao();
    private Divisao divisao = new Divisao();

    /* Testes classe de adição */

    // Testa a adição de dois números positivos
    @Test
    public void testeClasseSomaNumerosPositivos() {
        int adicaoPositivos = soma.somar(4, 5);

        assertEquals(adicaoPositivos, 9);
    }

    // Testa a adição de dois números negativos
    @Test
    public void testeClasseSomaNumerosNegativos() {
        int adicaoNegativos = soma.somar(-5, -5);

        assertEquals(adicaoNegativos, -10);
    }

    // Testa a adição de um número e zero
    @Test
    public void testeClasseSomaNumeroEZero() {
        int adicaoZero = soma.somar(6, 0);

        assertEquals(adicaoZero, 6);
    }

    /* Testes classe de subtracao */

    // Testa a subtração de dois números positivos
    @Test
    public void testeClasseSubtracaoNumerosPositivos() {
        int subtracaoPositivos = subtracao.subtrair(4, 5);

        assertEquals(subtracaoPositivos, -1);
    }

    // Testa a subtração de dois números negativos
    @Test
    public void testeClasseSubtracaoNumerosNegativos() {
        int subtracaoNegativos = subtracao.subtrair(-5, -5);

        assertEquals(subtracaoNegativos, 0);
    }

    // Testa a subtração de um número e zero
    @Test
    public void testeClasseSubtracaoNumeroEZero() {
        int subtracaoZero = subtracao.subtrair(6, 0);

        assertEquals(subtracaoZero, 6);
    }

    /* Testes classe de multiplicação */

    // Testa a multiplicação de dois números positivos
    @Test
    public void testeClasseMultiplicacaoNumerosPositivos() {
        int multiplicacaoPositivos = multiplicacao.multiplicar(2, 4);

        assertEquals(multiplicacaoPositivos, 8);
    }

    // Testa a multiplicação de um número negativo e um positivo
    @Test
    public void testeClasseMultiplicacaoNumeroNegativo() {
        int multiplicacaoNegativo = multiplicacao.multiplicar(-5, 4);

        assertEquals(multiplicacaoNegativo, -20);
    }

    // Testa a multiplicação de um número por zero
    @Test
    public void testeClasseMultiplicacaoNumeroZero() {
        int multiplicacaoZero = multiplicacao.multiplicar(-5, 0);

        assertEquals(multiplicacaoZero, 0);
    }

    /* Testes classe de divisão */

    // Testa a divisão de dois números positivos
    @Test
    public void testeClasseDividirNumerosPositivos() {
        int dividirPositivo = divisao.dividir(100, 5);

        assertEquals(dividirPositivo, 20);
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
    
}
