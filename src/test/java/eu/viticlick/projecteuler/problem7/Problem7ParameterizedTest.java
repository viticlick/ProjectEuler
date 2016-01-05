package eu.viticlick.projecteuler.problem7;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem7ParameterizedTest {

	int index = 0;
	long expected = 0;
	
	public Problem7ParameterizedTest(int index, int result){
		this.index = index;
		this.expected = result;
	}
	
	@Parameters(name="{index} test({0}) = {1}")
	public static Iterable<Object[]> params(){
		return Arrays.asList( new Object[][]{
			{1,2},
			{2,3},
			{3,5},
			{4,7},
			{5,11},
			{6,13}
		});
	}
	
	@Test
	public void testProblem7(){
		long result = Problem7.solve(index);
		assertThat(result, is(expected));
	}
	
}
