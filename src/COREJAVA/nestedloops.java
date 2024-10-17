package COREJAVA;

public class nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = 1;
		int k = 3;
		int m = 1;
		// 3
		//6 9
		// 12 15 18 
		//System.out.println("outer loop started");
		
		for(i= 0; i<=3; i++)
		{
			for(j = 1; j<=i+1; j++)
			{
				System.out.print(k*m);
				System.out.print("\t");
               m++;
               
			}
			System.out.println(  "");

		}
		//---------------------------
		
		
		
		//-----------------------------
		
		//for(i= 1; i<=4; i++)
		{
			//for(j = 1; j<i; j++)
			{
				//System.out.print(k);
				//System.out.print("\t");
               k++;
               
			}
			System.out.println(  "");

		}

	}


}
