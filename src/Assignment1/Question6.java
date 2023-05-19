package Assignment1;

import java.util.stream.IntStream;

public class Question6 {
    public static void main(String[] args){
        int mynumber = 4;
        int mySum=0;
        int[] Array_in_range = IntStream.rangeClosed(1, 4).toArray();
        for (int i = 0; i<Array_in_range.length; i++){
//            Re-assigning the factorial variable by multiplying each element
//            in the array with the product's reassigned value
            mySum = Array_in_range[i] + mySum;
        }
        System.out.println("The sum of numbers below "+ mynumber +" inclusive is "+ mySum );
    }
}
