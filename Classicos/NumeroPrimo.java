import java.util.*;
public class NumeroPrimo {
	public static void main (String[]args) {
		int n=0, i, res=0;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um n�mero e descubra se � PRIMO:");
		n=in.nextInt();
		for (i=1; i<=n; i++) {
			if (n % i == 0) {
				res++;
			}
		}
		
		if (res == 2) {
			System.out.println("N�MERO PRIMO");
		} else {
			System.out.println("N�O � primo");
		}

		in.close();
	}

}
