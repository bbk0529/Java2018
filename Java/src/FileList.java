import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class FileList {

	
	
	Set<String> getFileList (String path) {
		Set<String> set = new HashSet<>();
		
		File file = new File(path);
		File[] list = file.listFiles();
		for(File f: list) set.add(f.getName());
		return set;
	}
	
	public static void main(String[] args) {
		Set<String> flist1 = new FileList().getFileList("../springProjectEx/src");
		Set<String> flist2 = new FileList().getFileList("../springProjectEx4");
		
		for(String f : flist2) {
			if(flist1.contains(f)) {
				System.out.println(f + "[Included]");
			}
			else System.out.println(f + "[Excluded]");
		}
	}
}
