import java.util.*;
class main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]= new int[5];
        String s1=null;
        String s2="nnn";
        int n=10;
        System.out.println("1.Array 2.Arithimatic 3.Null Pointer");
         System.out.println("Eneter one");
         int ch=s.nextInt();
         try
         {
              if(ch==1){
                  a[5]=10;
              } else if(ch==2){
                  int tot=n/0;
              }else
              {
                  if(s1.equals(s2))
                  System.out.println("Equal");
                  else System.out.println("Not Eqal");
              }
         }
         catch(ArithmeticException e)
         {
             System.out.println(e);
         }
         catch(NullPointerException e)
         {
              System.out.println(e);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
              System.out.println(e);
         }

    }
}