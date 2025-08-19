package week3.day1;

public class ChangeOddIndexToUpperCase {
	

		public static void main(String[] args) {
			String test = "changeme";
			int strlength = test.length();
			char[] charArray = test.toCharArray();
		    char c;
		    String reverse = "";
			for (int i = strlength - 1; i >= 0; i--) {
				c = charArray[i];
				if (i % 2 != 0) {
					
					reverse = reverse + String.valueOf(Character.toUpperCase(c));
				} else
					
					reverse = reverse + String.valueOf(c);
				continue;
			}
			
			StringBuilder sb = new StringBuilder(reverse);
			sb.reverse();
			String original = sb.toString();
			System.out.println(" changing the character in the odd index to upper case is: ");
			System.out.println(original);

		}

	}


