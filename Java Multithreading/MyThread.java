//Creating thread using Runnable
class MyThread implements Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i is "+i);

			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();

		Thread thr=new Thread(t1);

		MyThread1 t2=new MyThread1();


		thr.start();
		t2.start();
	}
}