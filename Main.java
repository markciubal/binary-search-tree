import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Main class for testing the BinarySearchTree implementation.
public class Main {
    public static void main(String[] args) {
        // Determine the file to read.
        String fileToRead = "";
        if (args.length > 0) {
            fileToRead = args[0];
        } else {
            fileToRead = "halloween calories.txt";
        }

        System.out.println("Reading from file: " + fileToRead);

        // Initialize the Binary Search Tree.
        BinarySearchTree tree = new BinarySearchTree();

        // Read the file and populate the Binary Search Tree, print error if occurs.
        try (BufferedReader br = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip empty lines if any.
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Assumes KeyValue(String line) parses "key: value"
                KeyValue kv = new KeyValue(line);
                tree.add(kv);
            }
        } catch (IOException error) {
            error.printStackTrace();
        }

        // Optional: Print info about the author.
        System.out.println("\nAbout this tree:");
        System.out.println(tree.about());

        // Display the ASCII tree structure.
        System.out.println("\nASCII Tree...");
        System.out.println(tree.toASCII());

        // Display the infix (sorted) listing of items.
        System.out.println("\nInfix (sorted by key)...");
        System.out.println(tree.toInfix());
    }
}
