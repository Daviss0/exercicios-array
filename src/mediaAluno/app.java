package mediaAluno;

import java.util.Scanner;

public class app {
   static Scanner scan = new Scanner (System.in);
   public static void main(String[] args) {
		mediaAluno mA = new mediaAluno ();
		int opcao = 0;
		
		
		do {
		
		System.out.println("escolha a opcao");
		System.out.println("1. Nova nota");
		System.out.println("2. Analisar");
		System.out.println("0. Sair");
		opcao = scan.nextInt();
		
		switch (opcao) {
		case 1:
			double n = scan.nextDouble();
			mA.novaNota(n);
			break;
		case 2: 
			double m = mA.media();
			String s = mA.situacao();
			
			escrever ("media "+m);
			escrever ("Situacao: "+s);
			break;
		}
			
	} while (opcao != 0);
		
		
		}
		
	
	public static double lerDouble (String msg) {
			System.out.println(msg);
			return scan.nextDouble ();
	}
	
	public static void escrever (String msg) {
		System.out.println(msg);
	}
}

