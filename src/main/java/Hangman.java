public class Hangman{

 String[] listOfWords= {"pan","brown","crust","demon","list","cake","pot","millenium" } ;

 Integer stringNumberInArray= 0;

 public boolean HangmanLetterToBeChecked(String character){
   String WordToBeChecked =  listOfWords[stringNumberInArray];
    if(WordToBeChecked.contains(character)){
      return true;
    }else{
      return false;
    }
  }

  public Object IndexOfLetter(String character){
    String WordToBeChecked =  listOfWords[stringNumberInArray];
    Integer indexOfTheWordToBeChecked = WordToBeChecked.indexOf(character);
    return indexOfTheWordToBeChecked;
  }

}
