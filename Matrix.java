package JavaBasics;

public class Matrix {

	int elements[][];
	

	public Matrix(int[][] array) {
		this.elements = array;
	}
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[][] = 	{{2,2},
							{3,3}};
		
		Matrix m = new Matrix(array);
		
		int array2[][] = 	{{1,0},
							{1,0}};
		

		Matrix n = new Matrix(array2);
		
		Matrix.product(m,n);
		

	}





	private static void product(Matrix m, Matrix n) {
		for(int i=0;i<2;i++){  
			 for(int j=0;j<2;j++){  
			   System.out.print(m.elements[i][j]*n.elements[i][j] + " ");  
			 }  
			   System.out.println();
		}
		
	}

}
