import java.io.File;

public class FileList {

	public static void main(String[] args) {
		String path=".//src//";
		File file = new File(path);
		File []fileList = file.listFiles();

		
		String path2=".//";
		File file2 = new File(path);
		File []fileList2 = file.listFiles();

		
		for (File tempFile:fileList) {
			  System.out.println(tempFile);
			  System.out.println(tempFile.toString().indexOf(".java"));
		}
	}
	
}
