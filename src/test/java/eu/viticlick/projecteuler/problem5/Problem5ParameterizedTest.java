package eu.viticlick.projecteuler.problem5;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem5ParameterizedTest {

	int start;
	int end;
	int expected;
	
	public Problem5ParameterizedTest(int start, int end, int result) {
		this.start = start;
		this.end = end;
		this.expected = result;
	}
	
	@Parameters(name="{index} test({0},{1}) = {2}")
	public static Iterable<Object[]> test() {
		return Arrays.asList(new Object[][]{
				{2,10,2520},
				{2,20,232792560}
		});
	}
	
	@Test
	public void testProblem5(){
		int result = Problem5.solve(start, end);
		assertThat(result, is(expected));
	}

}
