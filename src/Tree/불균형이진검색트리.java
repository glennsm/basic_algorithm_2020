package Tree;

import common.Node;
import common.Tree;

import java.util.stream.DoubleStream;

/**
 * 왼쪽 서브 트리가 오른쪽 서브 트리보다 노드 수가 더 많은 불균현 이진검색트가 있을때 이진검색트리속성은 그대로 유지하면서
 * 더 균형잡힌트리가 될 수 있도록 트리를 재구성하라.
 */
public class 불균형이진검색트리 {
    public static void main(String[] args) {
        Tree tree = init();
        System.out.println("기존트리");
        tree.printByBfs(tree.getRoot());

        System.out.println("\n변경트리");
        tree.setRoot(rotateRight(tree.getRoot()));
        tree.printByBfs(tree.getRoot());
    }

    public static Tree init() {
        Tree tree = new Tree();

        Node n41 = tree.createNode(null, 1, null);
        Node n42 = tree.createNode(null, 3, null);
        Node n31 = tree.createNode(n41, 2, n42);
        Node n32 = tree.createNode(null, 5, null);
        Node n21 = tree.createNode(n31, 4, n32);
        Node n22 = tree.createNode(null, 7, null);
        Node n1 = tree.createNode(n21, 6, n22);
        tree.setRoot(n1);
        return tree;
    }

    private static Node rotateRight(Node oldRoot) {
        Node newRoot = oldRoot.getLeft();
        oldRoot.setLeft(newRoot.getRight());
        newRoot.setRight(oldRoot);
        return newRoot;
    }

    private static Node rotateLeft(Node oldRoot) {
        Node newRoot = oldRoot.getRight();
        oldRoot.setRight(newRoot.getLeft());
        newRoot.setLeft(oldRoot);
        return newRoot;
    }
}
