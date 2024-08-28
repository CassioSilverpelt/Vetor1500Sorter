package controller;

import cassio.sorters.SorterControllers;

public class Vetor1500Controller {

	public Vetor1500Controller() {
		super();
	}
	
	SorterControllers sortCon = new SorterControllers();
	
	public int[] bubbleSort(int[] vetor) {
		vetor = sortCon.bubbleSort(vetor);
		return vetor;
	}
	
	public int[] mergeSort(int[] vetor) {
		vetor = sortCon.mergeSort(vetor, 0, vetor.length-1);
		return vetor;
	}
	
	public int[] quickSort(int[] vetor) {
		vetor = sortCon.quickSort(vetor, 0, vetor.length-1);
		return vetor;
	}
	
	public int[] resetarVetor(int[] vetor) {
		int contar = 0;		
		for(int i = 1499; i >= 0; i--) {
			vetor[contar] = i;
			contar++;
		}
		return vetor;
	}

}
