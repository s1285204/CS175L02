package counter2;

public class Counter2 {

	private int value;

	public int getValue() {
		return value;
		
	}
	
	public void click() {
		value = value + 1;
	}
	
	public void unclick() {
		value = value - 1;
	}
	
	public void reset() {
		value = 0;
	}
	
	public void clickMany(int number) {
		value = value + number;
	}
	
	public void unclickMany(int number) {
		value = value - number;
	}
	



	}


