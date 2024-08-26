package controller;

import br.com.jonas.Sorts;

public class SortsController {
	public SortsController() {
		super();
	}
	
	public int[] organiza(int[] vetor, String tipo) {
		Sorts sort = new Sorts();
		
		if(tipo.contains("bubble")) {
			int tamanho = vetor.length;
			sort.bubble(vetor, tamanho);
		}else if(tipo.contains("merge")){
			int tamanho = vetor.length-1;
			sort.merge(vetor, 0, tamanho);
		}else if(tipo.contains("quick")) {
			int tamanho = vetor.length-1;
			sort.quick(vetor, 0, tamanho);
		}
		
		return vetor;
	}
}
