package com.pillar.io;

import com.pillar.IGame;

import java.io.ObjectOutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: jeremy
 * Date: Oct 5, 2010
 * Time: 8:31:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameSaver implements IGameSaver {
    private ObjectOutputStream objectOutputStream;

    public GameSaver(ObjectOutputStream objectOutputStream) {
        this.objectOutputStream = objectOutputStream;
    }


    public void save(IGame theGame) {
        
    }
}
