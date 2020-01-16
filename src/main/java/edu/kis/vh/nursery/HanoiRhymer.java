package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

//Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
//5, 12, 14, 15.

//Skróty alt + -> oraz alt + <- służą do przemieszczania się po ostatnio zmodyfikowanych liniach kodu projektu