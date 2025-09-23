// Decalre the package.


// Define the LinkedList class.
public class LinkedList {
    // Define the Node class.
    private class Node {
        // Holds the next node in the list
        public Node next;

        // Holds the value of the node.
        public String Value;
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
        Node newNode = new Node();
        newNode.Value = value;
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    // Add a new node at the tail of the list.
    public void AddTail(String value) {
        Node newNode = new Node();
        newNode.Value = value;
        if (Tail == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.next = newNode;
            Tail = newNode;
        }
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
            sb.append(count).append(": ").append(current.Value).append('\n');
            current = current.next;
            count++;
        }

        return sb.toString();
    }
}