package calculadora;

public class ClasseDeTeste {

    public static void main(String[] args) {
        testarSoma();
        testarSubtracao();
        testarMultiplicacao();
        testarDivisao();
        testarSomaComZero();
        testarSomaComNegativos();
        testarDivisaoPorZero();
    }

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

    public static void testarSubtracao() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(5, 3);
        // Teste para a operação de subtração com números positivos
        if (resultado == 2) {
            System.out.println("Teste de Subtração: PASSOU");
        } else {
            System.out.println("Teste de Subtração: FALHOU");
        }
    }

    public static void testarMultiplicacao() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(2, 4);
        // Teste para a operação de multiplicação com números positivos
        if (resultado == 8) {
            System.out.println("Teste de Multiplicação: PASSOU");
        } else {
            System.out.println("Teste de Multiplicação: FALHOU");
        }
    }

    public static void testarDivisao() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(10, 2);
        // Teste para a operação de divisão com números positivos
        if (resultado == 5) {
            System.out.println("Teste de Divisão: PASSOU");
        } else {
            System.out.println("Teste de Divisão: FALHOU");
        }
    }

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

    public static void testarDivisaoPorZero() {
        Divisao divisao = new Divisao();
        try {
            int resultado = divisao.dividir(10, 0);
            System.out.println("Teste de Divisão por Zero: FALHOU (não lançou exceção)");
        } catch (ArithmeticException e) {
            System.out.println("Teste de Divisão por Zero: PASSOU");
        }
    }
}
