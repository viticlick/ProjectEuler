package eu.viticlick.projecteuler.problem6;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class Problem6Test {

	@Test
	public void differenceOf10FirstNumbersIs2640(){
		long expected = 2640L;
		
		Problem6 problem = new Problem6();
		
		assertThat(problem.resolve(10) , is(expected));
		
	}
	
}
