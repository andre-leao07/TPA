import java.util.Scanner;
public class AntecessorSucessor {
	public static void main (String[]args) {
		int x, antecessor, sucessor;
		
		Scanner in=new Scanner (System.in);
		System.out.println("Digite um n�mero qualquer:");
		x=in.nextInt();
		antecessor=x-1;
		sucessor=x+1;
		System.out.println("O antecessor desse n�mero �: " + antecessor + "  e o  sucessor �: " + sucessor);
		in.close();				
	
	}

}
