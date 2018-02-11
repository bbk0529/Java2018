import java.util.HashMap;
import java.util.Map;

public class Sosu3 {

	private int targetNumber;
	private Map <Integer, Integer> map = new HashMap<> ();
	
	public int getTargetNumber() {
		return targetNumber;
	}

	public void setTargetNumber(int targetNumber) {
		this.targetNumber = targetNumber;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}
	

	public Sosu3(int targetNumber) {
		super();
		this.targetNumber = targetNumber;
	}

	public static void main(String[] args) {
		Sosu3 sosu = new Sosu3(10000);
		sosu.div(sosu.getTargetNumber());
		sosu.print();
		sosu.check();
	}
	
	public void div (int n) { 
		
		boolean toggle=false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				add(i);
				div(n/i);
				toggle=true;
				break;
			}
		}
		if(toggle==false) add(n);
	}
	
	public void add (int n) {
		if(map.get(n)==null) map.put(n,1);
		else map.put(n,map.get(n)+1);
	}
	
	public void print() {
		int total=1;
		for(int n : map.keySet()) {
			System.out.println(n + " ^ "  + map.get(n));
		}
	}
	
	public void check() {
		int[] arr = new int[targetNumber+1];
		
		for(int i=2;i<=targetNumber;i++) {
			if (arr[i]==-1) continue;
			for (int j=2*i;j<=targetNumber;j+=i) {
				arr[j]=-1;
			}
		}
		
		for (int i=2;i<=targetNumber;i++) if (arr[i]!=-1) System.out.println(i);
	}

}
