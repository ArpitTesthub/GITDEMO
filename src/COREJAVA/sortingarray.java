package COREJAVA;

public class sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MULTIDIMENSIONAL ARRAY
		
		int a[][] = new int [2][3];//first denotes to row and second to column
		
		 a[0][0] = 2;
		 a[0][1] = 3;
		 a[0][2] = 4;
		 a[1][0] = -1;
		 a[1][1] = 8;
		 a[1][2] = 9;
		 
		 
		//System.out.println(a[1][0]);
		
		//-------------------------------------------------------------------------//
		//outer for loop for rows & inner loop for columns
	for (int i= 0; i<2; i++) {
		
		
		
		for (int k = 0; k<3; k++) {
			
			System.out.print(a[i][k]);
			System.out.print("\t");
			}
		System.out.println("");
	}
//-------------------------------------------------------------------------------------		
		
		
		 
	}
}
