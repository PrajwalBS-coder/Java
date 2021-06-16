class dog
{
String na,br,cl;
    int ag;
    

dog(String na,String br,String cl,int ag)
{
   this.na=na;
    this.br=br;
    this.ag=ag;
    this.cl=cl;   
}
 String na()
 {
     
     return(this.na);
 }
    String br()
    {
        
        return (this.br);
    }
    
    String cl()
    {
        
        return (this.cl);
    }
    
    int ag()
    {
        
        return(this.ag);
    }

}
class main{
      public static void main(String args[])
      {
          dog d=new dog("Jimmy","Jerman Seaford","White",5);
          String na,br,cl;
          int ag;
          na=d.na();
          br=d.br();
          cl=d.cl();
          ag=d.ag();
          System.out.println(na+" "+br+" "+cl+" "+ag);
         
    }
    
    
    
    
}