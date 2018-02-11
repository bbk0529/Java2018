import java.io.File;

public class Printing {

	public static void main(String[] args) {
		String input = "abcdef";
		
		for(int i=input.length()-1;i>=0;i-=2) {
			System.out.print(input.charAt(i));
		}
		
		File file=new File(".");
		File[] fileList= file.listFiles();
		for (File a : fileList) System.out.println(a);
		
	}
	
}
