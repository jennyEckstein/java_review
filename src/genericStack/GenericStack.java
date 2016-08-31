package genericStack;

import java.util.ArrayList;

public class GenericStack<E> {
	
	private ArrayList <E> list;
	
	public GenericStack(){
		this.list = new ArrayList<E>();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public E peek(){
		return list.get(getSize()-1);
	}
	
	public void push(E object){
		list.add(object);
	}
	
	public E pop(){
		E object = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return object;
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "Stack: " + list.toString();
	}

	
}
