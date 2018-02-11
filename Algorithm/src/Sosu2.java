import java.util.HashMap;
import java.util.Map;

public class Sosu2 {

	public static void main(String[] args) {
		int n = 323242;
		Map<Integer, Integer> map = new HashMap<>();
		Sosu2 sosu = new Sosu2();
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
		boolean toogle=false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				add(i, map);
				div(n / i, map);
				toogle=true;
				break;
			}
		} 
		if (!toogle) add(n,map);		
	}
	
	

	public void print(Map<Integer, Integer> map) {
		for (int i : map.keySet()) {
			System.out.println(i + "^" + map.get(i));
		}
	}

}
