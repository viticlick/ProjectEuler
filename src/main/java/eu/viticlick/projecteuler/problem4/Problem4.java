package eu.viticlick.projecteuler.problem4;

import java.util.LinkedList;
import java.util.List;

import eu.viticlick.projecteuler.lib.integer.IntUtils;

/**
 * 
 * @author viticlick
 *
 */
public class Problem4 {

    /**
     * Find the largest palindrome made from the product of two 3-digit numbers.
     * @param digits the long of the digits
     * @return the largest palindrome made from the product of digits number.
     * @see <a href="www.projecteuler.net?problem=4">Project Euler</a>
     */
    public static int result(short digits) {
        int hight = (int) Math.pow(10, digits);
        List<Integer> values = new LinkedList<>();
        for(int i = 0 ; i < hight ; i++ ){
            for (int j = 0; j < hight; j++) {
                values.add(i*j);
            }
        }
        
        return values.stream()
            .filter(Problem4::isPalindrome)
            .mapToInt(i->i)
            .max().getAsInt();
    }

    private static boolean isPalindrome(int value){
        return IntUtils.isPalindrome(value);
    }
    
}
