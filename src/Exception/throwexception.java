package Exception;

import java.io.IOException;

public class throwexception {

	void method() throws IOException {
		System.out.println("device operation performed");
	}
	
	 public static void main(String args[])throws IOException{//declare exception  
	     throwexception obj = new throwexception(); 
	     obj.method();  
	  
	    System.out.println("normal flow...");  

}
}