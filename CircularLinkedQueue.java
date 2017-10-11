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
	
	}
	
	/** Removes and returns the entry at the front of this queue.
      @return  The object at the front of the queue. 
      @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue()
	{
		
	}
  
	/**  Retrieves the entry at the front of this queue.
      @return  The object at the front of the queue.
      @throws  EmptyQueueException if the queue is empty. */
	public T getFront()
	{
		
	}
  
	/** Detects whether this queue is empty.
      @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty()
	{
		
	}
	
	/** Removes all entries from this queue. */
	public void clear()
	{
		
	}
}