import java.util.Scanner;
public class Ipva {
	public static void main (String[]args) {
		double PrecoCarro, ipva;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite o pre�o do seu carro:");
		PrecoCarro=in.nextDouble();
		ipva=PrecoCarro/100*4;
		System.out.println("O valor do seu Ipva equilvalente a 4% � igual a: " + ipva);
		in.close();
		
	}

}
