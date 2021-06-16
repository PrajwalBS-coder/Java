class bank1{
	float basic, pf, da, hra, net, gross,it;
	bank1(float basic){
		this.basic = basic;
	}
	void sal(){
		da =(float) ( 0.3 * basic);
		hra = (float)(0.2 * basic);
		pf = (float)(0.5 * basic);
		it = (float)(0.1 * basic);
		gross = basic + da + hra;
		net = gross - pf - it;
		System.out.println("salary is : "+ net);
		
	}
}

class employee extends bank1{
	employee(float basic){
		super(basic);
	}
	void sal(){
		da =(float) ( 0.4 * basic);
		hra = (float)(0.3 * basic);
		pf = (float)(0.4 * basic);
		it = (float)(0.1 * basic);
		gross = basic + da + hra;
		net = gross - pf - it;
		System.out.println("salary is : "+ net);
	}
	
} 
class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee(1500);
		bank1 e1 = new bank1(1500);
		e.sal();
		e1.sal();
	}

}