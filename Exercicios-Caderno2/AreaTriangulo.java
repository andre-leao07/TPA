import java.util.Scanner;
public class AreaTriangulo {
	public static void main ( String[] args) {
		Scanner in = new Scanner (System.in);
		double base , altura, area;
		
		System.out.println("Digite a medida da base do tri�ngulo");
		base = in.nextDouble();
		System.out.println("Digite a medida da altura do tri�ngulo");
		altura = in.nextDouble();
		area = base*altura/2;
		System.out.println("A �rea do tri�ngulo � igual a: " + area);
		in.close();
				
		
	}

}

