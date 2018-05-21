package myArrays;

public class My2DArray {
	
	
	
	My2DArray(){
		
		this.init();
		
	}
	
	
	
	void init(){
		
		int[][] my2D = new int[2][3];
		
		for ( int i = 0; i < my2D.length; i++ ){
		
			for ( int j = 0; j < my2D[i].length; j++ ){ 
				
				my2D[i][j] = j+1;
			
				System.out.println("Element in index: ("+ i +", "+ j + ")"+ " = " + my2D[i][j]);
								
			}
		
		}
				
	}
	
}
