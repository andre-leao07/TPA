import java.util.Scanner;
public class SignosZodiaco {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int d, m;
		System.out.println("Digite o dia que voc� nasceu:");
		d=in.nextInt();
		System.out.println("Digite o n�mero equivalente ao m�s que voc� nasceu:");
		m=in.nextInt();
		if (d>=21 && m==3 || d<=20 && m==4) {
			System.out.println("�ries � seu signo");
			
		} else if (d>=21 && m==4 || d<=20 && m==5) {
			System.out.println("Touro � seu signo");
			
		} else if (d>=21 && m==5 || d<=20 && m==6) {
			System.out.println("G�meos � seu signo");
			
		} else if (d>=21 && m==6 || d<=21 && m==7) {
			System.out.println("C�ncer � seu signo");
			
		} else if (d>=22 && m==7 || d<=22 && m==8) {
			System.out.println("Le�o � seu signo");
			
		} else if (d>=23 && m==8 || d<=22 && m==9) {
			System.out.println("Virgem � seu signo");
			
		} else if (d>=23 && m==9 || d<=22 && m==10) {
			System.out.println("Libra � seu signo");
			
		} else if (d>=23 && m==10 || d<=21 && m==11) {
			System.out.println("Escorpi�o � seu signo");
			
		} else if (d>=22 && m==11 || d<=21 && m==12) {
			System.out.println("Sagit�rio � seu signo");
			
		} else if (d>=22 && m==12 || d<=20 && m==1) {
			System.out.println("Capric�rnio � seu signo");
			
		} else if (d>=21 && m==1 || d<=19 && m==2) {
			System.out.println("Aqu�rio � seu signo");
			
		} else {
			System.out.println("Peixes � seu signo");			
		in.close();
		}
		
	}

}
