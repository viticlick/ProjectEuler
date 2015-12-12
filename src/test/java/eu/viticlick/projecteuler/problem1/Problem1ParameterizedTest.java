package eu.viticlick.projecteuler.problem1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem1ParameterizedTest {

    private int naturalNumber;
    private long expected;
    
    public Problem1ParameterizedTest(int naturalNumber, long expected) {
        super();
        this.naturalNumber = naturalNumber;
        this.expected = expected;
    }
    
    @Parameters(name = "{index}: Problem 1 result({0}) = {1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {10,23L},
            {11,33L},
            {100, 2318L},
            {1000, 233168L},
            {10000, 23331668L}
        });
    } 
    
    @Test
    public void testSimpleResult(){
        long result = Problem1.result(naturalNumber);
        
        assertThat(result, is(expected));
    }
    
    @Test
    public void testMultipleResult(){
        long result = 0L;
        for(int i = 0 ; i < 1000000 ; i++ ){
            result = Problem1.result(naturalNumber);
        }

        assertThat(result, is(expected));
    }
    
}
