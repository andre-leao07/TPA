import java.util.Scanner;
public class Altura_Joao_Pedro {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int i = 1;
		double aJ, aP;
		aJ = 1.34;
		aP = 1.45;
		System.out.println("Programa altura");
		while (aJ<=aP) {
			aJ = aJ+0.025;
			aP = aP+0.02;
			i++;
		}
		System.out.println("Levar� "+i+ " anos para Jo�o ficar mais alto que pedro.");
		System.out.println("Jo�o ter� altura igual a : " + aJ);
		System.out.println("Pedro ter� altura igual a : " + aP);
		in.close();
	}
}
