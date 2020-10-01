import java.util.Scanner;
/**
 *The example program for Nested Statements
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user if animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    //check to see feather Statements
    if(featherAnswer.equals("yes")){
     //get feather color
      System.out.println("What color are the feathers? (red/blue)");
      String featherColor = input.nextLine();
      //determine what bird
      if(featherColor.equals("blue")){
       System.out.println("That is a Blue Jay");
      } else if(featherColor.equals("red")){
        System.out.println("That is a cardinal");
      }
      }
      //if user answered no
       }else{
    }
    
  }

