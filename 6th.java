import java.util.*;
class di
{
    private int feet;
    private int inch;
    public void getdi(){
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the feet");
        feet=s.nextInt();
        System.out.println("Enter the inch");
        inch=s.nextInt();
        
    }
    void display()
    {
        
        System.out.println(feet+"Feet"+inch+"Inches");
        
    }
    di addd(di d1,di d2)
    {
        
        di d=new di();
        d.feet=d1.feet+d2.feet;
        d.inch=d1.inch+d2.inch;
        if(d.inch>=12)
        {
            
            d.feet++;
            d.inch-=12;
        }
        
        
        return d;
    }   
    
}
class main{
    public static void main(String[] args)
    {
    di d1=new di();    
      di d2=new di();    
        di d3=new di();    
        System.out.println("Enter 1st distance");
        d1.getdi();
        System.out.println("Enter 2nd distance");
        d2.getdi();
        d3=d3.addd(d1,d2);
        d3.display();
    }
    
    
    
}