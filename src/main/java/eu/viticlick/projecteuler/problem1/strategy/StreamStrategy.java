package eu.viticlick.projecteuler.problem1.strategy;

import java.util.stream.LongStream;

public class StreamStrategy implements StrategyProblem1 {

	@Override
	public long resolve(int value) {
		long result = LongStream.range(0, value)
		.filter(x -> x % 3 == 0 || x % 5 == 0)
		.sum();
		return result;
	}

}
