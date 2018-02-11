package Test;

public class Haha {
	static private String a="";
	private String b="";
	

	public Haha () {
		a+="_constructor_";
		b+="_constructor_";
	}
	
	static {
		a+="_static_";
		
		
	}
	
	{
		a+="_block_";
		b+="_block_";
	
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		Haha cb = new Haha();
		System.out.println(a);
		System.out.println(cb.b);
	}
}
