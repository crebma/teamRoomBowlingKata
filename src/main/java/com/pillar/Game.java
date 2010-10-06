package com.pillar;

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

    public Game(IGameSaver gameSaver) {

        this.gameSaver = gameSaver;
    }

    public void saveGame() {
        gameSaver.save(this);
    }
}
