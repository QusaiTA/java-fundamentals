package lab6;

public class Review {

    public String body;
    public String author;

    public int starNum;

    public Review(String body, String author, int starNum) {
        this.body = body;
        this.author = author;
        this.starNum = starNum;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", starNum=" + starNum +
                '}';
    }
}
