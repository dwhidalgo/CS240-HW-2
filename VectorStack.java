import java.util.*;
/**
   A Vector stack that implements StackInterface.
   @author Drue Hidalgo
*/

public final class VectorStack<T> implements StackInterface<T>
{
	private boolean initialized = false;
	Vector<T> vec;
	
	public VectorStack()
	{
		vec = new Vector<T>();
		initialized = true;
	}
	
	/** Adds a new entry to the top of this stack.
		@param newEntry  An object to be added to the stack. */
	public void push(T newEntry)
	{
		checkInitialization();
		vec.add(newEntry);
	}
	
	/** Removes and returns this stack's top entry.
		@return  The object at the top of the stack. 
		@throws  EmptyStackException if the stack is empty before the operation. */
	public T pop()
	{
		checkInitialization();
		if(vec.isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			T item = vec.get(vec.size());
			vec.remove(value);
			return item;
		}
	}
	
	/** Retrieves this stack's top entry.
		@return  The object at the top of the stack.
		@throws  EmptyStackException if the stack is empty. */
	public T peek()
	{
		checkInitialization();
		return vec.get(vec.size());
	}
	
	 /** Detects whether this stack is empty.
		@return  True if the stack is empty. */
	public boolean isEmpty()
	{
		return vec.isEmpty();
	}
	
	 /** Removes all entries from this stack. */
	 public void clear()
	{
		vec.removeAllElements();
	}
	
	private void checkInitialization()
	{
		if(!initialized)
		{
			throw new SecurityException("Not initialized properly.");
		}
	}
}	