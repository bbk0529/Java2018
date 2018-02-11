package practice.bkpark;
import java.util.Arrays;

public class Sort2 {

	private int[] A = {1,5,2,-1};
	
	void mergeSort(int[] A, int l, int r){
		if (l>=r) return;
		int m = (l+r)/2;
		mergeSort(A, l, m);
		mergeSort(A, m+1,r);
		merge(A,l,m,r);
	}
	
	void merge(int[] A, int l, int m, int r) {
		
		int[] LArr = Arrays.copyOfRange(A, l, m+1);
		int[] RArr = Arrays.copyOfRange(A, m+1, r+1);
		int Li=0, Ri=0, Ai=l; 
		
		while(Li<=LArr.length-1 && Ri <= RArr.length-1) {
			if (LArr[Li]<=RArr[Ri]) A[Ai++] = LArr[Li++];
			else A[Ai++] = RArr[Ri++];
		}
		while (Li<=LArr.length-1) A[Ai++] = LArr[Li++]; 
		while (Ri<=RArr.length-1) A[Ai++] = RArr[Ri++];
		
	}
	
	void print(int[] A) {
		for(int n : A) System.out.println(n);
	}
	
	public static void main(String[] args) {
		Sort2 sort= new Sort2();
		sort.mergeSort(sort.A, 0, sort.A.length-1);
		sort.print(sort.A);
	}
	
}
