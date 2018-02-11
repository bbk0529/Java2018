import java.util.HashMap;
import java.util.Map;

public class PNumber {

	
	private Map<Integer, Integer> map = new HashMap<>();
	
	void div (int N) {
		boolean toggle=true;
		for (int i=2;i<=Math.sqrt(N);i++) {
			if(N%i == 0 ) {
				
				map.put(i, map.get(i)==null ? 1 : map.get(i)+1);
				div(N/i);
				toggle=false;
				break;
			}
		}
		if(toggle) 	map.put(N, map.get(N) == null ? 1 : map.get(N) +1);
	}
	
	public static void main(String[] args) {
		PNumber pn = new PNumber();
		pn.div(99);
		for(int i : pn.map.keySet()) System.out.print("\t"+ i + "^" + pn.map.get(i));
	}
}
