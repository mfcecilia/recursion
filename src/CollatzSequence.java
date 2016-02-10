import java.util.*;
public class CollatzSequence {

    public static void main(String[] args) {
        
        int max = 0; //max length of chain produced
        int maxNum = 0; //the number that produced the max chain (the size of the stack when you add 1)
        for(int i = 1; i < 1000000; i++) //start at 1 because we don't have a base case for zero and start at 1mil because we want to stay below it
        {
            int chain = calculateSequence(i); //keep track of the chain produced by the recursion
            if(chain > max) // this means that as we increase the chain size, the max variable will adjust to equal the new larger size
            {
                max = chain; 
                maxNum = i; //maxNum will also be adjusted whenever a longer chain is produced. maxNum is the number that produced that long chain
            }
        }
        System.out.println(maxNum);
        
    }
    
    
    /**
     * this is the recursion
     * @param n is also represented by i in the for loop in the main method
     * @return returns the stack
     */
    static int calculateSequence(long n) //you can't call methods in the main method
    {
        //first base case
        if (n == 1)
        {
            return 1;
        }
        //second base case for even numbers (even numbers, when divided by 2, their remainder is zero)
        else if (n%2 == 0)
        {
            return 1 + calculateSequence(n/2); //return 1 means that you're adding 1 to the stack. the stack count tells you the number under evaluation
        }
        //third base case for odd numbers
        else
        {
            return 1 + calculateSequence(3*n+1);
        }
        
    }

}
    
