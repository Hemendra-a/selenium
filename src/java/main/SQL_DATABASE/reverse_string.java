package SQL_DATABASE;

public class reverse_string {
	
	public void getreverse(String input)
	{    
		String[] s=input.split(" ");
		String out="";
		int count=0;
		for(int i=0;i<=s.length-1;i++)
		{
			
			String dd = s[i];
			
			
			char[] c = dd.toCharArray();
		
			
			for(int k=c.length-1;k>=0;k--)
			{
				out=out+c[k];
				
			}
			out=out+" ";
		}
		System.out.println(out);

	}
	

}
