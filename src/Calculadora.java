import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int a = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int b = sc.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
		
		
	}
	public static Integer soma(int a,int b) {
		return a + b;
	}
	public static Integer subtracao(int a,int b) {
		return a - b;
	}
	public static Integer divisao(int a,int b) {
		return a / b;
	}
	public static Integer multiplicacao(int a,int b) {
		return a * b;
	}




}
