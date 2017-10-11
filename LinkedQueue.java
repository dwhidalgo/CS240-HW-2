import java.util.*;
/**
   A Linked Queue that implements StackInterface.
   @author Drue Hidalgo
*/

public class LinkedQueue<T> implements QueueInterface<T>
{
	private boolean initialized = false;
	private Node<T> front;
	private Node<T> back;
	private Node<T> root;
	
	public LinkedQueue()
	{
		initialized = true;
		front = null;
		back = null;
		root = null;
	}
	
	/** Adds a new entry to the back of this queue.
		@param newEntry  An object to be added. */
	public void enqueue(T newEntry)
	{
		checkInitialization();
		
		if (back == null)
		{
			Node<T> tempNode = new Node<T>(newEntry);
			tempNode.setNext(root);
			back = tempNode;
			front = tempNode;
		}
		else
		{
			Node<T> tempNode = new Node<T>(newEntry);
			tempNode.setNext(back);
			back = newNode;
		}
	}
	
	/** Removes and returns the entry at the front of this queue.
		@return  The object at the front of the queue. 
		@throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue()
	{
		checkInitialization();
		
		if (back.getNext() == null)
		{
			T value = back.getValue();
			back = null;
			front = null;
			return value;
		}
		
		else
		{
			Node<T> node = back;
			while (node.getNext() != front)
			{
				node = node.getNext();
			}
			T value = node.getNext().getValue();
			node.setNext(root);
			front = node;
			
			return value;
		}
	}
	
	/**  Retrieves the entry at the front of this queue.
		@return  The object at the front of the queue.
		@throws  EmptyQueueException if the queue is empty. */
	public T getFront() throws EmptyQueueException
	{
		if (isEmpty())
		{
			throw new EmptyQueueException("Nothing in queue.");
		}
		
		return front.getValue();
	}
  
	/** Detects whether this queue is empty.
		@return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty()
	{
		return back == null;
	}
  
	/** Removes all entries from this queue. */
	public void clear()
	{
		front = null;
		back = null;
		root = null;
	}
}