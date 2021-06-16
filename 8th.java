class Bicycle
{public 
   int gear;
     int speed;
    Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    void appbreak(int speed)
    {
        this.speed -=speed;
        this.gear--;
    }
    void speedup(int speed){
        this.speed +=speed;
        this.gear++;
    }
    void display(){
        System.out.println("Speed is: "+speed);
        System.out.println("Gear is: "+gear);
        
    }                          
}

   class main{
      public static void main(String args[])
      {
          Bicycle b = new Bicycle(3,45);
          b.display();
          System.out.println("Apply Break");
          b.appbreak(5);
          b.display();
          System.out.println("Speed up");
          b.speedup(10);
          b.display();
          
      }
  }                         