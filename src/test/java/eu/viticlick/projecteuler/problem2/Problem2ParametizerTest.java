package eu.viticlick.projecteuler.problem2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2ParametizerTest {

    private int maxIndex;
    private long expected;
    
    public Problem2ParametizerTest(int maxIndex, long expected) {
        super();
        this.maxIndex = maxIndex;
        this.expected = expected;
    }

    @Parameters( name= "{index} Problem 2 result({0}) = {2}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {10,10L},
            {34, 44L},
            {4_000_000,4_613_732L}
        });
    } 
    
    @Test
    public void testProblem2(){
        Problem2 problem = new Problem2(maxIndex);
        long result = problem.result();
        assertThat(result,is(expected));
    }
}
