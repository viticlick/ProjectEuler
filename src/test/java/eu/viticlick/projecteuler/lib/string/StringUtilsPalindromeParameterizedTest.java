package eu.viticlick.projecteuler.lib.string;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsPalindromeParameterizedTest {

    boolean result;
    String text;
    
    public StringUtilsPalindromeParameterizedTest(boolean result, String text) {
        this.result = result;
        this.text = text;
    }

    @Parameters(name="{index} isPalindrome({1}) = {0}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {true,"a"},
                {true,"1"},
                {true,"11"},
                {false,"ab"},
                {true,"1a1"},
                {false,"abb"}
        });
    }
    
    @Test
    public void testIsPalindrome(){
        assertThat(StringUtils.isPalindrome(text), is(result));
    }
    
}
