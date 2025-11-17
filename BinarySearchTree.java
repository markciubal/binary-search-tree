public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public String about() {
        return "Binary Search Tree implementation by Mark Ciubal.";
    }

    public void add(KeyValue insert) {
        if (root == null) {
            root = new Node(insert);
        } else {
            root.add(insert);
        }
    }

    public String toASCII() {
        if (root == null) return "";
        return root.toASCII(0);
    }

    public String toInfix() {
        if (root == null) return "";
        return root.toInfix();
    }

    private class Node {
        public KeyValue data;
        public Node left;
        public Node right;

        public Node(KeyValue data) {
            this.data = data;
        }

        public void add(KeyValue insert) {

            // Convert key Strings to integers
            int insertKey = Integer.parseInt(insert.key);
            int thisKey   = Integer.parseInt(this.data.key);

            if (insertKey < thisKey) {
                if (left == null) {
                    left = new Node(insert);
                } else {
                    left.add(insert);
                }
            }
            else if (insertKey > thisKey) {
                if (right == null) {
                    right = new Node(insert);
                } else {
                    right.add(insert);
                }
            }
        }

        public String toASCII(int indent) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < indent * 3; i++) {
                result.append(' ');
            }

            result.append("+--- (")
                  .append(data.key)
                  .append(") ")
                  .append(data.value)
                  .append("\n");

        if (left != null) {
            result.append(left.toASCII(indent + 1));
        }
        if (right != null) {
            result.append(right.toASCII(indent + 1));
        }

        public String toInfix() {
            StringBuilder result = new StringBuilder();

            if (left != null) result.append(left.toInfix());

            result.append(data.key)
                  .append(": ")
                  .append(data.value)
                  .append("\n");

            if (right != null) result.append(right.toInfix());

            return result.toString();
        }
    }
}