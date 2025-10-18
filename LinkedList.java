// Define the LinkedList class.
public class LinkedList {
    // Define the Node class.
    private class Node {
        // Holds the next node in the list
        public Node Next;

        // Holds the key/value of the node.
        public String Key;
        public String Value;

        // Constructor to initialize an string entry for node.
        public Node(String entry) {
            String[] pair = entry.split(":");
            this.Key = pair[0].trim();
            this.Value = pair[1].trim();
        }
        // Constructor to initialize the node with key and value.
        public Node(String key, String value) {
            this.Key = key;
            this.Value = value;
        }
        
        public Node(KeyValue kv) {
            this.Key = kv.key;
            this.Value = kv.value;
        }

    }

    // Pointers to the head and tail of the list.
    private Node Head;
    private Node Tail;

    // About me.
    public String About() {
        return "Mark is 37 years old, is married, and has a dog.";
    }

    // Add a new node at the head of the list.
    public void AddHead(String value) {
        Node newNode = new Node(value);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.Next = Head;
            Head = newNode;
        }
    }
    void AddHead(KeyValue entry) {
        Node newNode = new Node(entry);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.Next = Head;
            Head = newNode;
        }
    }

    // Add a new node at the tail of the list.
    public void AddTail(String value) {
        Node newNode = new Node(value);
        if (Tail == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.Next = newNode;
            Tail = newNode;
        }
    }

    public void AddTail(KeyValue entry) {
        Node newNode = new Node(entry);
        if (Tail == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.Next = newNode;
            Tail = newNode;
        }
    }

     public KeyValue RemoveHead() {
        if (Head == null) return null;           // empty

        KeyValue result = new KeyValue(Head.Key, Head.Value);

        if (Head == Tail) {                      // one node
            Head = null;
            Tail = null;
        } else {                                 // 2+ nodes
            Head = Head.Next;
        }
        return result;
    }

    // Check if the list is empty.
    public boolean IsEmpty() {
        return Head == null;
    }
    // Convert the linked list to a string representation.
    public String ToList() {
        StringBuilder sb = new StringBuilder();

        // Start at 1 the head.
        int count = 1;
        Node current = Head;

        // Traverse the list.
        while (current != null) {
            sb.append(current.Key).append(": ").append(current.Value).append('\n');
            current = current.Next;
            count++;
        }

        return sb.toString();
    }
}