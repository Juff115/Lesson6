
public class GuessMachine {
    int number, numGuesses, guess;
    public GuessMachine(){
        numGuesses=0;
        guess=0;
        number=(int)(Math.random()*100)+1;
    }
    
    public int getNumGuesses(){
        return numGuesses;
    }
    
    public String giveHint(){
        if(guess>number){
            return "Too high guess lower";
        }
        else if (guess<number){
            return "Too low guess higher";
        }
        else return "You got it, good job";
    }
    
    public boolean setGuess(int g){
        boolean isValid=(g>=1 && g<=100);
        if(isValid){
            guess=g;
            numGuesses++;
            return true;
        }
        else return false;
    }
    
    
    
}
