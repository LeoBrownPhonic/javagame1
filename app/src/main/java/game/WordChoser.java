package game;
import java.util.Random;

public class WordChoser {
  static final String[] DICTIONARY = {"LONDON", "CANDIES", "DEVELOPERS", "MAKERS"};

  public String getRandomWordFromDictionary(){
    Random rand = new Random();
    // System.out.println(DICTIONARY[rand.nextInt(DICTIONARY.length)]);
    return DICTIONARY[rand.nextInt(DICTIONARY.length)];
  }
  
}
