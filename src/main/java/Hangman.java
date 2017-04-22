public class Hangman{

 String[] listOfWords= {"pan","can","bin","cob","sly","try","fry","bry" } ;

 Integer stringNumberInArray= 0;

 public boolean HangmanLetterToBeChecked(String character){
   String WordToBeChecked =  listOfWords[stringNumberInArray];
    if(WordToBeChecked.contains(character)){
      return true;
    }else{
      return false;
    }
  }

  public Integer IndexOfLetter(String character){
    String WordToBeChecked =  listOfWords[stringNumberInArray];
    Integer indexOfTheWordToBeChecked = WordToBeChecked.indexOf(character);
    return indexOfTheWordToBeChecked;
  }

  public boolean checkIfTheLetterMatches(String word){
    String WordToBeChecked =  listOfWords[stringNumberInArray];
    Boolean doTheWordsMatch = word.equals(WordToBeChecked);
    return doTheWordsMatch;
  }

  public boolean ifWordBeingPlayedIsComplete(String word){
    String wordBeingPlayed = listOfWords[stringNumberInArray];
    if(wordBeingPlayed.equals(word)){
      return true;
    }else{
      return false;
    }
  }

}
