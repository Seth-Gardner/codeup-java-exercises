package movies;

import java.util.Arrays;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {

    private static int ask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which would you like? ");
        return scanner.nextInt();
    }

    private static void showAll(){
        MoviesArray funky = new MoviesArray();
        Movie[] movielist = funky.findAll();
        for (Movie movie : movielist) {
            System.out.print(movie.getName() + "-");
            System.out.print(movie.getCategory() + "\n");
        }
    }

    private static void showCategory(String category){
        MoviesArray funky = new MoviesArray();
        Movie[] movielist = funky.findAll();
        for (Movie movie : movielist) {
            if(movie.getCategory().equals(category)){
                System.out.print(movie.getName() + "\n");
            }
        }
    }

    private static void pick(){
        int choice = ask();
        while(choice != 0){
            switch (choice){
                case 1 : showAll();
                case 2 : showCategory("animated");
                case 3 : showCategory("drama");
                case 4 : showCategory("sci-fi");
                case 5 : showCategory("comedy");
                case 6 : showCategory("musical");
            }
            choice = ask();
        }
    }
    public static void main(String[] args) {
        System.out.print("What would you like to do?\n\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view animated movies");
        System.out.println("3 - view drama movies");
        System.out.println("4 - view sci-fi movies");
        System.out.println("5 - view comedy movies");
        System.out.println("6 - view musicals");
        pick();
        showCategory("comedy");


    }
}
