package common;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node createNode(Node left, int value, Node right) {
        return new Node(left, value, right);
    }

    public static void preOrder(Node root) {
        if (root == null) return;
        root.printlnValue();
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void inOrder(Node root) {
        if (root == null) return;
        preOrder(root.getLeft());
        root.printlnValue();
        preOrder(root.getRight());
    }

    public static void postOrder(Node root) {
        if (root == null) return;
        preOrder(root.getLeft());
        preOrder(root.getRight());
        root.printlnValue();
    }

    public static void printByBfs(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            n.printValue();
            System.out.print(", ");
            if (n.getLeft() != null)
                q.add(n.getLeft());
            if (n.getRight() != null)
                q.add(n.getRight());
        }
    }

    Node findNode(Node node, int value) {
        if (node == null) return null;
        int cur = node.getValue();
        if (cur == value) return node;
        if (cur < value) {
            return findNode(node.getRight(), value);
        } else {
            return findNode(node.getLeft(), value);
        }
    }
}
