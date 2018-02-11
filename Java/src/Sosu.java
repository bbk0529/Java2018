import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sosu {
	Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		int target = 0;
		try {
			Scanner sc = new Scanner(System.in);
			target = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}

		Sosu sosu = new Sosu();
		Map<Integer, Integer> map = sosu.div(target);

		for (int i : map.keySet()) {
			System.out.println(i + "^" + map.get(i));
		}

	}

	public Map<Integer, Integer> div(int n) {
		int sq = (int) Math.sqrt(n);

		for (int i = 2; i <= sq; i++) {
			if (n % i == 0) {
				System.out.print(i + "*");
				if (map.get(i) != null) {
					map.put(i, map.get(i) + 1);
				} else {
					map.put(i, 1);
				}
				div(n / i);
				break;
			}

			if (i == sq) {
				if (map.get(n) != null) {
					map.put(n, map.get(n) + 1);
				} else {
					map.put(n, 1);
				}
				System.out.println(n);
			}
		}

		if (sq < 2) {
			if (map.get(n) != null) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
			System.out.println(n);
		}

		return map;
	}

}
