package common;

public class Node {
    private Node left;
    private int value;
    private Node right;

    public Node(Node left, int value, Node right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void printlnValue() {
        System.out.println(value);
    }

    public void printValue() {
        System.out.print(value);
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
