package deep_vs_shallow_copy;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


class Student implements Cloneable{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	/**
	 * clone() method is unstable and may lead to data sharing
	 * not recommended for use. Instead should use copy constructor
	 */
	@Override
	public Student clone() throws CloneNotSupportedException{
		return (Student) super.clone();
	}
	
}

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
	
	public void copyArrayList(){
		List<Integer> list = new ArrayList<>();
		List<Integer> copy = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.copy(list, copy);
				
		
		System.out.println("Copy Array:");
		System.out.println(copy.toString() + " = " + list.toString());
	}
	
	
	public static void main (String [] args){
		Deep_Vs_Shallow_Copy copy = new Deep_Vs_Shallow_Copy();
		
		copy.shallowArray();
		copy.deepArray();
		copy.copyArrayList();
		
		Student s1 = new Student(1, "Daisy");
		Student s2;
		try {
			s2 = (Student) s1.clone();
			System.out.println("Objects: " + s1 + " = " + s2);
			System.out.println("Actual Values: " + s1.id + " = " + s2.id + " " + s1.name + " = " + s2.name);
			s1.id = 3;
			s1.name = "Sam";
			
			System.out.println("Actual Values: " + s1.id + " = " + s2.id + " " + s1.name + " = " + s2.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
