package eu.viticlick.projecteuler.problem3;

/**
 * 
 * @author viticlick
 *
 */
public class Problem3 {

    /**
     * Calculate the largest prime factor of the input number.
     * @param value the value to calcute the largues prime factor.
     * @return the largest prime factor of the value.
     * @see <a href="https://projecteuler.net/problem=">Project Euler</a>
     */
    public static long result(long value) {
        checkInput(value);
        return result(value, 2);
    }

    private static void checkInput(long value) {
        if(value < 2 ){
            throw new IllegalArgumentException("The input value must be greater than 1"); 
        }
    }

    private static long result(long value , long divider ){
        while( value % divider == 0 ){
            value = value / divider;
        }
        
        if( value != 1 ){
            divider = result(value, divider+1);
        }
        
        return divider;
        
    }
    
}
