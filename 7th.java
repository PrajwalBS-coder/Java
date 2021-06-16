class fr{
    
void taste()
{
    
   System.out.println("tastes sweet") ;
}
}
class apple extends fr
{
void name(){
 System.out.println("Apple") ;
}

}
class orange extends fr
{
void name(){
 System.out.println("Orange") ;
}

}
class grapes extends fr
{
void name(){
 System.out.println("Grapes") ;
}

}
class main
{
    public static void main(String args[])
    {
    apple a=new apple();
        a.name();
        a.taste();
        orange o=new orange();
        o.name();
        o.taste();
       grapes g=new grapes();
        g.name();
        g.taste();
        
    }
    
    
    
}