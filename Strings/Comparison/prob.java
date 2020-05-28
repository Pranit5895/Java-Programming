public class que2 {
	static String LowerToUpper(StringBuffer s) {
		String result = ("");
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {

			// check valid alphabet and it is in lowercase
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch = (char) (s.charAt(i) - 32);
			}
			// else keep the same alphabet or any character
			else {
				ch = (char) (s.charAt(i));
			}

			result = result + ch;
		}
		return result;
	}
