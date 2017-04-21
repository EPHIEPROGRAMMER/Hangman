import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();
   System.out.println("Welcome to Hangman.Press enter to continue...");
   String stringStartTheGame = myConsole.readLine();

   boolean programRunning=true;

    while(programRunning){
    System.out.println("Type Start for A new game or Exit to exit");
    String stringNewGameOrExit = myConsole.readLine();

      if(stringNewGameOrExit.equals("Exit")){
        programRunning=false;

      }else if(stringNewGameOrExit.equals("Start")){

        Hangman hangman = new Hangman();

        Integer numberOfGuessesLimit = 3;
        for( int i = 0 ; i <= numberOfGuessesLimit ; i++ ){
          System.out.println("Enter a letter:");
          String wordThatPlayerHasGotten = "*+-";

          String letterTypedIn = myConsole.readLine();
          boolean isTheletterInTheWord = hangman.HangmanLetterToBeChecked(letterTypedIn);
          if(isTheletterInTheWord == true){
          System.out.println("the letter is in the word");

           Integer indexOfLetterPutIn = hangman.IndexOfLetter(letterTypedIn);
           char letterToBeReplaced = wordThatPlayerHasGotten.charAt(indexOfLetterPutIn);
           char letterTypedIn_charForm = letterTypedIn.charAt(0);
           String newWordThatPlayerHasGotten = wordThatPlayerHasGotten.replace(letterToBeReplaced,letterTypedIn_charForm );
           System.out.println(newWordThatPlayerHasGotten);
           newWordThatPlayerHasGotten = wordThatPlayerHasGotten;

          }else{
            System.out.println("the letter is not in the word");
          }
        }

      }else{
        System.out.println("Boiiiiiiiiiiiiiiiiii, we don't recognize your input");
      }

    }
  }
}
