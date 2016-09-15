package lambdas;

import java.util.Arrays;

public class Lambdas {

	public static void printArrayUsingLambdas(){
		Arrays.asList(1,2,3).forEach(e -> System.out.println(e));
	}
	
	public static void sortArrayUsingLambdas(){
		Arrays.asList(4,6,2,15,2,0,9,3).sort((e1, e2) -> e1.compareTo(e2));
	}
	
	public static void main(String [] args){
		printArrayUsingLambdas();
	}
}
