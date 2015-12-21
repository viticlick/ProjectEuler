package eu.viticlick.projecteuler.problem1;

import eu.viticlick.projecteuler.problem1.strategy.LinearStrategy;
import eu.viticlick.projecteuler.problem1.strategy.StrategyProblem1;
import eu.viticlick.projecteuler.problem1.strategy.StreamStrategy;

/**
 *
 * @author viticlick
 *
 */
public class Problem1 {

	private StrategyProblem1 strategy;
	
    public static void main(String[] args) {
        if( args.length > 0 ){
            int value = Integer.parseInt(args[0]);
            Problem1 problem = new Problem1();
            System.out.println(problem.result(value));
        }
    }

    public Problem1(){
    	this.strategy = new LinearStrategy();
    }
    
    public Problem1(StrategyProblem1 strategy){
    	this.strategy = strategy;
    }
    
    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     * @return the sum of all the multiples of 3 or 5 below 1000
     * @see <a href="https://projecteuler.net/problem=1">Project Euler</a>
     */
    public long result(int naturalValue){
        checkInput(naturalValue);
        return this.strategy.resolve(naturalValue);
    }
    
    private static void checkInput(int value){
        if( value <= 0 ){
            throw new IllegalArgumentException("The value must be a natural number");
        }
    }
    
}
