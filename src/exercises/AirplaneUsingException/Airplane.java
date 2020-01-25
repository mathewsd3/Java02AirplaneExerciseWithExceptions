package exercises.airplane;

public class Airplane {
	
	private boolean isRunning=false;
	private boolean isLanded=true;
	
	private int altitude=0;
	
	void startMotor() 
	{
		if(!isRunning)
		{
			System.out.println("Starting Motor");
			System.out.println("Altitude is : " + altitude);									
			isRunning=true;
		}
		else 
		{
			System.out.println("Motor is already running");
		}
	}
	
	public void checkRunning() throws AirplaneException
	{
		if(!isRunning)
			throw new AirplaneException("Airplane not running");
	}
	/*
	public void checkRunning() 
	{
		try {
		if(!isRunning)
			throw new AirplaneException("Airplane not running");
		}
		catch(AirplaneException e) {
			
		}
			
	}*/
	void takeOff() throws AirplaneException
	{
//		try {
//			checkRunning();
//		}
//		catch(AirplaneException e)
//		{
//			System.out.println("Exception caught ... Using try catch");
//		}
//		
		checkRunning();
		
		
		if(altitude==0)
		{
			System.out.println("Taking Off");	
			/*
			System.out.println("Altitude is : " + altitude);	
			System.out.println("Increasing Altitude by 2000 feet.");	
			altitude = altitude + 2000;
			System.out.println("Altitude is : " + altitude);	
			*/
			int alt = 0;
			isLanded = true;
			System.out.println("By how much feet would you like to increase altitude?");
			alt = IO.getInt(0,5000);
			
			System.out.println("Altitude is : " + altitude);	
			System.out.println("Increasing Altitude by " + alt + " feet");	
			altitude = altitude + alt;
			System.out.println("Altitude is : " + altitude);
		}
		else if(!isRunning)
		{
			System.out.println("Can't take off. Motor is Off.");						
		}
		else 
		{
			System.out.println("Plane is already in the air");	
		}
	}
	void stopMotor() throws AirplaneException
	{
		
		checkRunning();
		if(!isRunning)
		{
			System.out.println("Motor is already Off.");						
		}
		else 
		{
			if(altitude==0)
			{
				System.out.println("Stopping Motor");	
				//System.out.println("Altitude is : " + altitude);							
				isRunning = false;
			}
			else 
			{
				System.out.println("The plane has not landed. Can't stop Motor");
			}
		}
	}
	void increaseAltitude() throws AirplaneException
	{
		checkRunning();
		
		if(isRunning&&altitude!=0)
		{
			int alt = 0;
			System.out.println("By how much feet would you like to increase altitude?");
			alt = IO.getInt(0,5000);
			
			System.out.println("Altitude is : " + altitude);	
			System.out.println("Increasing Altitude by " + alt + " feet");	
			altitude = altitude + alt;
			System.out.println("Altitude is : " + altitude);
			/*
			System.out.println("Increasing Altitude by 2000 feet.");	
			altitude = altitude + 2000;
			System.out.println("Altitude is : " + altitude);
			*/	
			if(altitude>=12000)
			{
				System.out.println("Boom!");
				//System.out.println("Exiting Program!");
				exit();
			}
			else if(altitude>=10000)
			{
				System.out.println("Danger!");
			}
		}
		else if(!isRunning)
		{
			System.out.println("Can't increase altitude. Motor is Off.");						
		}	
		else 
		{
			System.out.println("Can't increase altitude. Airplane has not taken off.");
		}
	}
	void reduceAltitude() throws AirplaneException
	{
		checkRunning();
		
		if(isRunning)
		{
			if(altitude!=0)
			{
				int alt = 0;
				System.out.println("By how much feet would you like to decrease altitude?");
				alt = IO.getInt();
				
				System.out.println("Altitude is : " + altitude);	
				System.out.println("Decreasing Altitude by " + alt + " feet");	
				altitude = altitude - alt;
				System.out.println("Altitude is : " + altitude);	
				if(altitude==0)
				{
					System.out.println("Airplane has landed. ");
					//stopMotor();
					//exit();
				}
			}
			else 
			{
				System.out.println("Can't reduce altitude. Airplane is on the ground. ");
			}
		}
		else 
		{
			System.out.println("Can't reduce altitude. Motor is off. ");
		}				
	}
	void exit()
	{
		System.out.println("Exiting Program. ");	
		System.exit(0);
	}
}
