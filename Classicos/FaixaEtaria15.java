import java.util.*;
public class FaixaEtaria15 {
	public static void main (String[]args) {
		int i;
		double pa, pb, pc, pd, pe,  id, a =0, b=0, c=0, d=0, e=0;
		Scanner in = new Scanner (System.in);
		for (i=1; i<= 15; i++) {
			System.out.println("Digite a: " + i + "� idade...");
			id=in.nextInt();
			if (id<=15) {
				a++;
			} else if (id<=30) {
				b++;
			}else if (id<=45) {
				c++;
			}else if (id<=60) {
				d++;
			}else {
				e++;
			}
		}
		pa=(a/15)*100;
		pb=(b/15)*100;
		pc=(c/15)*100;
		pd=(d/15)*100;
		pe=(e/15)*100;

		System.out.println("H� " + a + " pessoas na 1� faixa et�ria, equivalente a: " + pa + " %");
		System.out.println("H� " + b + " pessoas na 2� faixa et�ria, equivalente a: " + pb + " %");
		System.out.println("H� " + c + " pessoas na 3� faixa et�ria, equivalente a: " + pc + " %");
		System.out.println("H� " + d + " pessoas na 4� faixa et�ria, equivalente a: " + pd + " %");
		System.out.println("H� " + e + " pessoas na 5� faixa et�ria, equivalente a: " + pe + " %");
	}
	
}
