package COREJAVA;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "CascadingSystem";
		
		//System.out.println(a.charAt(4));
		
		System.out.println(a.substring(4));
		System.out.println(a.concat("is a substring"));
		
		
		String arr[]=a.split("S");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("C", "s"));
		
		
		
		
	}

}
