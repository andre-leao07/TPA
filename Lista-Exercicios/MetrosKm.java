import java.util.Scanner;
public class MetrosKm {
	public static void main (String[]args) {
		double m, km;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Para realizar a conve��o de m para km, digite um n�mero:");
		m=in.nextDouble();
		km=m/1000;
		System.out.println(m + " metros equivalem a " + km + " Quil�metros");
		in.close();	
				
	}

}
