package eu.viticlick.projecteuler.lib.integer;

public class IntUtils {

    public static boolean isPalindrome(int value) {
        int mod = 0;
        int log = 0;
        int exp = 0;
        while( value > 10 ){
            log = (int) Math.log10(value);
            exp = (int) Math.pow( 10, log );
            mod = value % 10;
            if( value / exp != mod)
                return false;
            
            value = value - exp * mod;
            value = value / 10;
        }
        
        return true;
    }

}
