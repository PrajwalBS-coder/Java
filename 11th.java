class student{
    int rno;
    String na;
    student (int r,String na)
    {
        this.rno=r;
        this.na=na;
    }
    
    void show(){
        
        System.out.println("Student Roll No:"+rno );
        System.out.println("Student Name:"+na );
    }
    
}
class  course extends student
{
 String course;
 course(int rn,String na,String cr)
 {
 super(rn,na);
 this.course=cr;
 }
 void showcr(){
 show();
 System.out.println("Course:"+course);
 }    
}
class mar extends student{
int m1,m2,m3,m4,sum;
mar(int rn,String na,int m1,int m2,int m3,int m4)
{
super(rn,na);
this.m1=m1;
this.m2=m2;
this .m3=m3;
this.m4=m4;
}

void showmr(){

show();
sum=m1+m2+m3+m4;
System.out.println("Total Marks  "+sum);
}
}
class per extends mar {

float pr;
per(int rn,String na,int m1,int m2,int m3,int m4,float p)
{
super(rn,na,m1,m2,m3,m4);
pr=p;
}
void showper(){

showmr();
pr=sum/4;
System.out.println("Percentage:"+pr);
}

}
class main
{
public static void main(String args[])
{
per p=new per(101,"Jhon",77,88,99,56,0);
    p.showper();
    course c=new course(102,"Jarvis","MCA");
c.showcr();


}
    
    
    
    
}