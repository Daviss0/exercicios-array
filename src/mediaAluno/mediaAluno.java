package mediaAluno;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class mediaAluno {

	private ArrayList<Double>  mediaAluno = new ArrayList <Double>();
		Scanner scan = new Scanner (System.in);
	
	public void novaNota (double nota) {
		mediaAluno.add(nota);
	}
	
	public double media () {
		double soma = 0;
		for (double nota: mediaAluno) {
		soma += nota;
		
		}
		double m = soma / mediaAluno.size();
		return m;
	}
	
	public String situacao () {
		String s = "";
		
		double m = media();
		if (m >= 6) {
			s = "aprovado";
		}
		else {
			s = "reprovado";
		}
		return s;
	}
	
	
	}
