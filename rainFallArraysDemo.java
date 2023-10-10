package rainFinalPrictice;

public class rainFallArraysDemo {

	public static void main(String[] args) {
		
		//variables
		
		double[] thisYear = {100.2, 300.4, 100.2, 200.2,
							 4.5, 6.5, 600.5, 300.4,
							 100.2, 300.4, 500.6, 700.6};
		
		int mostRain; // month with the highest rain
		
		int leastRain; // month with the least of rain
		
		RainDriver r = new RainDriver(thisYear); // Creating an object of type RainDriver sending 
		
		System.out.println( r.getHighestMonthIndex());
		
		System.out.println( r.getLowestMonthIndex());
		
		System.out.println( r.getRainAt(5));
		
	
		
	}
			
			
}
