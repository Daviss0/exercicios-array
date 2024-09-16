package exercicio_blackList;

import java.util.ArrayList;

public class blackList {

	public ArrayList <String> nome = new ArrayList <String>();
	
	

	
	public void adicionar (String pessoa) {
		 nome.add (pessoa);
	}
	
	public void listar () {
		int cont = 1;
        for (String item : nome) {
        	System.out.printf("%d, %s\n", cont++, item);
        }
	}
	
	public void remove (int posicao) {
		nome.remove(posicao - 1);
	}
	
	public void alterar (int posicao, String novoNome) {
		nome.set(posicao-1, novoNome);
	}
}
