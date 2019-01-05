package program;

public class Toggle
{
	static String toggle(String st)
	{
		String[] word=st.split("\\s");
		String capital="";
		for (String s:word)
		{
			/*String first=s.substring(0,1);
			String after=s.substring(1);
			after=after.toUpperCase();
			capital+=first+after+" ";
			*/
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			String a=sb.toString();
			String first=a.substring(0,1);
			String after=a.substring(1);
			after=after.toUpperCase();
			capital+=first+after+" ";
			
			
		}
		
		return capital.trim();
		
		
	}
	public static void main(String[] args) 
	{
	System.out.println(Toggle.toggle("this is javatpoint"));
	}

}
