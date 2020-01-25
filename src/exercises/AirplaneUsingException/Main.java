package exercises.airplane;

public class Main
{
	public static void main(String args[])
	{
		Airplane boeing747 = new Airplane();
		int choice = 0;
		while(choice != 6)
		{
			System.out.println("-------------");
			System.out.println("-------------");			
			System.out.println("1 – Start motor\n2 – Take off\n3 – Stop motor\n4 – Increase altitude\n5 – Reduce altitude\n6 – Exit");
			choice = IO.getInt();
			
			try {
				switch(choice)
				{
					case 1:
						boeing747.startMotor();
						break;
					case 2:
						boeing747.takeOff();
						break;
					case 3:
						boeing747.stopMotor();
						break;
					case 4:
						boeing747.increaseAltitude();
						break;
					case 5:
						boeing747.reduceAltitude();
						break;	
					case 6:
						boeing747.exit();
						break;		
				}
				
			} catch (AirplaneException e) {
				// TODO: handle exception
				System.out.println("AirplaneException caught in main(): " + e.getMessage());
			}
			System.out.println("Main continuing as normal after try catch");
			
		}
	}
}