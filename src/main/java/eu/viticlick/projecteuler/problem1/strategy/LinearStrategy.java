package eu.viticlick.projecteuler.problem1.strategy;

public class LinearStrategy implements StrategyProblem1 {

	@Override
	public long resolve(int value) {
		long result = 0L;
        
        for (int i = 0; i < value; i++) {
            if( i % 3 == 0 || i % 5 == 0){
                result = result + i;
            }
        }
        return result;
	}

}
