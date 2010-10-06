package com.pillar.io;

import com.pillar.IGame;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ObjectOutputStream;

import static org.mockito.Mockito.verify;

/**
 * Created by IntelliJ IDEA.
 * User: jeremy
 * Date: Oct 5, 2010
 * Time: 8:31:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameSaverTest {

    @Mock
    private ObjectOutputStream objectOutputStream;
    @Mock
    private IGame gameMock;

    private IGameSaver target;

    @Before
    public void setUp() throws Throwable {
        target = new GameSaver(objectOutputStream);
    }


    @Test
    public void writeObjectIsCaledOnOutputStreamWithGameObject() throws Throwable {

        target.save(gameMock);

        verify(objectOutputStream).writeObject(gameMock);
        
    }

}
