package Test;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pivo {
	
	private Map<Integer, Integer> map = new HashMap<>();
	
	
	void div (int n) {
		if (n==1) return;
		
		boolean toggle=false;
		for (int i=2; i<=Math.sqrt(n); i++ ) {
			if (n%i==0) {
				map.put(i, map.get(i) == null ? 1 : map.get(i)+1 );
				div(n/i);
				toggle=true;
				break;
			}
		}
		
		if (toggle==false) {
			map.put(n, map.get(n) == null ? 1 : map.get(n) + 1);
		}
	}
	
	int pivo1(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		return pivo1(n-2) + pivo1(n-1);
	}
	
	
	int pivo2 (int n) {
		int[] A = new int[n+1];
		A[0]=0;
		A[1]=1;
		
		for(int i=2; i<=n ; i++ ) {
			A[i] = A[i-2] + A[i-1];
		}
		return A[n];
	}
	
	
	void check(int n) {
		int i=2;
		if (n<2) {
			System.out.println(n + " Not valid number");
			return;
		}
		if (n<4) {
			System.out.println(n + " prime");
		}
		for(;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				System.out.println(n+ "is not prime number");
				break;
			}
			
		}
		if (i==(int)Math.sqrt(n)) System.out.println(n + "is prime number");
	}
	
	Set<String> filelist (String path) {
		File file = new File(path);
		File[] list = file.listFiles();

		Set<String> flist = new HashSet<>();

		for(File l : list) {
			flist.add(l.getName());
		}
		return flist;
	}
	
	
	
	public static void main(String[] args) {
		Pivo pivo = new Pivo();
//		for(int i=1; i<=20;i++) {
////			System.out.println(pivo.pivo1(i));
////			System.out.println(pivo.pivo2(i));
////			pivo.check(i);
//			pivo.map.clear();
//			pivo.div(i);
//			System.out.print(i + "\t") ;
//			for (int m: pivo.map.keySet()) System.out.print(m + "^" + pivo.map.get(m) + " ");
//			System.out.println();
//		}
		Set<String> flist1 = pivo.filelist("../springProjectEx");
		Set<String> flist2 = pivo.filelist("../Java");
		
		System.out.println("========SPRING PROJECT==============");
		for(String f : flist1) {
			System.out.println(f);
		}
		
		System.out.println("========JAVA==============");
		for(String f : flist2) {
			
			System.out.println(f + "\t\t[" + (flist1.contains(f)==true ? "Included" : "=") + "]");
		}
//		
//		
//		Iterator <File> it = pivo.flist.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
	}
	
	
	
	
}
