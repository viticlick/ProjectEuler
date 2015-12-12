package eu.viticlick.projecteuler.lib.string;

public class StringUtils {

    public static boolean isPalindrome(String text) {
        int length = text.length(); 
        int middle = (length + 1)/ 2;
        int index = 0;
        boolean result = false;
        
        do{
            result =  text.charAt(index++) == text.charAt(length - index);
        }while( index < middle && result  );
        
        return result;
    }
    
}
