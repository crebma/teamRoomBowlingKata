package com.pillar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	Frame frame;

	@Before
	public void setUp() {
		frame = new Frame();
	}

	@Test
	public void frame_shouldSumTwoSimpleRolls() throws Exception {
		int roll1 = 1;
		int roll2 = 1;
		frame.addRoll(roll1);
		frame.addRoll(roll2);

		assertEquals(roll1 + roll2, frame.getScore());
	}

	@Test
	public void frame_shouldSumTwoOtherSimpleRolls() throws Exception {
		int roll1 = 4;
		int roll2 = 1;
		frame.addRoll(roll1);
		frame.addRoll(roll2);

		assertEquals(roll1 + roll2, frame.getScore());
	}

	@Test
	public void mostFrames_shouldOnlyAcceptTwoRolls() throws Exception {

		try {
			frame.addRoll(1);
			frame.addRoll(0);

			frame.addRoll(9);
			fail("You should only be able to roll twice per frame (for most frames!)");
		} catch (TooManyRollsException tmre) {

		}
	}

	@Test
	public void frame_shouldRejectRollsThatSumMoreThanTen() throws Exception {
		try {
			frame.addRoll(7);
			frame.addRoll(7);
			fail("You can only knock down 10 pins per frame.. usually.");
		} catch (TooManyPinsException tmpe) {
		}
	}

	@Test
	public void frame_shouldRejectSecondRollIfFirstRollIsStrike() throws Exception {
		try {
			frame.addRoll(10);
			frame.addRoll(0);
			fail("You're only supposed to get one roll in a frame when you get a strike.");
		} catch (TooManyRollsException tmre) {

		}
	}
}
