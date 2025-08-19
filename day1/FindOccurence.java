package week3.day1;

public class FindOccurence {
	

		public static void main(String[] args) {
	       String input="TestLeaf";
			int count=0;
			char[] charArray = input.toCharArray();
			for(int i=0;i<input.length();i++) {
			if(charArray[i]=='e') {
					count=count+1;
				}
			}
			
			System.out.println(" count of 'e' in the String TestLeaf is: "+count);

		}

	}


