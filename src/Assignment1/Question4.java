package Assignment1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number you want me to count:");

        String userInput = myObj.nextLine();  // Read user input
        int Counted_input = userInput.length();
        System.out.println("The number of digits in  " + userInput + " is " + Counted_input);

    }
}
