package rainFinalPrictice;

public class RainDriver 

{
	
	//1. 
	
	double[] rain;
	
	
	public RainDriver(double thisYear[]) // Constructor with an array parameter
	
	{
		
		//Create a new array named rain the size of the one given by the demo
		rain = new double[thisYear.length];
		
		//copy each element of the array thisYear into my new array named rain
		
		for(int i =0; i < thisYear.length; i++) 
		
		
		{
			
			rain[i] = thisYear[i];
		}
	}
public double getTotalRainFall()

{
	
	double totalRainFall = 0.0;
	
	for(int i = 0; i < rain.length; i++)
	
	{
		
		totalRainFall = totalRainFall + rain[i];
	}
	
	return totalRainFall;
	
}
	public double getAverage()
	
	{
		
		return getTotalRainFall()/ rain.length;
		
		
}
	public int getHighestMonthIndex()
		
	{
		int highest = 0;
		
		for (int i = 1; i < rain.length; i++)
			
		{
			
			if(rain[i] > rain[highest])
				
			{
				
				highest = i; // storing the highest index found
				
			}
			
		}
			
		return highest;
}
	public int getLowestMonthIndex()
	
	{
		int lowest = 0;
		
		for (int i = 1; i < rain.length; i++)
			
		{
			
			if(rain[i] < rain[lowest])
				
			{
				
				lowest = i; // storing the highest index found
				
			}
			
		}
			
		return lowest;
	}
		
	public double getRainAt(int e)
	
	{
		
		
		
		return rain[e]; // return the value return in the index
	}
	
	
}
