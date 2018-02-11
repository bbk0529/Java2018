package practice.bkpark;
import java.util.Arrays;

public class Sort {
	private int[] A={-1, 999, 1, 2, -99, 0, 12, 15, 99, 3, 2, 11111, 2, 3, 56, 1, 23};

	void MergeSort(int[] A, int l, int r) {
		if (l >= r)	return;
		int mid = (l + r) / 2;
		MergeSort(A, l, mid);
		MergeSort(A, mid + 1, r);
		Merge(A, l, mid, r);
	}

	void Merge(int[] A, int l, int mid, int r) {
		int[] B1 = Arrays.copyOfRange(A, l, mid + 1);
		int[] B2 = Arrays.copyOfRange(A, mid + 1, r + 1);
		int B1i = 0, B2i = 0, Ai = l;

		while (B1i <= B1.length - 1 && B2i <= B2.length - 1) {
			if (B1[B1i] <= B2[B2i])	A[Ai++] = B1[B1i++];
			else A[Ai++] = B2[B2i++];
		}
		while (B1i <= B1.length - 1) A[Ai++] = B1[B1i++];
		while (B2i <= B2.length - 1) A[Ai++] = B2[B2i++];
	}

	void print(int[] A) {
		for (int n:A ) System.out.println(n);
	}

	
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.MergeSort(sort.A, 0, sort.A.length - 1);
		sort.print(sort.A);
	}
}
