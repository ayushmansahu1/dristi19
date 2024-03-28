public class lex {
    public static void main(String [] args)
    {

        String s1= "This is Exercise 1";
        String s2="This is exercise 2";
        int value = s1.compareTo(s2);

        if(value > 0)
        {
            System.out.println(s1+" is greater than"+s2);
        } else if (value == 0)
        {
            System.out.println(s1+" is equal to"+s2);
        }
        else {
            System.out.println(s1+" is less than"+s2 );
        }

    }
}