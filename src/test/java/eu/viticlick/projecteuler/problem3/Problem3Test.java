package eu.viticlick.projecteuler.problem3;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem3Test {

    @Test
    public void testProblem3(){
        long expected = 29;
        long value = 13195L;
        
        long result = Problem3.result(value);
        
        assertThat(result, is(expected));
    }
    
}
