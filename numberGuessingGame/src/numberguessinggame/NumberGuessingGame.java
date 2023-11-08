package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author something
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        int number=random.nextInt(1000);
        Scanner input= new Scanner(System.in);
        int guess;
        boolean win= false;
        int numOfTries=0;       
        
        
        while (win==false){
        System.out.println("Guess number between 1 and 1000");
        guess= input.nextInt();
        numOfTries ++;
        
        if (guess==number){
          win=true;  
        }
        else if(guess<number){
            System.out.println("You need biger number!");
            
        }
        else if (guess>number){
            System.out.println("You need smaller number!");
        }
        
       
        }
        
        System.out.println("You win!!!");
        System.out.println("The number that you guess is: " + number);
        System.out.println("You guess it after "+ numOfTries + " tries!!!");
        
        
    }
    
}
