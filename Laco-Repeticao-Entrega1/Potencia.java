import java.util.Scanner;
public class Potencia {
	public static void main(String[]args) {
		Scanner in=new Scanner (System.in);
		int b, e, i=2, res;
		System.out.println("Digite o n�mero (inteiro) BASE de uma pot�ncia:");
		b=in.nextInt();
		System.out.println("Digite o n�mero (inteiro) EXPOENTE de uma pot�ncia:");
		e=in.nextInt();
		res=b;
		while (i<=e) {
			res=res*b;
			i++;
		}
		System.out.println("O resultado da pot�ncia � igual a: " + res);
		in.close();
	}

}



