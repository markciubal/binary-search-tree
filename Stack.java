
public class Stack {
    private LinkedList list = new LinkedList();
    public void Push(KeyValue item) { 
        list.AddHead(item); 
    }
    public KeyValue Pop() { 
        return list.RemoveHead(); 
    }
    public boolean IsEmpty() { 
        return list.IsEmpty(); 
    }
    public String ToList() { 
        return list.ToList(); }
}