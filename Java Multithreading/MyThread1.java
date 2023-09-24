//Creating thread using Thread class

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("The value of i: "+i);

			try{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}