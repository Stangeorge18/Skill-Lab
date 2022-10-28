package p2;

public class B extends Thread
{
	public void run()
	{
		int even[]={2,4,6,8,10};
		for(int i=0;i<5;i++)
		{
			System.out.println(even[i]);
			try
			{
				sleep(145);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}