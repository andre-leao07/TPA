import java.util.Scanner;
public class Parcelamento {
	public static void main(String[]args) {
		double valor1, valor2, valor3;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite o valor da compra do seu produto:");
		valor1=in.nextDouble();
		System.out.println("Digite o n�mero de presta��es:");
		valor2=in.nextDouble();
		valor3=valor1/valor2;
		System.out.println("O valor de cada presta��o � igual a: " + valor3);
		in.close();
		
	}

}
