package Assignment1;

public class Qusetion1 {
    public static void main(String[] args){
        int swapping = 93;
        String mystring = Integer.toString(swapping);

        if(mystring.length()> 1){
            swapping = Integer.parseInt(mystring);
            int Swapped = swap_method(swapping);
            System.out.println("I swapped "+ swapping + " to " + Swapped);

        }else{
            System.out.println("Your number has " + mystring.length() + " digit");
            System.out.println("And I cannot swap numbers with less than 2 digits");
        }


    }

    public static int swap_method(int x){
//        converting the given number into a string to find its length
        String newString = Integer.toString(x);
        //        if the length of the given number is 1

        char First = newString.charAt(0);
        char Second = newString.charAt(1);
        // convert the given string to a character array
        char[] chars = newString.toCharArray();

        // replace character at the specified position in a char array
        chars[0] =Second;
        chars[1] = First;

        // convert the character array back into a string
        newString = String.valueOf(chars);
//            then converting the string back to an integer
        x = Integer.parseInt(newString);
        // print the modified string
        return x;

    }
}
