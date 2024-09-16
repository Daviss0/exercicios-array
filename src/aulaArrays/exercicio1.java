package aulaArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		
		System.out.println("informe as notas");
		double n = scan.nextDouble();
		for (int i =0; i<7; i++) {
			
			n = scan.nextDouble();
		}
		
		ArrayList<Double> notas2 = new ArrayList<Double>();
		
		System.out.println("informe as notas");
		
		for (double nt : notas2) {
			if (nt == -1) {
				System.out.println("");
			}
			else {
				nt += nt;
			}
		}
		
			
	}
}
