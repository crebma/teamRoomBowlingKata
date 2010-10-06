package com.pillar;

import java.util.ArrayList;
import java.util.List;

public class Frame {

	private List<Integer> rolls = new ArrayList<Integer>();

	public void addRoll(int rollScore) throws TooManyRollsException, TooManyPinsException {
		if (this.rolls.size() < 2 && getScore() < 10) {
			this.rolls.add(rollScore);
			int score = getScore();
			if (score > 10) {
				this.rolls.remove(this.rolls.size() - 1);
				throw new TooManyPinsException();
			}
		} else {
			throw new TooManyRollsException();
		}
	}

	public int getScore() {
		int score = 0;
		for (Integer rollScore : this.rolls) {
			score += rollScore;
		}
		return score;
	}

}