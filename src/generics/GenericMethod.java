package generics;

public class GenericMethod {
	public static void main(String [] args){
		Integer [] integers = {1,2,3,4,5};
		String [] strings = {"New York", "Paris", "London", "Istambul"};
		GenericMethod method = new GenericMethod();
		method.print(integers);
		method.print(strings);
	}
	/*
	 * you can declare generic method as a sub-type
	 * public <E extends GeometricObj> boolean equalArea(){}
	 */
	public <E> void print(E[] list){
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println("-------");
	}

}
