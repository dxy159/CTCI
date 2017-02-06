package Chapter1;

public class OnePointFive {
	
	static boolean oneAway(String s1, String s2) {
		if (s1 == s2) {
			return true;
		}
		
		if (s1.length() == s2.length()) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					count++;
				}
			}
			return count <= 1;
		} else {
			if (s1.length() - 1 == s2.length()) {
				if (!s1.contains(s2)) {
					return false;
				}
				return true;
			} else if (s2.length() - 1 == s1.length()) {
				if (!s2.contains(s1)) {
					return false;
				}
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(oneAway("slot", "ploi"));
		System.out.println("Hie".contains("Hi"));
	}
	
}

// Determine if two strings are one or zero edits away from each other

/*

	1. Check condition if two strings are the same, return true
	2. Check if lengths are the same. If they are, there must be s1.length - 1 number of chararcters that remain the same
	3. If lengths are not the same, s2.length must be one less or one greater than s1.length. 

*/