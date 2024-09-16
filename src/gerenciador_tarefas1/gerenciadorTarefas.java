package gerenciador_tarefas1;

import java.util.ArrayList;

public class gerenciadorTarefas {

	public ArrayList <tarefas> tarefa = new ArrayList <tarefas>();
	tarefas tarefas = new tarefas ();
	
	public void novaTarefa (tarefas novaTarefas) {
		tarefa.add(novaTarefas);
	}
	
	public void remover (int posicao) {
		tarefa.remove(posicao);
	}
	
	public  void alterarTarefa (int posicao, tarefas nome) {
		tarefa.set(posicao, nome);
	}
    public void marcarConcluida (int posicao) {
    	tarefas t = tarefa.get(posicao - 1);
    	t.concluido = true;
    	 
    }
    
    public void listar () {
    	for (tarefas tarefas : tarefa) {
    		System.out.printf("(%s)%s - %s \n",tarefas.concluido ? "X" : " ", tarefas.codigo,tarefas.descricao );
    		
    	}
    }
	
}
