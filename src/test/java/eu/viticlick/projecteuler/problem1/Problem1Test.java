package eu.viticlick.projecteuler.problem1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem1Test {

	private Problem1 problem = new Problem1();
	
    @Test(expected = IllegalArgumentException.class)
    public void testResultWhenNotNaturalNumberThrowIllegalArgumentException() {
        problem.result(-1);
    }

    @Test
    public void testResultWhenTenThenTwentyThree(){
        long expected = 23L;
        int naturalNumber = 10;
       
        long result = problem.result(naturalNumber);
        
        assertThat(result, is(expected));
    }
}
