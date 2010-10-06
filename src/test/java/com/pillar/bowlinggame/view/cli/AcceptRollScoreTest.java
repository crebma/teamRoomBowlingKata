package com.pillar.bowlinggame.view.cli;

import static org.junit.Assert.assertEquals;

import java.io.StringReader;

import org.junit.Test;


public class AcceptRollScoreTest {

  @Test
  public void canAcceptInteger() throws Exception {
    int expectedRoll = 8;
    
    ConsoleGui consoleGui = new ConsoleGui();
    consoleGui.setReader(new StringReader(Integer.toString(expectedRoll)));
    
    assertEquals(expectedRoll, consoleGui.readNextRoll());
  }
}
