public class Datatypes{
    public static void main(String[] args){
//These are basic variables with different datatype, for some of them am adding the maximum variable
        byte my_byte = 127;
        short my_short = 32767;
        int my_int = 2_147_483_647;
        long my_long = 2_000_000_354L;
        int my_additionFunction = addition(my_short, my_int);
        int resultant = addition(2, 5);
        System.out.println(my_additionFunction);
        System.out.println(resultant);
// Using special characters in java
        //a new line uses (\n)
        String txt = "Hello \nWorld!";
        System.out.println(txt);

        //return the content after the special character using a carriage return
        String carriage = "This \rLife is not my own";
        System.out.println(carriage);

//        adding a tab space using the \t (tab) character
        String tab_space = "Hallo\t there, am using the tab special character";
        System.out.println(tab_space);

//        Adding a backspace in a string using the backspace operator (\b)
        String Backspace = "Java \nScript is not java";
        System.out.println(Backspace);
    }

    public static int addition(int x, int y){
        int result = x + y;

        return(result);
    }


}