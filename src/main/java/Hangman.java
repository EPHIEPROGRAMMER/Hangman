public class Hangman{

 String listOfWords= "pancakes" ;

 public boolean HangmanLetterToBeChecked(String character){
   String WordToBeChecked =  listOfWords;
    if(WordToBeChecked.contains(character)){
      return true;
    }else{
      return false;
    }
  }

}
