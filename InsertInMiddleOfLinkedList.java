import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int x){
        if(head == null){
            head = new Node(x);
            return head;
        }
        else{
            Node newNode = new Node(x); 
  
            Node ptr = head; 
            int len = 0; 
  
            // calculate length of the linked list 
            //, i.e, the number of nodes 
            while (ptr != null) { 
                len++; 
                ptr = ptr.next; 
            } 
  
            // 'count' the number of nodes after which 
            // the new node is to be inserted 
            int count = ((len % 2) == 0) ? (len / 2) : 
                                        (len + 1) / 2; 
            ptr = head; 
  
            // 'ptr' points to the node after which  
            // the new node is to be inserted 
            while (count-- > 1) 
                ptr = ptr.next; 
  
            // insert the 'newNode' and adjust  
            // the required links 
            newNode.next = ptr.next; 
            ptr.next = newNode;
        }
        return head;
    }
}




