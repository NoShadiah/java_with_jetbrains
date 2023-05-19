package Assignment1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.IntStream;

//3.	Write a Java program to find the factorial of a number.
public class Question3 {
    public static void main(String[] args){
        int mynumber = 4;
        int myFactorial=1;
        int[] Array_in_range = IntStream.rangeClosed(1, 4).toArray();
        for (int i = 0; i<Array_in_range.length; i++){
//            Re-assigning the factorial variable by multiplying each element
//            in the array with the product's reassigned value
            myFactorial = Array_in_range[i]*myFactorial;
        }
        System.out.println("The factorial of "+ mynumber +" is "+ myFactorial );
    }

}
