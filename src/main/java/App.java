import java.io.Console;

public class App {
  public static void main(String[] args){
   Console myConsole = System.console();
   System.out.println("Welcome to Hangman.Press enter to continue...");
   String stringStartTheGame = myConsole.readLine();

   boolean programRunning=true;

    while(programRunning){

      System.out.println("Type start for A new game or exit to exit");
      String stringNewGameOrExit = myConsole.readLine();

      if(stringNewGameOrExit.equals("exit")){
        System.out.println("Thanks for playing!");
        programRunning=false;

      }else if(stringNewGameOrExit.equals("start")){

        Hangman hangman = new Hangman();

        String wordThatPlayerHasGotten = "*+-";
        Integer stringNumberInArray = hangman.stringNumberInArray;
        Integer numberOfGuessesLimit = 3;

        for( int i = 0 ; i <= numberOfGuessesLimit ; i++ ){
          System.out.println(wordThatPlayerHasGotten);
          System.out.println("Enter a letter:");

          String letterTypedIn = myConsole.readLine();
          boolean isTheletterInTheWord = hangman.HangmanLetterToBeChecked(letterTypedIn);

          if(isTheletterInTheWord == true){
           System.out.println("the letter is in the word");

           Integer indexOfLetterPutIn = hangman.IndexOfLetter(letterTypedIn);
           char letterToBeReplaced = wordThatPlayerHasGotten.charAt(indexOfLetterPutIn);
           char letterTypedIn_charForm = letterTypedIn.charAt(0);
           String newWordThatPlayerHasGotten = wordThatPlayerHasGotten.replace(letterToBeReplaced,letterTypedIn_charForm );
           System.out.println(newWordThatPlayerHasGotten);
           wordThatPlayerHasGotten = newWordThatPlayerHasGotten;

           Boolean ifPlayerHasGottenTheWord = hangman.ifWordBeingPlayedIsComplete(newWordThatPlayerHasGotten);

           if(ifPlayerHasGottenTheWord){
             System.out.println("Well done, youve gotten it.ready for your next word?");
             Integer newStringNumberInArray = stringNumberInArray += 1;
             stringNumberInArray = newStringNumberInArray;
             wordThatPlayerHasGotten = "*+-";
             i = 0;

           }else{
            System.out.println("the letter is not in the word");
           }

         }
        }
        System.out.println("Away you weakling. YOU HAVE FAILED!!");
        programRunning=false;

      }else{
        System.out.println("Boiiiiiiiiiiiiiiiiii, we don't recognize your input");
      }

    }
  }
}
