package eu.viticlick.projecteuler.problem1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import eu.viticlick.projecteuler.problem1.strategy.Strategy;

@RunWith(Parameterized.class)
public class Problem1ParameterizedTest {

    private int naturalNumber;
    private long expected;
    private Problem1 problem;
    
    public Problem1ParameterizedTest(int naturalNumber, long expected, String strategyName) {
        super();
        this.naturalNumber = naturalNumber;
        this.expected = expected;
        Strategy strategy = Strategy.valueOf(strategyName);
        this.problem = new Problem1(strategy.getStrategy());
    }
    
    @Parameters(name = "{index}: Problem 1 with {2} strategy({0}) = {1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {10,23L, "LINEAR"},
            {11,33L, "LINEAR"},
            {100, 2318L, "LINEAR"},
            {1000, 233168L, "LINEAR"},
//            {10000, 23331668L, "LINEAR"},
            {10,23L, "STREAM"},
            {11,33L, "STREAM"},
            {100, 2318L, "STREAM"},
            {1000, 233168L, "STREAM"},
//            {10000, 23331668L, "STREAM"}
        });
    } 
    
    @Test
    public void testSimpleResult(){
        long result = problem.result(naturalNumber);
        
        assertThat(result, is(expected));
    }
    
    @Test
    public void testMultipleResult(){
        long result = 0L;
        for(int i = 0 ; i < 1000000 ; i++ ){
            result = problem.result(naturalNumber);
        }

        assertThat(result, is(expected));
    }
    
}
