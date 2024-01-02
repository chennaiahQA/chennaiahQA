package Strings_assesment;

public class strings44 {

	public static void main(String[] args) {
		String str="Chennaiah";
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}

