import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import LinkedList.LinkedList;
import Node.Node;

public class Main {
    public static void main(String[] args) {

        String fileToRead = "halloween calories.txt";
        // First to last.
        LinkedList ftl = new LinkedList();

        // Last to first.
        LinkedList ltf = new LinkedList();

        // Read the file and populate both linked lists, print error if occurs.
        try (BufferedReader br = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            while ((line = br.readLine()) != null) {
                ftl.AddTail(line);
                ltf.AddHead(line);
            }
        } catch (IOException error) {
            error.printStackTrace();
        }

        // Display the lists.
        System.out.println(ftl.ToList());
        System.out.println(ltf.ToList());
    }
}
