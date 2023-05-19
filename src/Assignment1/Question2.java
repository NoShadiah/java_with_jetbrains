package Assignment1;

import java.util.Arrays;

public class Question2 {
    public static int SearchLargest(int[] a, int total){
//        the integer to store the largest number
        int temp;
//        looping (using the nested loop)
//      through the array to find the largest value
        for (int i = 0; i < total; i++)
        {
//            The nested loop is to compare the preceding index with the succeeding index
//            as long as we are still below the length of the array
            for (int j = i + 1; j < total; j++)
            {
//                if the preceding is greater than the successor
                if (a[i] > a[j])
                {
//                    we initialized the variable temp with the greater index.
                    temp = a[i];
//                    reassigned the index of the larger number with the lesser number
                    a[i] = a[j];
//                    Re-assigned the index of the smaller number with the greater number
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }
    public static void main(String args[]){
        int[] a={10,2,05};
        int b[]={44,66,77,7896,33,22,55};
        System.out.println("Largest: "+SearchLargest(a,a.length));
        System.out.println("Largest: "+SearchLargest(b,b.length));
    }
}
