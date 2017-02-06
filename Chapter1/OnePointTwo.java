package Chapter1;

public class OnePointTwo {
	
	static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		int[] tracker = new int[128];
		for (char c : s1.toCharArray()) {
			tracker[c]++;
		}
		for (char c : s2.toCharArray()) {
			tracker[c]--;
		}
		for (int i = 0; i < tracker.length; i++) {
			if (tracker[i] != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPermutation("Hello", "lelos"));
		
	}
	
}
