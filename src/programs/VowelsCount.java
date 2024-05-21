package programs;

public class VowelsCount {
	 public static void main(String[] args) {
		String s="Hello World";
		s=s.toLowerCase();
		int vowels=0;
		int vowelsindex=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='i'||ch=='a'||ch=='o'||ch=='e'||ch=='u') {
				 vowels=vowels+i;
				 vowelsindex=vowelsindex+i;
				System.out.println(ch+" "+i);
			}
		}
			System.out.println(vowels);
			System.out.print(vowelsindex);
		
	}
}
