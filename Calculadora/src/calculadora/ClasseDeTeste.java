package calculadora;

public class ClasseDeTeste 
{
public static void main(String[] args) 
{
	/*Teste classe de adição*/ 
	Soma soma = new Soma();
	
	int adicao = soma.somar(4,5);
	System.out.println(adicao);
	
    adicao = soma.somar(-6,5);
	System.out.println(adicao);
	
	adicao = soma.somar(0,0);
	System.out.println(adicao);
	
	/*Teste classe de subtracao*/ 
	Subtracao subtracao = new Subtracao();
	
	int subtrair = subtracao.subtrair(4,5);
	System.out.println(subtrair);
	
	subtrair = subtracao.subtrair(-100,5);
	System.out.println(subtrair);
	
	/*Teste classe de multiplicação*/ 
	Multiplicacao multiplicar = new Multiplicacao();
	
	int multiplicacao = multiplicar.multiplicar(4,5);
	System.out.println(multiplicacao);
	
	multiplicacao = multiplicar.multiplicar(0,5);
	System.out.println(multiplicacao);
	
	multiplicacao = multiplicar.multiplicar(-20,5);
	System.out.println(multiplicacao);
	
	/*Teste classe de divisão*/ 
	Divisao divisao = new Divisao();
	
	int dividir = divisao.dividir(4,5);
	System.out.println(dividir);
	//Divisão por inteiros faz faltar casas decimais caso haja no resultado final. 
	//Sugestão: alterar a saída do método para retorno em Double.
	
	dividir = divisao.dividir(0,5);
	System.out.println(dividir);
	//Divisão por zero não é possível e não deve ser permitido pela lógica do programa. 
	//Sugestão: lançar uma exceção se houver essa tentativa de cálculo.
	
	dividir = divisao.dividir(-5,5);
	System.out.println(dividir);
}
}
