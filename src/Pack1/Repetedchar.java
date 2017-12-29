package Pack1;

import org.apache.commons.lang3.StringUtils;

public class Repetedchar {

	public static char inputString(String str) {
		
		int i;
		char ch[] = str.toCharArray();
		System.out.println(ch);
		int len = ch.length;
		for (i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ch[i] == ch[j]) {
				
				}
				
			}
		}return ch[i];
			
	}

	public static void main(String[] args) {

		String str = "color";
		try {
			System.out.println("First duplicate character in a string : "
					+ inputString(str));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}
}
