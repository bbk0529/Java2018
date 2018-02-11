// http://marobiana.tistory.com/91
public class ListSosu {

	public void check(int N) {
		boolean[] arr = new boolean[N + 1];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == true) {
				continue;
			}
			for (int j = i + i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
		print(arr);
	}
	
	public void print(boolean arr[]) {
		for(int i=2; i<arr.length;i++) {
			if (arr[i]==false) System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ListSosu listSosu = new ListSosu();
		listSosu.check(100000);
	}
}
