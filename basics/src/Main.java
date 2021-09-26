import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize( dogCount ,"dog") + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize( catCount ,"cat") + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize( turtleCount, "turtle") + ".");
        flipNHeads(5);

    }


    public static String pluralize(int numAnimal, String nameAnimal){
      if(numAnimal == 0 || numAnimal > 1) {
          return nameAnimal + 's';
      }
          else{
              return nameAnimal;
          }

    }

    public static void flipNHeads(int flipNum){

        Random numOfFlips = new Random();
        float headOrTail ;
        int headNum = 0;
        int trial = 0;

        while(headNum != flipNum){

            headOrTail = numOfFlips.nextFloat();


          if(headOrTail > 0.5){
              System.out.println("heads");
              headNum += 1;
              trial += 1;

          } else {
              System.out.println("tails");
              headNum = 0;
              trial += 1;
          }

        }

        System.out.println(" It took " + trial + " " + pluralize(trial, "flip") + " to flip  " + headNum + " head  in a row");
    }
}
