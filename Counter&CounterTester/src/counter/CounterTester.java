package counter;

public class CounterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter venue = new Counter();
		int rValue=venue.getValue();
		
		for (int c = 1; c < 10; c++)
			venue.click();
		
		rValue = venue.getValue();

		for (int c = 1; c < 5; c++)
			venue.unclick();
		
		rValue = venue.getValue();
		System.out.println("Expected: 5");
		System.out.println("Actual: " + rValue);
		
		venue.reset();
		rValue = 0;
		
		for (int c = 1; c < 3; c++)
			venue.click();
		
		rValue = venue.getValue();
		
		for (int c = 1; c < 4; c++)
			venue.unclick();
		
		rValue = venue.getValue();
		System.out.println("Expected: -1");
		System.out.println("Actual: " + rValue);
		
	}
	{
}

	}


