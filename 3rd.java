import java.util.*;


class main
{
	public static void main(String args[])
	{  Scanner s=new Scanner(System.in);
        System.out.println("1.User Defined 2.Pre Defined");
         System.out.println("Eneter one");
         int ch=s.nextInt();
		try
		{if(ch==1)
            {
                throw new MyException();
            } else{
                int n=10;
            int k=n/0;
            }
			
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
        catch (MyException e)
		{
			System.out.println("It's bad ");
		}
	}
}
