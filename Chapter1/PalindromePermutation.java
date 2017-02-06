package Chapter1;

public class PalindromePermutation {
	
	static boolean isPP(String s) {
		s = s.toLowerCase();
		// Initialize array to track number of occurences
		int length = 'z' - 'a' + 1;
		int[] tracker = new int[length];
		int countOdd = 0;
		
		// Iterate through each character and increment count
		for (char c : s.toCharArray()) {
			tracker[c - 'a' + 1]++;
		}
		
		// Iterate through tracker and find the number of odd occurences 
		for (int i = 0; i < length; i++) {
			if (tracker[i] % 2 != 0) {
				countOdd++;
			}
		}
		return countOdd <= 1;
	}
	
	public static void main(String[] args) {
		System.out.println(isPP("Hihiaa"));
	}
	
}
