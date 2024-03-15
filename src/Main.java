import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int num = (int)(Math.random() * range) + min;
        boolean valid = false;
        int guess = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Let's play a game.");
        System.out.println("Try to guess my number!");
        do{
            System.out.println("Enter a number [1-10]: ");
            if(scan.hasNextInt()){
                guess = scan.nextInt();
                if(guess >= 1 && guess <= 10){
                    valid = true;
                } else System.out.println("Sorry, your guess is invalid. Please try again.");
            } else System.out.println("Sorry, your guess is invalid. Please try again.");
            scan.nextLine();
        } while (!valid);
        System.out.println("My number was " + num + ".");
        if(guess > num)
            System.out.println("Your guess was too high.");
        else if (guess < num)
            System.out.println("your guess was too low.");
        else System.out.println("You got it right!");

    }
}