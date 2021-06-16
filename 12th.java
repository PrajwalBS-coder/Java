
class thi
{
	int a;
	int b;

	
	thi()
	{
		a = 10;
		b = 20;
	}
	
	
	thi get()
	{
		return this;
	}
	
		void display()
	{
		System.out.println("a = " + a + " b = " + b);
	}
}
class main{
	public static void main(String[] args)
	{
		thi object = new thi();
		object.get();
        object.display();
	}
}
