package Assignment1;

import java.util.Scanner;

//5.	Write a java program to count the number of even and odd digits in a number.
public class Question5 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter any 6 digit number, please exclude a 0:");

        String userInput = myObj.nextLine();  // Read user input
        int Index1 = 0;
        int Index2 = 0;
//        int[] odd=new int[Index1];
//        int[] even=new int[Index2];
//        int Index_to_add = 0;
//        int Even_Index = 0;
        for (int i =0; i<userInput.length(); i++){
//            changing the datatype from char to string
            String myNumber = String.valueOf(userInput.charAt(i));
            int TypeCasted = Integer.parseInt(myNumber);
            int myModulus = TypeCasted%2;
            if (myModulus > 0){
                Index1++;
//                odd[Index_to_add] = userInput.charAt(i);

//                Index_to_add++;
//                System.out.println("You have "+ odd.length+" o/-1]);
//                System.out.println("You have "+ Index1+" odd numbers and "+Index2 +" even numbers.");

            }else{
                Index2++;
//                even[Even_Index] = userInput.charAt(i);
//                Even_Index++;

//                System.out.println("You have "+ Index1+" odd numbers and "+Index2 +" even numbers.");
            }

        }
        System.out.println("You have "+ Index1+" odd numbers and "+Index2 +" even numbers.");
    }
}
