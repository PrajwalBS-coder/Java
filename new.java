class student{
int m1,m2,m3,m4,m5;
student(int m1,int m2,int m3,int m4,int m5)
{ this.m1=m1;
    this.m2=m2;
    this.m3=m3;
    this.m4=m4;
    this.m5=m5;
}
void calculate(){
    int sum=m1+m2+m3+m4+m5;
    System.out.println(sum);

}




}
class main{

    public static void main(String args[])
{
student s1=new student(44,55,66,77,88);
s1.calculate();

}        
    
}