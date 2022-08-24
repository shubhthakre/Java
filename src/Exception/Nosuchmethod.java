package Exception;

public class Nosuchmethod {

	public void print(String myString) {
        System.out.println(myString);
    }   
	
	public static void main(String[] args) {
		
		Nosuchmethod obj = new Nosuchmethod();
		obj.print("Hello World");
	}
}
