package com.pillar.bowlinggame.view.cli;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.Test;

import com.pillar.Game;

public class MultipleUsersTest {
  @Test
  public void shouldAskForNumberOfUsers() throws Exception {
    ConsoleGui consoleGui = new ConsoleGui();
    consoleGui.setReader(new StringReader("4"));

    Game game = new Game(null, consoleGui);

    game.startNewGame();

    assertEquals(4, game.getNumberOfPlayers());
  }
}
