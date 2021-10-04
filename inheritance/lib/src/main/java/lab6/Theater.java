package lab6;

import java.util.ArrayList;
import java.util.List;

public class Theater implements reviewList {

    private String name;
    private List<String> movies = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public List<Review> getReviews() {

        return reviews ;
    }

    public void addMovie(String movie){
        this.movies.add(movie);

    }

    public void RemoveMovie(String movie){
        this.movies.remove(movie);

    }
    @Override
    public Review addReview(String body, String author, int stars) {
        Review review = new Review(body,author,stars);
        reviews.add(review);

        return review;

    }

    public void movieReview(Review review,String movie){
        if(movies.contains(movie)){
            reviews.add(review);
            System.out.println("thanks for review and wathcing" + movie);
        }else {
            System.out.println("This movie isn't exist");
        }

    }
    public void originalReviewWithoutMovieName(Review review){
        reviews.add(review);
        System.out.println("thanks for review");
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }


}
