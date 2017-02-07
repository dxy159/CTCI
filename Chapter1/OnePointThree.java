package Chapter1;

public class OnePointThree {

	public static String urlify(String s, int trueLength) {
		
		int totalLength = s.length();
		char[] arr = new char[totalLength];
		
		int arrIndex = 0;

		for (int i = 0; i < trueLength; i++) {
			
			char c = s.charAt(i);
			
			if (c == ' ') {
				arr[arrIndex] = '%';
				arr[arrIndex + 1] = '2';
				arr[arrIndex + 2] = '0';
				arrIndex += 3;
			} else {
				arr[arrIndex] = c;
				arrIndex++;
			}
			
		} 

		String finalString = "";
		for (char c : arr) {
			finalString += c;
		}
		
		return finalString;
		
	}
	
	public static void main(String[] args) {
		System.out.println(urlify("Mr John Smith    ", 13));
	}
	
}

// 1. Get the length of string including the extra white space, lets called this totalLength
// 2. Initialize a character array of length totalLength
// 3. Write a for loop from index 0 to trueLength, iterating through each character in the string (excluding extra white spaces)
// 4. We should also index the character array, adding the character to the corresponding index.
//   4.1 If character is not space, increment index by 1 and add character to array
//   4.2 If character is space, increment index by 3 and add '%20' to array
// 5. Convert character array into string and return it