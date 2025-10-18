import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Main class for testing the LinkedList implementation.
public class Main {
    public static void main(String[] args) {
        // Determine the file to read.
        String fileToRead = "";
        if (args.length > 0)
        {
            fileToRead = args[0];
        } else {
            fileToRead = "halloween calories.txt";
        }

        System.out.println("Reading from file: " + fileToRead);
        // Initialize the data structures.
        Queue queue = new Queue();

        // Stack implementation.
        Stack stack = new Stack();

        // First to last.
        LinkedList listTail = new LinkedList();

        // Last to first.
        LinkedList listHead = new LinkedList();

        // Read the file and populate both linked lists, print error if occurs.
        try (BufferedReader br = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            while ((line = br.readLine()) != null) {
                listTail.AddTail(line);
                listHead.AddHead(line);
                stack.Push(new KeyValue(line));
                queue.Enqueue(new KeyValue(line));
            }
        } catch (IOException error) {
            error.printStackTrace();
        }

        // Display the lists.
        System.out.println("\nList tail...");
        System.out.println(listTail.ToList());

        System.out.println("\nList head...");
        System.out.println(listHead.ToList());

        // Display queue.
        System.out.println("\nQueue...");
        System.out.print(queue.ToList());

        System.out.println("\nDequeue...");
        while (!queue.IsEmpty()) {
            KeyValue kv = queue.Dequeue();
            System.out.println(kv.key + ": " + kv.value);
        }

        System.out.println("\nStack...");
        System.out.print(stack.ToList());

        System.out.println("\nPop...");
        while (!stack.IsEmpty()) { 
            KeyValue kv = stack.Pop();
            System.out.println(kv.key + ": " + kv.value);
        }

        System.out.println("\nManual Enqueue/Push...");
        queue.Enqueue(new KeyValue("250", "Snickers"));
        queue.Enqueue(new KeyValue("220", "KitKat"));
        stack.Push(new KeyValue("230", "Twix"));
        stack.Push(new KeyValue("210", "Reese's"));

        System.out.println("\nQueue after manual addition...");                   // NEW
        System.out.print(queue.ToList());  

        System.out.println("\nStack after manual addition...");                   // NEW
        System.out.print(stack.ToList());  
        
        System.out.println("\nDequeue...");                           // NEW
        while (!queue.IsEmpty()) {                                                // NEW
            KeyValue kv = queue.Dequeue();                                        // NEW
            System.out.println(kv.key + ": " + kv.value);                         // NEW
        }
        
        System.out.println("\nPop...");                               // NEW
        while (!stack.IsEmpty()) {                                                // NEW
            KeyValue kv = stack.Pop();                                            // NEW
            System.out.println(kv.key + ": " + kv.value);                         // NEW
        }
    }
}
