package lab6;

public class Main {

    public static void main(String[] args) {
        System.out.println("HElLO");

        Resturant resturant1 = new Resturant("Pizza Hut", "$");
        resturant1.addReview("good resturant", "Qusai Tashtosh", 3);



        Resturant resturant2 = new Resturant("FireFly" , "$$");
        resturant2.addReview("Very good","Qusai Tashtosh",4);

        Shop newShop = new Shop("Addidas","nice","$");
        newShop.addReview("very good","Qusai",4);

        Theater newTheater = new Theater("Al-Quds");
        newTheater.addMovie("Join Wick");
        newTheater.addMovie("XXX");
        newTheater.addMovie("Red Sparrow");

        System.out.println(newTheater.getMovies());
        newTheater.RemoveMovie("XXX");
        System.out.println(newTheater.getMovies());

        newTheater.movieReview(new Review("nice movie","Qusai",4),"Join Wick");
        newTheater.originalReviewWithoutMovieName(new Review("very nice","Qusai",2));

        System.out.println(newTheater.getReviews());







        System.out.println(resturant1);
        System.out.println(resturant2);
        System.out.println(newShop);

    }
}
