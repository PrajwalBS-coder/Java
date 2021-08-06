class threads implements Runnable
{
	int limit;
	threads(int limit)
	{
		this.limit=limit;
	}
	public void run()
	{
		try
		{
			if(limit>=5)
				return;
			java.util.Date date=new java.util.Date();
			System.out.println(date+" Hello, World!");
			Thread.sleep(1000);
			Thread th=new Thread(new threads(limit+1));
			th.start();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Good Bye");
	}
}
class main
{

	public static void main(String[] args) 
	{
		Thread t=new Thread(new threads(0));
		t.start();
	}
}
