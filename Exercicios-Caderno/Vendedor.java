import java.util.Scanner;
public class Vendedor {
	public static void main(String[]args) {
		String v;
		double sFixo, vendsMes, c, sTotal;
		
		Scanner in=new Scanner(System.in);
		System.out.println ("Digite o nome do Vendedor:");
		v=in.next();
		System.out.println ("Agora digite o sal�rio fixo do Vendedor:");
		sFixo=in.nextDouble();
		System.out.println ("Por fim digite o total de vendas do m�s desse vendedor:");
		vendsMes=in.nextDouble();
		c=0.15*vendsMes;
		sTotal=sFixo+c;
		System.out.println ("Sabendo que a comiss�o do vendedor " + v + " � de 15%,");
		System.out.println ("o sal�rio fixo �: " + sFixo + "0R$  e o");
		System.out.println ("sal�rio final �: " + sTotal + "0R$");
		in.close();
						
	}

}
