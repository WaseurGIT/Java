package LabTask_3;

import java.util.Arrays;

public class Movie {
    
    private String title;
    private String director;
    private String actor;
    private String[] reviews;
    private int reviewCount;

    Movie(String title, String director, String actor,int maxReviews){
        this.title = title;
        this.director= director;
        this.actor = actor;
        this.reviews = new String[maxReviews];
        this.reviewCount = 0;
    }

    public void addReview(String review){
        if(reviewCount<reviews.length){
            reviews[reviewCount]=review;
            reviewCount++;
        }
        else{
            System.out.println("No more space");
        }
    }

    public String[] getReviews(){
        return Arrays.copyOf(reviews, reviewCount);
    }

    public void displayMovie(){
        System.out.println("Title: "+title);
        System.out.println("Directors: "+director);
        System.out.println("Actor: "+actor);
        System.out.println("Reviews: ");
        for(String review: getReviews()){
            System.out.println("- "+review);
        }
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Tenet", "Nolan", "Ami", 5);

        movie.addReview("Awesome");
        movie.addReview("wow");
    }
     
}