import java.util.*;
/**
   A Node stack that implements StackInterface.
   @author Drue Hidalgo
*/

public final class NodeStack<T> implements StackInterface<T>
{
	private Node topNode;
	private boolean initialized = false;
	
	public NodeStack()
	{
		topNode = null;
		initialized = true;
	}
	
	/** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
	public void push(T newEntry)
	{
		checkInitialized();
		top = new Node<T>(newEntry, top);
	}

	/** Removes and returns this stack's top entry.
		@return  The object at the top of the stack.
		@throws  EmptyStackException if the stack is empty before the operation. */
	public T pop()
	{
		checkInitialization();
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			T tempTop = peek();
			top = top.getNext();
			return tempTop;
		}
	}

	/** Retrieves this stack's top entry.
		@return  The object at the top of the stack.
		@throws  EmptyStackException if the stack is empty. */
	public T peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			return (T)top.getData();
		}
	}

	/** Detects whether this stack is empty.
		@return  True if the stack is empty. */
	public boolean isEmpty()
	{
		return top == null;
	}

	/** Removes all entries from this stack. */
	public void clear()
	{
		return top == null;
	}

	private void checkInitialization()
	{
	    if(!initialized)
		{
			throw new SecurityException("Not initialized properly.");
		}
	}
}
	
class Node<T>
{
	private T data;
	private Node<T> next;
		
	public Node(T newData, Node<T> n)
	{
		data = newData;
		next = n;
	}
		
	public void setData(T entry)
	{
		data = entry;
	}
		
	public void setNext(Node<T> n)
	{
		next = n;
	}

	public T getData()
	{
		return data;
	}
	
	public  Node<T> getNext()
	{
		return next;
	}
}