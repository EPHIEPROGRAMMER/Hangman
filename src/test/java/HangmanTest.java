import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest{

  @Test
  public void hangman_isLetterContainedinWord_true(){
    Hangman hangman = new Hangman();
    assertEquals(true,hangman.HangmanLetterToBeChecked("a"));
  }

  @Test
  public void hangman_isLetterContainedinWord_false(){
    Hangman hangman = new Hangman();
    assertEquals(false,hangman.HangmanLetterToBeChecked("z"));
  }

}
