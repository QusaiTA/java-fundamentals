public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize( dogCount ,"dog") + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize( catCount ,"cat") + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize( turtleCount, "turtle") + ".");

    }


    public static String pluralize(int numAnimal, String nameAnimal){
      if(numAnimal == 0 || numAnimal > 1) {
          return nameAnimal + 's';
      }
          else{
              return nameAnimal;
          }

    }
}
