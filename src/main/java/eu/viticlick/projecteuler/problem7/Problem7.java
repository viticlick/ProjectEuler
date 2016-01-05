package eu.viticlick.projecteuler.problem7;

import java.util.function.LongPredicate;

/**
 * 
 * @author viticlick
 *
 */
public class Problem7 {

	
	public static void main(String args[]){
		int index = 1001;
		long result = solve(index);
		System.out.println(result);
	}

	/**
	 * Calculate the index st prime number
	 * @param index indicates the prime number position
	 * @return Prime value 
	 */
	public static long solve(int index) {
		if( index == 1 ){
			return 2;
		}
		return solveOverFirst(index);
	}

	private static long solveOverFirst(int index) {
		LongPredicate predicate = d -> true;
		LongPredicate auxPredicate = null;
		index--;
		long indexValue = 2;
		do{
			auxPredicate = isDivisible(indexValue++).negate();
			predicate = predicate.and(auxPredicate);
			if( predicate.test(indexValue)){
				index--;
			}
		}while( index != 0 );
		
		return indexValue;
	}
	
	
	private static LongPredicate isDivisible(long indexValue){
		return d -> d % indexValue == 0;
	}
	
}
