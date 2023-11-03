import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //If your grade was less than 90% on the unit 4 test,
        //you will work on corrections today.
        //Complete corrections for any questions you got wrong.

        //1. Write a while loop that repeatedly asks the user WHAT
        //YOUR NAME IS until they get it right.
        Scanner s = new Scanner(System.in);

        //2. Complete the trace table for #2 for at minimum i = 1 and i = 2.
        /*
         *      i   j   print
         *      1   6     *
         *      1   5     *
         *      1   4     *
         * 
         *      ...
         *      6   6     *
         */

         //3. Write a for loop in Java that counts down from 100 to 0, 
         //printing out only the ODD numbers.

         //4. (exact same as on test) Write java code that prints out
         //every number 1 to 10, 10 times each. Use nested loops
         //(you can use any combination of for and/or while loops,
         //as long as your code meets the requirement.)

         //5. (exact same as on test) Write code using a for loop that
         //will determine how many asterisks (*) there are in a String
         //variable myStr. Your code should work with any value of myStr.

         String myStr = "**hi*there*";
         int total = 0;

         //your code here

         System.out.println("There are " + total + " asterisks.");

         //6. Why is total = total + x (also total += x) the answer to this question?
         //Why does total have to be on the left, and x on the right?

         //7. Complete a trace table for #7 for at minimum i = 1 and i = 2.
        /*
        *      i   j   print
        *      1   0     *
        *      1   1     *
        *      1   2     *
        * 
        *      ...
        *      5   5     *
        */
    }
}
