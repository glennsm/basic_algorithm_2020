package Tree;

import common.Node;
import common.Tree;

/**
 * 어떤 이진검색트리에서 두 노드값의 가장 가까이에 있는 공통조상을 찾는 문제
 */
public class 가장가까운공통조상 {
    public static void main(String[] args) {
        Tree tree = init();
        int v1 = 4;
        int v2 = 22;

        Node target = findAncestor(tree.getRoot(), v1, v2);
        target.printlnValue();
    }

    public static Node findAncestor(Node root, int v1, int v2) {
        if (root == null) return null;
        while (root != null) {
            int value = root.getValue();
            if (v1 < value && v2 < value) {
                root = root.getLeft();
            } else if (v1 > value && v2 > value) {
                root = root.getRight();
            } else {
                return root;
            }
        }
        return null;
    }

    public static Tree init() {
        Tree tree = new Tree();
        Node n41 = tree.createNode(null, 10, null);
        Node n42 = tree.createNode(null, 14, null);
        Node n31 = tree.createNode(null, 4, null);
        Node n32 = tree.createNode(n41, 12, n42);
        Node n21 = tree.createNode(n31, 8, n32);
        Node n22 = tree.createNode(null, 22, null);
        Node n1 = tree.createNode(n21, 20, n22);
        tree.setRoot(n1);
        return tree;
    }
}
