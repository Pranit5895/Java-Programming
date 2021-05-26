package Capitalize;

public class Capital {
    static String capitailizeWord(String str) {
        StringBuffer s = new StringBuffer();
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }
        return s.toString().trim();
    }
	public static void main(String[] args) {
        String s1 = "Ram goes to school and always obeys his teachers";
        s1 = s1.toLowerCase();
        System.out.println(capitailizeWord(s1));
	}

}
