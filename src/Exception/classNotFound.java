package Exception;

public class classNotFound {

	public static void main(String args[]) {
	    try
	    {
	      Class.forName("NoClassExist");
	    }
	    catch (ClassNotFoundException ex)
	    {
	      ex.printStackTrace();
	    }
}
}
