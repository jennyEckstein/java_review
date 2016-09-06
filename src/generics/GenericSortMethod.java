package generics;

public class GenericSortMethod {
	
	public static void main(String [] args){
		Integer[] integers = {new Integer(2), 
				new Integer(1),	new Integer(0)};
		Double[] doubles = {new Double(3.4), new Double(4.5),
				new Double(1.0), new Double(3.5)};
		String[] strings = {"Steven", "John", "Linda", "Sasha"};
		Character [] characters = {'s','e', 'a','l', 'j'};
		
		GenericSortMethod method = 
				new GenericSortMethod();
		method.sort(integers);
		method.sort(doubles);
		method.sort(characters);
		method.sort(strings);
		
		method.print(integers);
		method.print(doubles);
		method.print(characters);
		method.print(strings);
	
	}
	
	public <E extends Comparable<E>> void sort(E[] list){
		E currentMin;
		int currentMinIndex;
		
		for (int i = 0; i < list.length - 1; i++){
			currentMin = list[i];
			currentMinIndex = i;
			
			for(int j = i + 1; j < list.length; j++){
				if(currentMin.compareTo(list[j]) > 0){
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public <E> void print(E[] list){
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i] + ", ");
		}
		System.out.println("\n");
	}

}
