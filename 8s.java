class Bicycle{
	public 
		int gear;
		int speed;
	Bicycle(int gear, int speed){
		this.gear=gear;
		this.speed=speed;
	}
	void applyBreak(int speed){
		this.speed -= speed;
		this.gear--;
	}
	void speedUp(int speed){
		this.speed += speed;
		this.gear++;
	}
	void display(){
		System.out.println("Speed is : "+speed);
		System.out.println("Gear  is : "+gear);		
	}
}
 class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b = new Bicycle(3,45);
		b.display();
        System.out.println("Apply Break");
        b.applyBreak(5);
		b.display();
          System.out.println("Speed up");
		b.speedUp(10);
		b.display();

		
	}

}