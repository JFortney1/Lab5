
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jfortney
 */
public class TestScores {
    
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double testScore1;
        double testScore2;
        double testScore3;
        float avg;

        System.out.println("Please enter 3 test scores");
        try 
        {
            testScore1 = keyboard.nextDouble();   
            testScore2 = keyboard.nextDouble(); 
            testScore3 = keyboard.nextDouble(); 
            avg = (float) (testScore1 + testScore2+ testScore3 / 3);
            System.out.println("Your average test score is " + avg);
        }
      
         catch (InputMismatchException ex) 
                {
            System.out.println("That was not a valid test score, please enter a number between 0 and 100");
        }
        
        catch (Exception ex)
        {
            System.out.println("An unkown error occured");
            System.out.println(ex.getMessage());
        }
       
        finally {
            System.out.println();
        }

    }
}

