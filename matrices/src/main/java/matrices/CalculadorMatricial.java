package matrices;

public abstract class CalculadorMatricial {
	
	public static int determinanteDe(int[][] matriz){
		int determinante=0;
		if (matriz.length<3){
			return ((matriz[0][0]*matriz[1][1])- (matriz[0][1]*matriz[1][0]));
			} 
		else{
			
			for (int i=0; i<matriz.length;i++){
			int coef= matriz[0][i];
			int detMatrizNueva=determinanteDe(quitarFilaCol(matriz,0,i));
			determinante +=(int) ((Math.pow(-1,(1+i+1)))*coef*(detMatrizNueva));
			System.out.println ((Math.pow(-1,(1+i+1)))*coef + "*" + detMatrizNueva + "=" + determinante);
	}			
		return determinante;
	}
	}

	
	public static int[][] quitarFilaCol(int[][]matriz,int fila, int col){
		int[][] nuevaMatriz=new int[matriz.length-1][];
		
		for (int i=0; i<nuevaMatriz.length;i++){
				nuevaMatriz[i]= new int[matriz[i].length-1];
		}
		
		int a=0;
		int b;
		for(int i=0; i<matriz.length; i++){
			if (i!=fila){
			b=0;
			for (int j=0; j< matriz[i].length; j++){
				if (j!=col){
					int valor= matriz[i][j];
					nuevaMatriz[a][b]=valor;

					b++;
					
				}
			}
			a++;}
		}
		mostrarMatriz(nuevaMatriz);
		return nuevaMatriz;
	}
	
	public static void mostrarMatriz(int[][] nueva){
		for (int i=0; i<nueva.length; i++){
			for(int j=0; j<nueva[i].length; j++){
				if (j==0)System.out.print("| ");
				System.out.print( nueva[i][j] + " " );
				}
			System.out.print("|\n");
			}
		System.out.println("------------------------------------------");
	}

}
