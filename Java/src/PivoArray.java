
public class PivoArray {

	int pivo1 (int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return pivo1(n-1) + pivo1(n-2);
	}
	
	int pivo2 (int n) {
		int[] P = new int[n+1];
		P[0]=0;
		P[1]=1;
		for(int i=2;i<=n;i++) P[i] = P[i-2] + P[i-1];
		
		return P[n];
	}
	
	
	public static void main(String[] args) {
		PivoArray pa	= new PivoArray();
		System.out.println(pa.pivo1(10));
		System.out.println(pa.pivo2(10));
	}
	
}
