package core;

import org.junit.jupiter.api.Assertions;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {

	public void testCreateNewEmptyStack() {
        Stack s1 = new Stack();
        int size = s1.getSize();

        assertEquals(0, size);
        boolean empty = s1.isEmpty();
        assertTrue(empty);
	}
    public void testPushElmToTop() {
        Stack s1 = new Stack();
        s1.push(1);
        int size = s1.getSize();

        assertEquals(1, size);
        boolean empty = s1.isEmpty();
        assertFalse(empty);
    }
    
    public void testPushDifferentTypeElement() {
	    Stack s1 = new Stack();
	    s1.push(1); // Push an Integer
	    try {
	    	s1.push((Integer) Integer.parseInt("string")); // Try pushing a String (Casting explicitly to Object)
	        fail("Expected an Exception to be thrown");
	    } catch (NumberFormatException e) {
	        assertEquals("For input string: \"string\"", e.getMessage());
	    }
	}
}
