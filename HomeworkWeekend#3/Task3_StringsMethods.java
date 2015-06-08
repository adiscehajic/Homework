public class Task3_StringsMethods {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Bit";

		// Calling method combiningTwoStrings
		System.out.println("Combining characters of the two strings: " + combiningTwoStrings(str1, str2));
		
		// Calling method secondString
		System.out.println("String that comes second is: " + secondString(str1, str2));
		
		// Calling method areAnagrams
		System.out.println("Are two strings anagrams? " + areAnagrams(str1, str2));
	}

	// This method combines the letters of two strings
	public static String combiningTwoStrings(String str1, String str2) {

		String str3 = "";

		int maxLength = 0;

		// Checking which string is larger
		if (str1.length() >= str2.length()) {
			maxLength = str1.length();
		} else {
			maxLength = str2.length();
		}

		// Combining two strings into third
		for (int i = 0; i < maxLength; i++) {
			if (str1.length() >= str2.length()) {
				if (i < str2.length()) {
					str3 += "" + str1.charAt(i) + str2.charAt(i);
				} else {
					str3 += "" + str1.charAt(i);
				}
			} else if (str2.length() > str1.length()) {
				if (i < str1.length()) {
					str3 += "" + str1.charAt(i) + str2.charAt(i);
				} else {
					str3 += "" + str2.charAt(i);
				}
			}
		}
		return str3;
	}
	
	// This method checks if characters of first string are contained in second string
	/*public static boolean containesCharacters(String str1, String str2){
		
		
		
	}*/
	
	// This method checks which of the two strings comes second
	public static String secondString(String str1, String str2){
		if (str1.compareToIgnoreCase(str2) > 0) {
			return str1;
		} else {
			return str2;
		}
	}
	
	// This method checks if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2){
		
		for (int i = 0; i < str1.length(); i++) {
			int index = str2.indexOf(str1.charAt(i));
			
			if (index != -1) {
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			} else {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	
	

}
