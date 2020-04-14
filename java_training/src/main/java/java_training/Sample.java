package java_training;

public class Sample {
	public static void main(String args[])
	{
		int x=121;
		int temp=x;
		int y=0;
		int z=x;
		while(x!=0)
		{
			y=(y*10+x%10);
			x=x/10;
		}
		if(temp==y)
		{
			System.out.println("palindrome");
		}
		else
		{
		System.out.println("notpalandrome");	
	}
	}
	
}
