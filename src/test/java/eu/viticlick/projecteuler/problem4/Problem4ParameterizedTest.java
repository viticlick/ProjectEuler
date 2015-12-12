package eu.viticlick.projecteuler.problem4;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem4ParameterizedTest {

    private short digits;
    private int expected;

    public Problem4ParameterizedTest(short digits, int expected) {
        this.digits = digits;
        this.expected = expected;
    }
    
    // TODO: complete this test
    @Parameters(name = "{index} Problem4 result({0}) = {1}")
    public Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
            { 2 , 9009 }
        });
    }
    
    @Test
    public void testProblem4(){
        int result = Problem4.result(digits);
        assertThat(result, is(expected));
    }
    
}
