package lab6;

import java.util.ArrayList;
import java.util.List;

public class Shop implements reviewList {

    private String name;
    private String description;
    private String dollarSign;

    private int raitng;

    private List<Review> reviews = new ArrayList<>();


    public Shop(String name, String description, String dollarSign) {
        this.name = name;
        this.description = description;
        this.dollarSign = dollarSign;
        this.raitng = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public List<Review> getReviews() {
        return reviews;
    }
    public void updateRating(List<Review>review){
        int value = 0;
        for(Review r : review){
            value += r.starNum;
        }
        this.raitng = value/review.size();

    }

    @Override
    public Review addReview(String body, String author, int stars) {
        Review review = new Review(body,author,stars);
        reviews.add(review);
        updateRating(reviews);

        return review;

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSign=" + dollarSign +
                ", review=" + reviews +
                '}';
    }


}
