
 
 class main { 
    public static void main(String args[]) 
    { 
        String str = "We're!"; 
        String[] arrOfStr = str.split("/"); 
         System.out.println("Number of substrings: "+arrOfStr.length);
      try{

          if(arrOfStr.length>1)
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
           System.out.println(e); 
           
        }
    } 
}
