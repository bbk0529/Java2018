import java.io.File;

public class FileList {

	public static void main(String[] args) {
		String path=".//src//";
		File file = new File(path);
		File []fileList = file.listFiles();

		
		String path2=".//src2//";
		File file2 = new File(path2);
		File []fileList2 = file2.listFiles();

		
		for (File f:fileList2) {
			System.out.println(f);
			
		}
		
		
		for (File f:fileList) {
			System.out.println(f);
			
		}
//		
//		for (File tempFile:fileList) {
//			for (File tempFile2:fileList2 ) {
//			  if(tempFile2.toString().indexOf(tempFile.toString())!=-1) System.out.println(tempFile2 + "is there");
//			  else System.out.println(tempFile + "is not exist");
//			}
//		}
	}
	
}
