package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int DEFAULT = -1;
	private static final int SIZE = 12;
	private int[] numbers = new int[SIZE];

	private int total = DEFAULT;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		return numbers[total--];
	}

}
