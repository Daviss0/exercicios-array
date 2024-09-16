package gerenciador_tarefas1;

import java.util.Scanner;

public class app {


	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		gerenciadorTarefas gerenciador = new gerenciadorTarefas ();
		tarefas tarefas = new tarefas ();
		
		int opcao = 0;
		do {
		System.out.println("escolha a opcao");
		System.out.println("1. nova tarefa");
		System.out.println("2. listar tarefas");
		System.out.println("3. remover tarefa");
		System.out.println("4. alterar tarefa");
		System.out.println("5. marcar concluido");
		System.out.println("0. sair");
		opcao = scan.nextInt();
		
		switch (opcao) {
		case 1:	
			System.out.println("\nTarefa: ");
			scan.nextLine();
			String desc = scan.nextLine();
			System.out.println("\nCodigo");
			String cod = scan.nextLine();
			
			tarefas novaTarefa = new tarefas ();
			novaTarefa.descricao = desc;
			novaTarefa.codigo = cod;
			novaTarefa.concluido = false;
			
			gerenciador.novaTarefa(novaTarefa);
			break;
			
		case 2:
			gerenciador.listar();
			break;
			
		case 3: 
			System.out.println("qual posicao");
			int posi = scan.nextInt();
			gerenciador.remover(posi);
			break;
			
		case 4:
			System.out.println("qual a posicao");
			int pos = scan.nextInt();
			System.out.println("qual a tarefa");
			String descricao = scan.next();
			System.out.println("qual o codigo");
			String cod2 = scan.next();
			tarefas novaTarefa1 = new tarefas ();
			novaTarefa1.codigo = cod2;
			novaTarefa1.descricao = descricao;
			gerenciador.alterarTarefa(pos, novaTarefa1);
			break;
		case 5:
			System.out.println("posicao: ");
			int pos2 = scan.nextInt();
			gerenciador.marcarConcluida(pos2);
		}
		} while (opcao != 0);
		scan.close();
	}
}
