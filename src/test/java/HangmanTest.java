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
  public void hangman_IndexOfLetterInResidualString_p(){
    Hangman hangman = new Hangman();
    assertEquals(0,hangman.IndexOfLetter("p"));
  }

  @Test
  public void hangman_checkIfTheLetterPutInMatchesItsCorrespondingstring_true(){
    Hangman hangman = new Hangman();
    assertEquals(true,hangman.checkIfTheLetterMatches("pan"));
  }

}
