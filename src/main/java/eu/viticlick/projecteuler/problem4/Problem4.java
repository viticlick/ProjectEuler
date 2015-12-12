package eu.viticlick.projecteuler.problem4;

import eu.viticlick.projecteuler.lib.string.StringUtils;

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
        // TODO Auto-generated method stub
        return 0;
    }

    private static boolean isPalindrome(int value){
        String text = Integer.toString(value);
        return StringUtils.isPalindrome(text);
    }
    
}
