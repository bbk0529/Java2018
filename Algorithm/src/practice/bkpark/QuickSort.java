package practice.bkpark;

import java.util.Arrays;

public class QuickSort {

	private int[] A = {9,1,3,2,12,6,21,7,155,-1, 12};
	
	void quickSort(int[] A, int l, int r) {
		
		if (l>=r) {
			for(int i : A) System.out.print(i + "\t");
			System.out.println();
			return;
		}
			
		int pivot = A[l];
		int LIdx = l+1;
		int RIdx = r;
		
		while (LIdx<=RIdx) {
			while(pivot>=A[LIdx] && LIdx<=r) {
				LIdx++;
			}
			System.out.println("LIdx " + LIdx);
			
			while(pivot<=A[RIdx] && RIdx>=l+1) {
				RIdx--;
			}
			System.out.println("RIdx " + RIdx);
			
			if (LIdx <= RIdx) {
				int temp=A[RIdx];
				A[RIdx] = A[LIdx];
				A[LIdx] = temp; 
				System.out.println("switched");
			} else {
				A[l] = A[RIdx];
				A[RIdx] = pivot;
				System.out.println("pivot in place");
			}
			
		}
		quickSort(A, l, RIdx-1);
		quickSort(A, RIdx+1, r);
	}

	
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(quickSort.A, 0, quickSort.A.length-1);
		
	}

}
