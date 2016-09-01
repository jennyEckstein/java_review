package deep_vs_shallow_copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deep_Vs_Shallow_Copy {

	/*
	 * If you simply assign one array to another,
	 * the copy array will simply reference the array.
	 * If you attempt to modify any element on the copy, 
	 * the data will be corrupted
	 */
	public void shallowArray(){
		int [] array = {1,2,3};
		int [] arrayCopy = array;
		
		System.out.println("Shallow Copy: ");
		System.out.println(array.toString() + " = " + arrayCopy.toString());
		
		arrayCopy[0] = 6;
		
		System.out.println(array[0] + " = " + arrayCopy[0]);
	}
	
	public void deepArray(){
		int [] array = {1, 2 , 3};
		int [] copy = new int [array.length];
		
		for (int i = 0; i < copy.length; i++){
			copy[i] = array[i];
		}
		System.out.println("Deep Copy: ");
		System.out.println(array.toString() + " != " + copy.toString());
		
		copy[0] = 6;
		
		System.out.println(array[0] + " != " + copy[0]);
		
	}
	
	public static void main (String [] args){
		Deep_Vs_Shallow_Copy copy = new Deep_Vs_Shallow_Copy();
		
		copy.shallowArray();
		copy.deepArray();
	}
}
