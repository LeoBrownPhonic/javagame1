package game;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;




import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChoser mockedChoser = mock(WordChoser.class);

    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChoser);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testGetRemainingAttempts() {
    Game game = new Game();
    assertEquals(game.getRemainingAttempts(), 10);
  }


}