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
            }
        } catch (IOException error) {
            error.printStackTrace();
        }

        // Display the lists.
        System.out.println(listTail.ToList());
        System.out.println(listHead.ToList());
    }
}
