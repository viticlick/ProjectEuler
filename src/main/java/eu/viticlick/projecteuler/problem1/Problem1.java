package eu.viticlick.projecteuler.problem1;


/**
 *
 * @author viticlick
 *
 */
public class Problem1 {

    public static void main(String[] args) {

    }

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     * @return the sum of all the multiples of 3 or 5 below 1000
     * @see <a href="https://projecteuler.net/problem=1">Project Euler</a>
     */
    public static long result(int naturalValue){
        checkInput(naturalValue);
        long result = 0L;
        
        for (int i = 0; i < naturalValue; i++) {
            if( i % 3 == 0 || i % 5 == 0){
                result = result + i;
            }
        }
        return result;
    }
    
    private static void checkInput(int value){
        if( value <= 0 ){
            throw new IllegalArgumentException("The value must be a natural number");
        }
    }
    
}
