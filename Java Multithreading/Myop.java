class UserThread extends Thread
{

	public void run()
	{
		System.out.println("This is user define thread!!!!");
	}
}



class Myop{
	public static void main(String[] args) {
		System.out.println("Program Started....");

		int x=120+12;
		System.out.println("Sum is :"+x);
		//Thread...

		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("Current running thread is: "+tname);

		//Rename
		t.setName("Avishkar");

		System.out.println(t.getName());

		try{ 

			Thread.sleep(5000);
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}

      System.out.println("Id of Thread: "+t.getId());

	//userdefien thread start
       UserThread t2=new UserThread();
       t2.start();

		System.out.println("Program ended....");
	}
}