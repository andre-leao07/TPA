import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner in=new Scanner (System.in);
		System.out.println("Digite a medida da base de um tri�ngulo:");
		base=in.nextDouble();
		System.out.println("Digite a altura desse tri�ngulo");
		altura=in.nextDouble();
		area=base*altura/2;
		System.out.println("A �rea desse tri�ngulo �: " + area);
		in.close();
		
		
	}

}
