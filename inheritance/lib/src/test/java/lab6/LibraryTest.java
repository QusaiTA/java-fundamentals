/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;


class LibraryTest {


    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    @DisplayName("constructer test")
    public void testConstructer(){

        Resturant classUnderTest = new Resturant("KFC","$$");

        String expectedName = "KFC";
        String expectedCategory = "$$";

        assertEquals(expectedName,classUnderTest.getName());
        assertEquals(expectedCategory,classUnderTest.getPriceCategory());
    }

    @Test
    @DisplayName("toString Method test")
    public void testToString(){
        Resturant classUnderTest = new Resturant("KFC","$$");




        assertEquals("Resturant{name='KFC', priceCategory='$$', raitng'0', review=[]}" , classUnderTest.toString());

    }

    @Test
    @DisplayName("review costructer test")
    public void addReviewCounstructerTest(){

//        Review rev = new Review("good","Qusai",5);
//
//            String expectedBody = "good";
//            String expectedAuthor = "Qusai";
//            int expectedStars = 5;
//        assertEquals(expectedBody , rev.getBody());
//        assertEquals(expectedAuthor , rev.getAuthor());
//        assertEquals(expectedStars , rev.getStarNum());
//          Resturant resturant = new Resturant("pizza", "$");

//          resturant.addReview("Good","Qusai",3);
        Review review = new Review("good","Qusai",2);

          assertEquals("Review{body='good', author='Qusai', starNum=2}",review.toString());

        }
    @Test
    @DisplayName("review constructor test")
    public void reviewToString(){

        Review rev = new Review("good","Qusai",5);

        assertEquals("Review{body='good', author='Qusai', starNum=5}",rev.toString());

    }

    @Test
    @DisplayName("shop constructor test")
    public void shopConstructorTest(){

     Shop newShop = new Shop("Nike","good","$$");

        String expectedName = "Nike";
        String expectedDiscreption = "good";
        String expectedDollarSign = "$$";

        assertEquals(expectedName,newShop.getName());
        assertEquals(expectedDiscreption,newShop.getDescription());
        assertEquals(expectedDollarSign,newShop.getDollarSign());


    }
    @Test
    @DisplayName("shop review test")
    public void shopReviewTest(){

        Shop newShop = new Shop("Nike","good","$$");
        newShop.addReview("good","Qusai",3);

        assertEquals(newShop.getReviews().size() == 1,true);
    }

    @Test
    @DisplayName("shop review test")
    public void shopToStringTest(){

        Review rev = new Review("good","Qusai",5);

        assertEquals("Review{body='good', author='Qusai', starNum=5}",rev.toString());
    }

    @Test
    @DisplayName("Theater constructor test")
    public void theaterConstructorTest(){

        Theater newTheater = new Theater("Amman");

        String expectedName = "Amman";
        assertEquals(expectedName,newTheater.getName());
    }

    @Test
    @DisplayName("Theater review test")
    public void theaterReviewTest(){

        Theater newTheater = new Theater("Amman");

        Review rev = new Review("good","Qusai",5);

        assertEquals("Review{body='good', author='Qusai', starNum=5}",rev.toString());

        newTheater.addMovie("22 mile");
        newTheater.movieReview(rev,"22 mile");
        assertTrue(newTheater.getReviews().size() == 1,"true");

       newTheater.originalReviewWithoutMovieName(rev);
        assertTrue(newTheater.getReviews().size() == 2,"true");







    }

    @Test
    @DisplayName("Theater addMovie test")
    public void theateraddMovieTest(){

        Theater newTheater = new Theater("Amman");

        newTheater.addMovie("Low Abiding Citizen");
        assertEquals(1,newTheater.getMovies().size());
    }

    @Test
    @DisplayName("Theater removeMovie test")
    public void theaterremoveMovieTest(){

        Theater newTheater = new Theater("Amman");

        newTheater.addMovie("Low Abiding Citizen");
        newTheater.addMovie("F9");
        newTheater.RemoveMovie("Low Abiding Citizen");
        assertEquals(1,newTheater.getMovies().size());
    }












    }






