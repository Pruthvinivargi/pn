package demo;

import org.testng.annotations.Test;

public class class1 
{
	@Test
	public void reverse()
	{
		String s1="avaj";
		String q="";
		for(int i=3;i>=0;i--)
		{
			q=q+s1.charAt(i);
		}
	}

}
