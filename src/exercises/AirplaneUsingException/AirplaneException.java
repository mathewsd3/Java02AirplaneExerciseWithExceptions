package exercises.airplane;

public class AirplaneException extends Exception //checked
{
	//make our own exceptions
	public AirplaneException(String message)
	{
		super(message);
		System.out.println("Range is 40 L to 225L");
	}

}
