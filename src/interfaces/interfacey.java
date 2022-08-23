package interfaces;

public interface interfacey {
	
	public String data2();

}

  class data implements interfaceX,interfacey {

	
	public int data1() {
		int a = 10;
		return a;
	}
	
	public String  data() {
		String b = "shubham";
		return b;
	}
	
	
	public static void main(String[] args) {
		data obj = new data();
		obj.data1();
		obj.data2();
	}
}
