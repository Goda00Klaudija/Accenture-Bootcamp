import java.util.Scanner;

public class Day2_T1_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;

        //Task 1
        System.out.println( "Enter value a:");
        a = input.nextInt();

        System.out.println( "Enter value b:");
        b = input.nextInt();

        System.out.println("is" + a + "equal to" +b+ "? -" +(a==b));
        System.out.println("is" + a + "less than" + b + "? -" +(a<b));
        System.out.println("is" + a + "less or equal to" + b + "? -" +(a<=b));
        System.out.println("is" + a + "greater than" + b + "? -" +(a>b));
        System.out.println("is" + a + "greater or equal to" + b + "? -" +(a>=b));


        //Task 2
        boolean b1, b2;
        System.out.print( "Enter b1:");
        b1 = input.nextBoolean();
        System.out.print( "Enter b2:");
        b2 = input.nextBoolean();

        System.out.println("Is b1 and b2 equal? -" +(b1==b2);

        //Task 3
        //The remainder is 0 therefore number is even.
        //If number is even - true
        //If number is odd - false
        
        int c;
        System.out.print( "Input a whole number:");
        c = input.nextInt()

        if(c % 2 == 0) {
            System.out.println(c + " true");
        }
        else {
            System.out.println(c + " false");
        }

        //Task 4
        //If remainder is not 0, then number is odd.
        //If number is even - false
        //If number is odd - true
        int c;
        System.out.print( "Input a whole number:");
        c = input.nextInt()

        //Different technique
        String false0true = (c % 2 == 0) ? "even" : "odd";

        System.out.println(c + " is " + false0true);

        //Task 5
        boolean b3;
        System.out.print( "Enter boolean value:");
        b3 = input.nextBoolean();

        System.out.println("Opposite of a boolean value is" +(!b3));

        //Task 6
        int d, e;
        System.out.print( "Input a whole number d:");
        d = input.nextInt();
        System.out.print( "Input a whole number e:");
        e = input.nextInt();

        if((d==e) || (d<0 && b>0) | d>100 && e>100) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
         
        }
    }
}


