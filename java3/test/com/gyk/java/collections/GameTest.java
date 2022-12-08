package com.gyk.java.collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {
    Game game;

    @BeforeEach
    public void createGame() {
        this.game = new Game("Game name", GameGenre.STRATEGY, 12.34, 40000);
    }

    @Test
    public void test_isGameCreated() {
        Assertions.assertNotNull(this.game);
    }
    @Test
    public void test_isFieldsBeenSet() {
        Assertions.assertNotNull(this.game.getTitle());
        Assertions.assertNotNull(this.game.getGenre());
        Assertions.assertNotNull(this.game.getPrice());
        Assertions.assertNotNull(this.game.getCopiesSold());
    }

    @Test
    public void test_isSettersWorking() {
        this.game = new Game(null, null, null, null);

        Assertions.assertNull(this.game.getTitle());
        Assertions.assertNull(this.game.getGenre());
        Assertions.assertNull(this.game.getPrice());
        Assertions.assertNull(this.game.getCopiesSold());

        this.game.setTitle("Game title");
        this.game.setGenre(GameGenre.MMORPG);
        this.game.setPrice(12.34);
        this.game.setCopiesSold(4000);

        Assertions.assertNotNull(this.game.getTitle());
        Assertions.assertNotNull(this.game.getGenre());
        Assertions.assertNotNull(this.game.getPrice());
        Assertions.assertNotNull(this.game.getCopiesSold());
    }

    @Test
    public void test_isMockVeryHard() {
        Game gameMock = Mockito.mock(Game.class);

//        when(gameMock.parentMethod())
        gameMock.parentMethod();
//        gameMock.childMethod();
        verify(gameMock, times(1)).childMethod();
    }

    @AfterEach
    public void removeGame() {
        this.game = null;
    }



    /*
    public class InformationTest {

       Publishing publishing = mock(Publishing.class);

       @Autowired
       private Information information;

       @Test
       void whenSendInformationForPublishingIsSuccessful() {
           information = new Information(publishing);
           Person person = ObjectCreator.getPerson();
           doNothing().when(publishing).publishInformation(person);
           information.sendInfoForPublishing(person);
           verify(publishing,times(1)).publishInformation(person);
       }
    }
     */

}
