package singlelyLinked;

public class Queue
{
    private Node front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    void enqueue(int key)
    {
        Node temp = new Node(key);

        if(this.rear == null)
        {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;

    }

    Node dequeue()
    {
        if(this.front == null)
        {
            return null;
        }

        Node temp = this.front;
        this.front = front.next;

        if(this.front == null)
        {
            this.rear = null;
        }

        return temp;
    }
}
