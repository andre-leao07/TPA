import java.util.Scanner;
public class OrdemIdades2 {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int i=2, idade, idadeV, idadeN;
		String nome, nomeV, nomeN;
		System.out.println("Bem-vindo ao programa que l� o nome e a idade de 10 pessoas "
				+ "e ao final mostra que � mais velho e quem � mais novo,");
		System.out.println("Digite o 1� nome:");
		nome=in.next();
		System.out.println("Digite a 1� idade");
		
		idade=in.nextInt();
		nomeV=nome;
		nomeN=nome;
		idadeV=idade;
		idadeN=idade;
		while (i<=10) {
			System.out.println("Digite o " + i + "� nome:");
			nome=in.next();
			System.out.println("Digite a " + i + "� idade");
			idade=in.nextInt();
			if (idade>idadeV) {
			nomeV=nome;
			idadeV=idade;
			} else if (idade<idadeN) {
			nomeN=nome;
			idadeN=idade;
		}
			i=i+1;
		}
		System.out.println("Dentre as pessoas, " + nomeV + " � a mais velha com: " + idadeV + " anos  e");
		System.out.println("Dentre as pessoas, " + nomeN + " � a mais nova com: " + idadeN + " anos");
		in.close();
	}
}
