package com.pillar;

import com.pillar.bowlinggame.view.cli.ConsoleGui;
import com.pillar.io.IGameSaver;

/**
 * Created by IntelliJ IDEA.
 * User: jeremy
 * Date: Oct 5, 2010
 * Time: 7:59:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game implements IGame {
    private IGameSaver gameSaver;
    private ConsoleGui consoleGui;
    private int numberOfPlayers;

    public Game(IGameSaver gameSaver, ConsoleGui consoleGui) {
        this.gameSaver = gameSaver;
        this.consoleGui = consoleGui;
    }

    public void saveGame() {
        gameSaver.save(this);
    }

    public void startNewGame() throws Exception {
      numberOfPlayers = consoleGui.readNextRoll();
    }

    public int getNumberOfPlayers() {
      return numberOfPlayers;
    }
}
