package game;



public class Game {
  

  byte gamecounter = 10;

  String word = "";

  // Game(WordChoser choser = new WordChoser);

    Game(){
      WordChoser choser = new WordChoser();
      this.word = choser.getRandomWordFromDictionary();
    }

    Game(WordChoser choser){
      this.word = choser.getRandomWordFromDictionary();
    }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < this.word.length(); i++) {
        Character currentLetter = word.charAt(i);
        if (i == 0) {
            builder.append(currentLetter);
        } else {
            builder.append("_");
        }
    }
    return builder.toString();
  }


  public byte getRemainingAttempts() {
    return gamecounter;
  
  }


}
