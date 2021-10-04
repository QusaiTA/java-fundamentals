package lab6;

import java.util.ArrayList;
import java.util.List;

public class Resturant implements reviewList {

    public String name;
    private String priceCategory;

    private int raitng;

    private List<Review> review = new ArrayList<>();

    public Resturant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.raitng = 0;
    }

    public String getName() {
        return name;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public int getStarsNum() {
        return raitng;
    }

    public List<Review> getReview() {
        return review;
    }

    @Override
    public Review addReview(String body, String author, int stars) {
        Review newReview = new Review(body,author,stars);
        review.add(newReview);
        updateRating(review);

        return newReview;

    }



    public void updateRating(List<Review>review){
        int value = 0;
        for(Review r : review){
            value += r.starNum;
        }
        this.raitng = value/review.size();

    }

    @Override
    public String toString() {
        return "Resturant{" +
                "name='" + name + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", raitng'" + raitng + '\'' +
                ", review=" + review +
                '}';
    }


}
