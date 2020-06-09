import java.util.*;
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class GfG {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends


/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
	    QueueNode newNode = new QueueNode(a);
	    if(front == null){
	        front = rear = newNode;
	        return;
	    }
        rear.next = newNode;
        rear = newNode;
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
	    if (front == null) 
            return -1;
        else{
            int item = front.data;
            front = front.next;
            return item;
        }
	}
}




