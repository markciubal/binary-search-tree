
public class Queue {
    private LinkedList list = new LinkedList();
    public void Enqueue(KeyValue item) { 
        list.AddTail(item); 
    }
    public KeyValue Dequeue() { 
        return list.RemoveHead(); 
    }
    public boolean IsEmpty() { 
        return list.IsEmpty(); 
    }
    public String ToList() { 
        return list.ToList(); 
    }
}