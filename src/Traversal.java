import common.Node;
import common.Tree;

public class Traversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node n43 = tree.createNode(null, 110, null);
        Node n31 = tree.createNode(null, 25, null);
        Node n32 = tree.createNode(null, 75, null);
        Node n33 = tree.createNode(n43, 125, null);
        Node n34 = tree.createNode(null, 175, null);
        Node n21 = tree.createNode(n31, 50, n32);
        Node n22 = tree.createNode(n33, 150, n34);
        Node n1 = tree.createNode(n21, 100, n22);
        tree.setRoot(n1);

        tree.preOrder(n1);
        tree.inOrder(n1);
        tree.postOrder(n1);
//        tree.findNode(n1, 75);
    }

}

