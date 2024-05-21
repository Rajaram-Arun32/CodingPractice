package programs;

public class ReverseWordString {

	public static void main(String[] args) {
		String s = "i love my india";
		String [] s1=s.split(" ");
		String rev="";
		String s2="";
		for(int i=0;i<s1.length;i++) {
			s2=s1[i]+" ";
			for(int j=s2.length()-1;j>=0;j--) {
				rev=rev+s2.charAt(j);
			}
		}
		System.out.println(rev);
	}
}
