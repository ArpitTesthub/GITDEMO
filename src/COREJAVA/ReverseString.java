package COREJAVA;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String result="";
	    String s = "Yopmail";
		//for(int i=s.length()-1; i>=0; i--) {
	       // result = result + s.charAt(i);
	    
	   // System.out.println(result);

	    // Using StringBuffer class
	   StringBuffer buffer = new StringBuffer(s);
	   buffer.reverse();
	   System.out.println(buffer); 
	   
	   String m = "Yopmail";
	   System.out.println(s.concat("test"));
	   
	   
	   
	   
	}
	
}
//---stringbufer & builder are two classes which are mutuable

//stringbuilder is not thread safe, allows multithreading  to run multiple test one by one then use buffer
