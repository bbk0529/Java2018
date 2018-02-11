package Test;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PNum {
	
	private Map<Integer, Integer> map = new HashMap<>();
	
	
	
	Set<String> getFiles(String path) {
		File file = new File(path);
		File[] flist = file.listFiles();
		
		Set<String> set = new HashSet<>();
		for(File f:flist) set.add(f.getName());
		return set;
	}
	
	
	int pivo(int N) {
		if (N<2) return N;
		int[] P = new int[N+1];
		P[0]=0;
		P[1]=1;
		
		for(int i=2;i<=N;i++) P[i]=P[i-2]+P[i-1];
		return P[N];
	}
	
	int pivo2(int N) {
		if(N<2) return N;
		return pivo2(N-2) + pivo2(N-1);
	}
	
	
	void check (int N) {
	
		boolean [] A = new boolean[N+1];
		
		for(int i=2; i<=N; i++) {
			if (A[i]==true) continue;
			for (int j=2*i; j<=N; j+=i) if(j%i==0) A[j] = true;
		}
		
		for(int i=2;i<=N;i++) if (A[i]==false) System.out.println(i);
	}
	
	void div(int N) {
		boolean toggle=false;
		for (int i=2; i<=Math.sqrt(N); i++) {
			if (N%i ==0) {
				map.put(i, map.get(i)==null ? 1 : map.get(i) +1);
				div(N/i);
				toggle=true;
				break;
			}
		}
		
		if (toggle==false) {
			map.put(N, map.get(N)==null ? 1: map.get(N) + 1);
		}
	}
	
	
	public static void main(String[] args) {
		PNum pn = new PNum();
		//pn.check(1000);
		
//		for(int i=1; i<=1000; i++ ) {
//			pn.div(i);
//			System.out.print(i + "    ");
//			for(int j : pn.map.keySet()) {
//				System.out.print(j + "^" + pn.map.get(j) + "\t");
//			}
//			pn.map.clear();
//			System.out.println();
//		}
		
		Set<String> set = pn.getFiles("..");
		Set<String> set2 = pn.getFiles("../springProjectEx");
		System.out.println(set.containsAll(set2));
		
		for(int i=0;i<=15;i++ ) {
			System.out.println(pn.pivo(i));
			System.out.println(pn.pivo2(i));
		}
		
	}
}
