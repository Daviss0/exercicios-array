package exercicio_blackList;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		blackList bl = new blackList();
		Scanner scan = new Scanner (System.in);
		
		int opcao = 0;
		
		do {
		System.out.println("====== escolha a opcao =======");
		System.out.println("1. novo nome ");
		System.out.println("2. alterar nome");
		System.out.println("3. exibir lista");
		System.out.println("4. remover nome");
		System.out.println("0. sair");
		opcao = scan.nextInt();
		
		switch (opcao) {
		case 1:
		System.out.println("informe o nome da pessoa para colocar na lista");
		String nome =  scan.next();
		bl.adicionar(nome);
		break;
		
		case 2:
			
			System.out.println("qual a posicao?");
			int posicao = scan.nextInt();
			System.out.println("qual o nome?");
			String novoNome = scan.next();
			bl.alterar(posicao, novoNome);
			break;
		
		case 3:
			bl.listar();
			break;
	    
		case 4:
			System.out.println("qual a posicao?");
			int pos = scan.nextInt();
			bl.remove(pos);
			break;
		}
		} while (opcao != 0);
		
		
		
		scan.close();
	}
}
