import java.util.Scanner;
public class QuatroOpera��es {
	public static void main (String[]args) {
		int x, y, a, s, m, d;
		
		Scanner in=new Scanner(System.in);
		System.out.println ("Digite um n�mero inteiro:");
		x=in.nextInt();
		System.out.println ("Digite outro n�mero inteiro:");
		y=in.nextInt();
		a=x+y;
		s=x-y;
		m=x*y;
		d=x/y;
		System.out.println("Adi��o: " + a);
		System.out.println("Subtra��o: " + s);
		System.out.println("Multiplica��o: " + m);
		System.out.println("Divis�o: " + d);
		in.close();
	}

}
