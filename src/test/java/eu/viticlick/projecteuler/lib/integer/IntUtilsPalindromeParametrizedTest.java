package eu.viticlick.projecteuler.lib.integer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class IntUtilsPalindromeParametrizedTest {

    private int value;
    private boolean expected;
    
    public IntUtilsPalindromeParametrizedTest(int value, boolean expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name="{index} isPalindrome({0}) = {1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {1, true},
            {11, true},
            {33, true},
            {121, true},
            {222, true},
            {3223, true},
            {54345, true},
            {21, false},
            {223, false},
            {123312, false}
        });
    }
    
    @Test
    public void testPalindrome(){
        boolean result = IntUtils.isPalindrome(value);
        assertThat(result,is(expected));
    }
    
}
