
public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() {
		low = getCurrentGuess() + 1;
		try {
			if (low == getCurrentGuess() + 1) {
				throw new IllegalStateException("You're cheating!");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void lower() {
		high = getCurrentGuess() - 1;
		try {
			if (high == getCurrentGuess() - 1) {
				throw new IllegalStateException("You're cheating!");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}