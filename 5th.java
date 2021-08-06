import java.util.*;
class main
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
String rn;
int m1,m2,m3,tot;
try{
    System.out.println("Enter Roll No");
    rn=s.nextLine().toUpperCase();
   String p=rn.substring(0, 3);
   System.out.println(p);
   String q="4NM"; 
    if(p.equals(q))
       {
                      
                       System.out.println("Enter  3 marks" );
         m1=s.nextInt();
          System.out.println(m1 );
         m2=s.nextInt();System.out.println(m2);
         m3=s.nextInt();System.out.println(m3);
         


         if((m1<=0 || m1>=100)||(m2<=0 || m2>=101) || (m3<=0|| m3>=100))
         {throw new inavlidmark();}

         else
         {tot=m1+m2+m3;
          System.out.println("Toatal Mraks"+tot);}
         

       }
    
    else{
          throw new invalidusn();


    }

}catch(invalidusn e)
 {
     System.out.println("Inavlid USN");
 }
catch(inavlidmark e)
 {
     System.out.println("Inavlid Marks");}

}
}
