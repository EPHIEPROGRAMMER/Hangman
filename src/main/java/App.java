import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();
   System.out.println("Welcome to Hangman.Type Continue to continue...");
   String stringStartTheGame = myConsole.readLine();

   boolean programRunning=true;

    while(programRunning){
    System.out.println("Type Start for A new game or Exit to exit");
    String stringNewGameOrExit = myConsole.readLine();

      if(stringNewGameOrExit.equals("Exit")){
        programRunning=false;

      }else if(stringNewGameOrExit.equals("Start")){
        System.out.println("Enter a letter:");
        System.out.println("_ _ _");
        String letterTypedIn = myConsole.readLine();
        Hangman hangman = new Hangman();
        boolean isTheletterInTheWord = hangman.HangmanLetterToBeChecked(letterTypedIn);
        System.out.println("that is "+ isTheletterInTheWord);

      }else{
        System.out.println("Boiiiiiiiiiiiiiiiiii, we don't recognize your input");
      }

    }
  }
}
