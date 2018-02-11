package practice.bkpark;

public class ProductMatrix {
	public int[][] productMatrix (int [][] A, int [][] B) {
		
		if(A[0].length != B.length) return null;
		int [][] R = new int[A.length][B[0].length];
		
		for(int i=0;i<A.length;i++) {
			for (int j=0;j<B[0].length;j++) {
				for(int k=0;k<A[0].length; k++) {
					R[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return R;
	}
	
	public static void main(String[] args) {
		int [][] A = {{2,3,5,1}, {1,0,5,1}, {1,4,5,1}};
		int [][] B = {{2,0,-9}, {4,5,-2}, {9,1,-1}, {11,-1,-15}};
		ProductMatrix pm = new ProductMatrix();
		int [][] R = pm.productMatrix(A, B);
		for(int i=0; i<R.length; i++) {
			for(int a : R[i]) System.out.print(" " + a + " ");
			System.out.println();
		}
	}
}
