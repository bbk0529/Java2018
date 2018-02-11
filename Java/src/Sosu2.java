import java.util.Scanner;

public class Sosu2 {

	public static void main(String[] args) {
		int target = 864;
		int[] mod = new int[(int) Math.sqrt(target)];
		Sosu2 sosu = new Sosu2();

		sosu.div(target, mod);
		sosu.printmod(mod);
	}

	public int[] div(int n, int[] mod) {
		int sq = (int) Math.sqrt(n);
		for (int i = 2; i <= sq; i++) {
			if (n % i == 0) {
				mod[i] += 1;
				div(n / i, mod);
				break;
			}
			if (i == sq)
				mod[i] += 1;
		}
		if (sq < 2)
			mod[n] += 1;
		return mod;
	}

	public void printmod(int[] mod) {
		for (int i = 0; i < mod.length; i++) {
			if (mod[i] != 0) {
				System.out.println(i + "^" + mod[i]);
			}
		}
	}

}
