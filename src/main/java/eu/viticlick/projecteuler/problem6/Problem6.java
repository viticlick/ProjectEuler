package eu.viticlick.projecteuler.problem6;

import java.util.stream.LongStream;

public class Problem6 {

	public long resolve(int value) {
		long squaresSum = LongStream.rangeClosed(1, value).map(x -> x*x ).sum();
		long squareSum = (long) Math.pow(LongStream.rangeClosed(1, value).sum() , 2);
		return squareSum - squaresSum;
	}

}
