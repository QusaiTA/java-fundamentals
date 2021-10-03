package lab6;

public class Main {

    public static void main(String[] args) {
        System.out.println("HElLO");

        Resturant resturant1 = new Resturant("Pizza Hut", "$");
        resturant1.addReview("good resturant", "Qusai Tashtosh", 3);


        Resturant resturant2 = new Resturant("FireFly" , "$$");
        resturant2.addReview("Very good","Qusai Tashtosh",4);




        System.out.println(resturant1);
        System.out.println(resturant2);

    }
}
