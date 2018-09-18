package matrices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import vistaMatriz.VistaPrincipal;

public class Main {

	public static void main(String[] args) {
	
	final VistaPrincipal v= new VistaPrincipal();
	 v.getFrmCalculadoraDeMatrices().setVisible(true);
	 v.getBtnDeterminante().addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			int[][] matriz = null;
			LinkedList<String> fill= new LinkedList<String>();
			fill.add(v.getM11().getText());
			fill.add(v.getM12().getText());
			fill.add(v.getM13().getText());
			fill.add(v.getM14().getText());

			LinkedList<String> tfs= new LinkedList<String>();
			tfs.add(v.getM11().getText());
			tfs.add(v.getM12().getText());
			tfs.add(v.getM13().getText());
			tfs.add(v.getM14().getText());
			tfs.add(v.getM21().getText());
			tfs.add(v.getM22().getText());
			tfs.add(v.getM23().getText());
			tfs.add(v.getM24().getText());
			tfs.add(v.getM31().getText());
			tfs.add(v.getM32().getText());
			tfs.add(v.getM33().getText());
			tfs.add(v.getM34().getText());
			tfs.add(v.getM41().getText());
			tfs.add(v.getM42().getText());
			tfs.add(v.getM43().getText());
			tfs.add(v.getM44().getText());
			

			for(int i=0; i<fill.size(); i++){
				if(!fill.get(3-i).isEmpty() ){
					matriz= new int[4-i][4-i];
					System.out.println(4-i);
					i=4;;
					}};
				
			for(int i=0; i<matriz.length;i++){		
				for(int j=0;j<matriz.length;j++){
					matriz[i][j]=Integer.parseInt(tfs.get(i*4+j));				
				}
			}
			
			
			System.out.println(matriz.length + "    " + matriz[0].length );
			CalculadorMatricial.mostrarMatriz(matriz);
			String s=""+ CalculadorMatricial.determinanteDe(matriz);
			v.getTxtDeterminante().setText(s);		

			System.out.println("La determinante es:" + CalculadorMatricial.determinanteDe(matriz) );

		}
	 });
	
	
	}
	


}
