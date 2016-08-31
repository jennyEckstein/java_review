package genericStack;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGenericStack {
	
	private GenericStack<String> stack;	
	private GenericStack<Integer> numericStack;

	@Before
	public void setUp() throws Exception {
		this.stack = new GenericStack<>();
		this.numericStack = new GenericStack<>();

		stack.push("Java");
		stack.push("C++");
		stack.push("Python");
		
		numericStack.push(1);
		numericStack.push(2);
		numericStack.push(3);
	}

	@After
	public void tearDown() throws Exception {
		this.stack = null;
	}

	@Test
	public void testSize() {		
		Assert.assertTrue(stack.getSize() == 3);
	}

	@Test
	public void testPop(){
		String langOnTop = stack.pop();
		Assert.assertEquals("Python", langOnTop);
	}
	
	@Test
	public void testPeek(){
		stack.pop();
		String secondToTop = stack.peek();
		Assert.assertEquals("C++", secondToTop);
		
		numericStack.pop();
		int secondToTop_numeric = numericStack.peek(); 
		Assert.assertTrue(2 == secondToTop_numeric);
	}
	
}
