package com.pillar;

import com.pillar.io.IGameSaver;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by IntelliJ IDEA.
 * User: jeremy
 * Date: Oct 5, 2010
 * Time: 7:59:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameTest {

    private IGameSaver gameSaver;

    private IGame target;


    @Before
    public void setUp() throws Throwable {
        gameSaver = mock(IGameSaver.class);

        target = new Game(gameSaver);
    }

    @Test
    public void shouldCreateAFileWithCorrectName() throws Throwable {

        target.saveGame();

        verify(gameSaver).save(target);
    }

}
