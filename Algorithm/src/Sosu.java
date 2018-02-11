import java.util.HashMap;
import java.util.Map;

public class Sosu {

	public static void main(String[] args) {
		int n = 168;
		Map<Integer, Integer> map = new HashMap<>();
		Sosu sosu = new Sosu();
		sosu.div(n, map);
		sosu.print(map);
	}

	public Map<Integer, Integer> add(int i, Map<Integer, Integer> map) {
		if (map.get(i) != null) {
			map.put(i, map.get(i) + 1);
		} else {
			map.put(i, 1);
		}
		return map;
	}

	public void div(int n, Map<Integer, Integer> map) {
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				add(i, map);
				div(n / i, map);
				break;
			}
		}
	}

	public void print(Map<Integer, Integer> map) {
		for (int i : map.keySet()) {
			System.out.println(i + "^" + map.get(i));
		}
	}

}
