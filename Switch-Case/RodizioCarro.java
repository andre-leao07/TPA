import java.util.Scanner;
public class RodizioCarro {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int pCarro;
		System.out.println("Digite o �ltimo n�mero da placa do seu carro:");
		pCarro= in.nextInt();
		switch (pCarro) {
			case 1: 
			case 2:
				System.out.println("Voc� n�o deve circular com seu ve�culo na segunda");
				break;
			case 3: 
			case 4:
				System.out.println("Voc� n�o deve circular com seu ve�culo na ter�a");
				break;
			case 5: 
			case 6:
				System.out.println("Voc� n�o deve circular com seu ve�culo na quarta");
				break;
			case 7: 
			case 8:
				System.out.println("Voc� n�o deve circular com seu ve�culo na quinta");
				break;
			case 9: 
			case 0:
				System.out.println("Voc� n�o deve circular com seu ve�culo na sexta");
				break;
			default: 
				System.out.println("N�mero de placa inv�lido");
		in.close();
		
		}
	}
	

}
