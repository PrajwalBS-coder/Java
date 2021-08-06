import java.util.*;
class s1{
   public void split(String str)
    {String s=str;
        String[] arrOfStr = s.split("/"); 
         System.out.println("Number of substrings: "+arrOfStr.length);
      try{

          if(arrOfStr.length<2)
         {
             throw new MyException();
    
         }
         else
         {
              for(int i=0; i< arrOfStr.length; i++)
         {
             System.out.println("str["+i+"] : "+arrOfStr[i]);
                                               }
         }
         
        
        } catch(MyException e)
        {
           System.out.println("NOT FOUND!!!!"); 
           
        }

    }
     public static void main(String args[]) 
      {
       Scanner s=new Scanner(System.in);
        System.out.println("Eneter String");
        String ss=s.nextLine();
        s1 p = new s1();
        p.split(ss);


      }
}