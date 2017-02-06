package Chapter1;

public class OnePointOne {

	static boolean isUnique(String s) {
		
		boolean[] tracker = new boolean[128];	//Set boolean tracker
		
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);		//Get each character in string with for loop
			
			if (tracker[currentChar]) {		//If already set to true, return false. Else, set that index to true
				return false;
			} else {
				tracker[currentChar] = true;
			}
		}
		return true;	//If for loop finishes execution without returning false, that means s is unique
		
	}
	
	public static void main(String[] args) {
			
		System.out.println(isUnique("asdfgh"));
		
	}
	
}

// Make boolean array for all characters
// For all characters in string, set that index to true
// Will return false if the slot is already set to true