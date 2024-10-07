//Write a Java program to create a class called &quot;Movie&quot; with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews. Use a array of strings for reviews.


import java.util.Scanner;

public class Movie {
    private String title;
    private String director;
    private String[] actors;
    private String[] reviews;

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String[] getActors() {
        return actors;
    }

    public String[] getReviews() {
        return reviews;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setReviews(String[] reviews) {
        this.reviews = reviews;
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title: ");

        movie.setTitle(sc.nextLine());
        System.out.println("Enter the director: ");
        
        movie.setDirector(sc.nextLine());
        System.out.println("Enter the number of actors: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] actors = new String[n];
        System.out.println("Enter the actors: ");
        for (int i = 0; i < n; i++) {
            actors[i] = sc.nextLine();
        }
        movie.setActors(actors);
        System.out.println("Enter the number of reviews: ");
        int m = sc.nextInt();
        sc.nextLine();
        String[] reviews = new String[m];
        System.out.println("Enter the reviews: ");
        for (int i = 0; i < m; i++) {
            reviews[i] = sc.nextLine();
        }
        movie.setReviews(reviews);
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: ");
        for (String actor : movie.getActors()) {
            System.out.println(actor);
        }
        System.out.println("Reviews: ");
        for (String review : movie.getReviews()) {
            System.out.println(review);
        }

        sc.close();
    }
}