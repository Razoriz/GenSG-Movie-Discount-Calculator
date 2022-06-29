//Part 2 - Movie Discounts
//A movie cinema does price discounting depending on a customer's age.
//The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
//Write the app so that the conditions above are met and the correct ticket price is returned.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        double discountTicketPrice = 0;

        if (age <= 4) {
            discountTicketPrice = (7-(7*0.6));
            System.out.println("Your ticket price is: " + discountTicketPrice); 
        } else if (age >= 61) {
            discountTicketPrice = (7-(7*0.55));
            System.out.println("Your ticket price is: " + discountTicketPrice); 
        } else {
            //Have the app prompt normal ticket buyers for the number of tickets they wish to buy.
            // For every two or more tickets sold, give a 30% discount.
            System.out.println("You are eligible for a 30% dicount if you buy more than 2 tickets.");
            System.out.println("Enter the number of tickets you wish to buy: ");
        }
        int numberOfTickets = scanner.nextInt();
        double discount = 0;
        double totalPrice = (numberOfTickets * 7);

        if (numberOfTickets >= 2) {
            discount = (totalPrice - ((totalPrice)*0.3));
        } else {
            System.out.println("You are not eligible for a discount.");
        }
        System.out.println("Your total price is: " + discount);
    }
}


       
        
