package view;

import controller.Vetor1500Controller;

public class Vetor1500Principal {

	public static void main(String[] args) {
		Vetor1500Controller vetCont = new Vetor1500Controller();
		
		int[] vetor = new int[1500];
		
		vetCont.resetarVetor(vetor);
		
		double tempoini;
		double tempofim;
		double tempofinal;
		
		tempoini = System.nanoTime();
		vetCont.bubbleSort(vetor);
		tempofim = System.nanoTime();
		tempofinal = (tempofim-tempoini)/Math.pow(10, 9);
		System.out.println("BubbleSort: " + tempofinal + "s");
		
		vetCont.resetarVetor(vetor);
		
		tempoini = System.nanoTime();
		vetCont.mergeSort(vetor);
		tempofim = System.nanoTime();
		tempofinal = (tempofim-tempoini)/Math.pow(10, 9);
		System.out.println("MergeSort: " + tempofinal + "s");
		
		vetCont.resetarVetor(vetor);
		
		tempoini = System.nanoTime();
		vetCont.quickSort(vetor);
		tempofim = System.nanoTime();
		tempofinal = (tempofim-tempoini)/Math.pow(10, 9);
		System.out.println("QuickSort: " + tempofinal + "s");
	}

}
