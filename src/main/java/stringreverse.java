
public class stringreverse {

	public static void main(String[] args) {
		String s="Sharvil likes to play football";
		//String j=s.replaceAll(" ", "");
		System.out.println(s);
		for(int i=(s.length())-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
