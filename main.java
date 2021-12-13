import static java.lang.System.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    // You can write all your code here :)
    out.println("you are on an airplane");
    out.println("the plane experience turbulance and crashes");
    out.println("You are now in a forest and all lost");
    out.println("Find a way to survive");
    out.println("You have to look around for survivors and food.\n Do you want to climb out of the plane? (Y or N)");

    String userInput = kb.next();

    if(userInput.equals("Y")) {
      out.println("Good choice. Do you want to go to the LEFT or RIGHT?");
      userInput = kb.next();
      if(userInput.equals("LEFT")) {
        //print more story
        out.println("dont ever play again, you fell in to the ditch");
      } else if(userInput.equals("RIGHT")) {
          //print more story
          out.println("good choice.you are out of the plane");
          out.println("Now you have to look for survivors");
        
        //out.println("Look around the forest for survivors");
        
        out.println("you see a survivor hanging on top of a tree, screaming for help");
        out.println("Do you want to help him? (Y or N)");
        userInput = kb.next();
        if(userInput.equals("Y")) {
          out.println("Too bad you couldnt help him, you fell and broke your neck");
        } else if(userInput.equals("N")) {
          //print more story
          out.println("great choice, unfortunately he's stuck there but you're alive");
          out.println("Now you need to find food!");
          out.println("you find 2 bunches of mushroom and one of them is poisonous. Do you want to take the chance and eat them? (Y or N)");
          userInput = kb.next();

          if(userInput.equals("Y")) {
            out.println("Good choice. Do you went to eat the LEFT or RIGHT?");
            userInput = kb.next();

            if(userInput.equals("LEFT")) {
              //print more story
              out.println("good choice your hunger bar is full now");
              out.println("Oh No! It started raining do you want to hide in a cave? (Y or N)");
              userInput = kb.next();

              if(userInput.equals("Y")) {
                out.println("Good choice! you avoided getting sick in the rain");
              
              } else if(userInput.equals("N")) {
                out.println("I just dont know what to tell you anymore, u got struck by lightning");
              }
            
            } else if(userInput.equals("RIGHT")) {
              //print something
              out.println("ur dead");
            }
            out.println("You find a flare gun from one of the passengers bags");
                out.println("you need to wait for the rain to stop to use the flare gun");
                out.println("Now that the rain has stopped you see a rescue team helicopter");
                out.println("Do you want to use the flare gun to get saved (Y or N)");
                userInput = kb.next();

                if(userInput.equals("Y")) {
                  out.println("congrats you made it out alive, GG");
                }
            
            else if(userInput.equals("N")) {
              out.println("you're stuck there forever lol you suck");
            }
                
          
          } else if(userInput.equals("N")) {
            //print more story
            out.println("at this point just quit the game YOU SUCK, you died of posion!");
            
           
          }
        }
      }
    } else if(userInput.equals("N")) {
      out.println("you suck, play again.");
    }
   
   }

  }

