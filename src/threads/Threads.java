package threads;

import java.lang.Thread.State;

public class Threads {
	
	public static void main (String [] args){
	
		printThreadInfo();
		NewThread newThread = new NewThread("NewThread");
		newThread.run();
		printThreadInfo();
	}
	
	static void printThreadInfo(){
		/**
		 * Thread States:
		 * New
		 * Runnable
		 * Blocked
		 * Waiting
		 * Timed_Waiting
		 * Terminated
		 */
		
		/*You can get id of the main thread*/
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		State state = Thread.currentThread().getState();
		String threadGroupName = Thread.currentThread().getThreadGroup().getName();
		
		System.out.println(
				"ID: " + id + 
				"\nName: " + name + 
				"\nPriority: " + priority + 
				"\nState: " + state + 
				"\nThread Group Name: " + threadGroupName
				);
	}
	
	static class NewThread extends Thread{
		public NewThread(String name){
			super(name);
		}
		@Override
		public void run(){
			System.out.println("Executing Thread " + Thread.currentThread().getName());
		}
		
	}

}
