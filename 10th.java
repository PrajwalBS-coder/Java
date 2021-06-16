class shapes
{
double area;
    void area(float a,float b)
    {
        area=a*b;
        System.out.println("Area Of rectangle:"+area);
    }
     void area(float a)
    {
        area=3.14*a*a;
        System.out.println("Area Of circle:"+area);
    }
     void area(int a)
    {
        area=a*a;
        System.out.println("Area Of square:"+area);
    }
    void area(float a,float b,float c)
    {
        area=(a+b)/2+c;
        System.out.println("Area Of trapezium:"+area);
    }
    
}
class main{
    public static void main(String args[])
    {
        shapes s=new shapes();
        s.area(10);
        s.area(5f);
        s.area(5.4f,5.4f);
        s.area(2.5f,2.3f,2.5f);
    }
}