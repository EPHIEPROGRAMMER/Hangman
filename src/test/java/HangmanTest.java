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

  @Test
  public void hangman_IndexOfLetterInResidualString_1(){
    Hangman hangman = new Hangman();
    Integer outPutNumber = 1;
    assertEquals(outPutNumber,hangman.IndexOfLetter("a"));
  }

  @Test
  public void hangman_checkIfTheLetterPutInMatchesItsCorrespondingstring_true(){
    Hangman hangman = new Hangman();
    assertEquals(true,hangman.checkIfTheLetterMatches("pan"));
  }

  @Test
  public void hangman_ifWordBeingPlayedIsComplete_true(){
    Hangman hangman = new Hangman();
    assertEquals(true,hangman.ifWordBeingPlayedIsComplete("pan"));
  }

}
