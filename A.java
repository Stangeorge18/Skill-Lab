package p1;

public class A extends Thread
{
	public void run()
	{
		int odd[]={1,3,5,7,9};
		for(int i=0;i<5;i++)
		{
			System.out.println(odd[i]);
			try
			{
				sleep(107);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}