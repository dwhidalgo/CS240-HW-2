import java.util.*;
/**
   A Circular Linked Queue that implements StackInterface.
   @author Drue Hidalgo
*/

public class CircularLinkedQueue<T> implements QueueInterface<T>
{
	
	private boolean initialized = false;
	private Node<T> free;
	private Node<T> back;
	private int size;
	private final int MAX_SIZE = 10;
	
	public CircularLinkedQueue()
	{
		free = null;
		back = null;
		initialized = true;
		size = 0;
	}
	
	
	/** Adds a new entry to the back of this queue.
		@param newEntry  An object to be added. */
	public void enqueue(T newEntry)
	{
		checkInitialization();
		
		Node<T> tempNode = new Node<T>(newEntry, null);
		if(isEmpty())
		{
			front = tempNode;
		}
		else
		{
			back.setNext(newNode);
		}
		
		size++;
	}
	
	/** Removes and returns the entry at the front of this queue.
      @return  The object at the front of the queue. 
      @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue()
	{
		checkInitialization();
		
		if(isEmpty())
		{
			System.out.println("Empty.");
			return null;
		}
		T temp = front.getData();
		front = front.getNext();
		size--;
		return temp;
	}
  
	/**  Retrieves the entry at the front of this queue.
      @return  The object at the front of the queue.
      @throws  EmptyQueueException if the queue is empty. */
	public T getFront()
	{
		checkInitialization();
		
		return (T)front;
	}
  
	/** Detects whether this queue is empty.
      @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	/** Removes all entries from this queue. */
	public void clear()
	{
		checkInitialization();
		
		Node<T> n = front;
		for(int i=0; i<size; i++)
		{
			Node<T> temp = n;
			n = n.getNext();
			temp = null;
		}
	}
	
	private static class Node<T>
	{
		private T value;
		private Node<T> next;
		
		public Node(T v, Node<T> n)
		{
			value = v;
			next = n;
		}
		
		public T getvalue()
		{
			return value;
		}
		
		public Node<T> getNext()
		{
			return next;
		}
		
		public void setNext(Node<T> n)
		{
			next = n;
		}
	}
	
	private void checkInitialization()
	{
		if(!initialized)
		      throw new SecurityException("Not initialized properly.");
	}
}