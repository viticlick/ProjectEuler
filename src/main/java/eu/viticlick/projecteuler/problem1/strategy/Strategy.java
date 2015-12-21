package eu.viticlick.projecteuler.problem1.strategy;

public enum Strategy {
		LINEAR {
			@Override
			public StrategyProblem1 getStrategy() {
				return new LinearStrategy();
			}
		},
		STREAM {
			@Override
			public StrategyProblem1 getStrategy() {
				return new StreamStrategy();
			}
		};

	public abstract StrategyProblem1 getStrategy();
}
