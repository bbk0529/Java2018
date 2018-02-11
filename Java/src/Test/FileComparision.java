package Test;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileComparision {

	Set<String> getList(String path) {
		Set <String> flist = new HashSet<>(); 
		
		File file = new File(path);
		File[] list = file.listFiles();
		for(File f:list) {
			flist.add(f.getName());
		}
		return flist;
	}
	
	public static void main(String[] args) {
		FileComparision fc = new FileComparision();
		Set <String> flist = fc.getList("..");
		for(String f:flist) System.out.println(f);
	}
	
}
