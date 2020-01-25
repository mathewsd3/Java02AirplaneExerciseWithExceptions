package exercises.airplane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO
{
    public static int getInt(int min, int max)
    {
        if (min > max)
        {
            int temp = min;
            min = max;
            max = temp;
        }
        int integer = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            try
            {
                integer = Integer.parseInt(in.readLine());
                if (integer >= min && integer <= max)
                    break;  // success, validation loop exit condition
                else
                    System.out.println("Value out of bounds. Range: [" + min + ", " + max + "]");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid integer format.");
            }
            catch (IOException e)
            {
                System.err.println("IOException: Error while reading line from System.in buffered reader. " + e.getMessage());
            }
        }
        while (true);
        
        return integer;
    }
    
    public static int getInt()
    {
        return getInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}