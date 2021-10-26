package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class WordChoserTest {
  @Test public void testGetRandomWordFromDictionary(){
    WordChoser choser = new WordChoser();

    assertTrue(choser.getRandomWordFromDictionary() instanceof String);
    
    ;
  } 
}
