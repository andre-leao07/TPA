import java.util.Scanner;
public class Combust�vel {
	public static void main (String[]args) {
		double s, c, g;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite a dist�ncia percorrida pelo seu carro,"
				+ " sabendo que ela ser� contabilizada em km: ");
		s=in.nextDouble();
		System.out.println("Agora digite o total de combust�vel gasto,"
				+ " sabendo que ele ser� contabilizado por litro: ");
		c=in.nextDouble();
		g=s/c;
		System.out.println("O consumo m�dio do seu autom�vel em km/l � igual a: " + g);
		in.close();
		
	}

}
