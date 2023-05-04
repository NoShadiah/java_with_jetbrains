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
    }

    public static int addition(int x, int y){
        int result = x + y;

        return(result);
    }
}