package view;

import javax.swing.JOptionPane;

import controller.SortsController;

public class Principal {
	public static void main(String[] args) {
		SortsController sort = new SortsController();
		
		int[] vetor = null;
		String tipo = "";
		int opc = 0, opc2 = 0;
		
		while(true) {
			while(opc < 1 || opc > 3 && opc != 9) {
				opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o vetor a ser organizado: \n 1 - Vetor: [74, 20, 74, 87, 81, 16, 25, 99, 44, 58] \n 2 - Vetor: [44, 43, 42, 41, 40, 39, 38] \n 3 - Vetor: [101, 102, 103, 125, 124, 123, 104, 105, 106, 122] \n 9 - Sair"));
				switch(opc) {
					case 1:
						vetor = new int[]{74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
						break;
					case 2:
						vetor = new int[]{44, 43, 42, 41, 40, 39, 38};
						break;
					case 3:
						vetor = new int[]{101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
						break;
					case 9:
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}
			
			while(opc2 < 1 || opc2 > 3 && opc2 != 9) {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha que tipo de sort será utilizado: \n 1 - Bubble Sort \n 2 - Merge Sort \n 3 - Quick Sort \n 9 - Sair"));
				switch(opc2) {
					case 1:
						tipo = "bubble";
						break;
					case 2:
						tipo = "merge";
						break;
					case 3:
						tipo = "quick";
						break;
					case 9:
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}
			
			if(vetor == null || tipo == "") {
				System.exit(0);
				break;
			}else {
				vetor = sort.organiza(vetor, tipo);
				break;
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
