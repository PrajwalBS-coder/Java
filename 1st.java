import java.util.Scanner;
 class main {
	public static void main(String[] arg)
	{
	int number;
     Scanner sc = new Scanner(System.in);

		
                  System.out.println("Enter any valid Integer: ");

			
			try {

				
				number = Integer.parseInt(sc.next());

				
				System.out.println("You entered: "
								+ number);

				
				            
			}

			
			catch (NumberFormatException e) {

				
				System.out.println(
					"NumberFormatException occured");
			}
		
	}
}
