package eu.viticlick.projecteuler.problem5;

import java.util.function.IntPredicate;

/**
 * 
 * @author viticlick
 *
 */
public class Problem5 {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 * @param args Could be empty.
	 */
	public static void main(String[] args) {

		int start = 2;
		int end = 20;
		int result = solve(start,end);
		System.out.println(result);
	}
	
	public static int solve(int start, int end){
		IntPredicate predicate = isDivibleByRange(start, end);
		int value = 0;
		do{
			value += end;
		}while( !predicate.test(value) );
		return value;
	}

	private static IntPredicate isDivibleByRange(int start, int end) {
		IntPredicate predicate = d -> true;
		for( int i = start ; i <= end ; i++ ){
			predicate = predicate.and(isDivisibleBy(i));
		}
		return predicate;
	}

	/**
	 * Creates an IntPredicate which checks if an Integer is divisible by the param
	 * @param i divider
	 * @return IntPredicate which test if the param passed to test is divisible by i
	 */
	private static IntPredicate isDivisibleBy( int i ){
		return t -> t % i == 0;
	}
	
	
}

