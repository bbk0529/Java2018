package practice.bkpark;

import java.util.HashMap;
import java.util.Map;

public class PrimeNumber {

	private int N;
	private Map<Integer, Integer> map = new HashMap<>();

	public void div(int n, Map<Integer, Integer> map) {
		boolean toggle = false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
				div(n / i, map);
				toggle = true;
				break;
			}
		}
		if (toggle == false) {
			map.put(n, map.get(n) == null ? 1 : map.get(n) + 1);
		}
	}

	public void filter(int n) {
		boolean[] check = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			if (check[i] == true)
				continue;
			for (int j = i * 2; j <= n; j += i) {
				if (j % i == 0)
					check[j] = true;
			}
		}

		for (int i = 2; i <= n; i++) {

			if (check[i] == false)
				System.out.println(i);

		}
	}

	public int pivo(int n) {
		if (n == 0) return 0;
		if (n <= 2)	return 1;
		return pivo(n - 2) + pivo(n - 1);
	}

	public int fact(int n) {
		if (n == 1)	return 1;
		return n * fact(n - 1);
	}
	
	public void pivo2 (int n) {
		int[] p = new int[n+1];
		p[0]=0;
		p[1]=1;
		
		for(int i=2; i<=n;i++) {
			p[i]=p[i-1] + p[i-2]; 
		}
		
		for(int t: p) 
			System.out.println(t);
		
		
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.div(999, primeNumber.map);
		for (int i : primeNumber.map.keySet()) {
			System.out.println(i + "^" + primeNumber.map.get(i));
		}

		// primeNumber.filter(1000);
		// System.out.println(primeNumber.fact(10));
		for(int i=0; i<=10;i++) System.out.println(primeNumber.pivo(i));
		primeNumber.pivo2(10);

	}

}