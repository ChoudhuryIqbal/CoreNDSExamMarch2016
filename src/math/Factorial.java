package math;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int fact=5;
        for(int i=fact-1;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
