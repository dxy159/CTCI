package Chapter1;

public class OnePointSix {
	
	static String compression(String s) {
		
		s += ' ';
		String compressed = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			int count = 1;
			
			if (c == ' ') {
				break;
			}
			
			while (c == s.charAt(i + 1)) {
				count++;
				i++;
			}
			
			compressed += c;
			compressed += count;
			
		}
		
		if (compressed.length() < s.length()) {
			return s;
		}
		
		return compressed;
		
	}
	
	public static void main(String[] args) {
		System.out.println(compression("abcdefg"));
	}
	
}

// 1. Iterate through the string, examining each character
// 2. Create a while loop, which executes until the next character doesn't equal the previous, counting how many occurences
// 3. Append the character followed by number of occurences to the final string
// 4. Check if compressed string is smaller, if not, return original string
// PROBLEM: When we are checking the last character in the string, i + 1 will be out of bounds, so add spaces to end up s, 
//			and if c == ' ', break