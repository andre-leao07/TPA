import java.util.Scanner;
public class Tabuada1 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i=1, n, res;
		System.out.println("Digite um n�mero inteiro e obtenha sua tabuada (multiplica��o):");
		n=in.nextInt();
		while (i<=10) {
			res=n*i;
			System.out.println(n + "x" + i + "=" + res);
			i++;			
		}
		in.close();
	}

}



