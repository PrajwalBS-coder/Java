import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1.Not Occured 2.Occured Not Handled 3.Occured Handled");
         System.out.println("Eneter one");
         int ch=s.nextInt();
         
        
             if(ch==1)
                {
                try{int data=25/5;  
                System.out.println(data);
                  }
                 
            
                finally
             {
                System.out.println("Final Executed First"); 
              }
            }
            else if(ch==2)
            {
             try
                {
                    int data=25/0;  
                System.out.println(data);
                }

                 finally
                {
                System.out.println("Final Executed Second"); 
                }
            }
            else if(ch==3)
            { try
                {

                  int data=25/0;  
                 System.out.println(data);

                 }
                 
                catch(ArithmeticException e)
                 {
                       System.out.println(e);
                 }
                 finally
                {
                System.out.println("Final Executed Last"); 
                }
               
            }




         
    }
}