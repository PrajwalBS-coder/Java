class lamp
{
    int on;
    lamp(int on)
    {
        this.on=on;
        
    }
    void onn()
    {
        System.out.println("true");
    }
    void off()
    {
        System.out.println("false");
    }
    
    



    public static void main(String[] args)
    {
        
        
        lamp led=new lamp(0);
         
        lamp halo=new lamp(1);
        if(led.on==1)
            led.onn();
        else
            led.off();
    
        if(halo.on==1)
            halo.onn();
        else
            halo.off();
        
        
        
        
        
        
        
    }
    
    
}