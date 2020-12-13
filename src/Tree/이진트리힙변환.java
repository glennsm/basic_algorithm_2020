package Tree;

import common.Node;
import common.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 이진트리힙변환 {
    public static void main(String[] args) {
        Tree tree = init();
        Node root = tree.getRoot();
        System.out.println("기존트리");
        tree.printByBfs(root);

        int size = traverse(root, 0, null);
        Node[] arrNode = new Node[size];
        traverse(root, 0, arrNode);

//        Arrays.sort(arrNode, new Comparator<Node>() {
//            @Override
//            public int compare(Node m, Node n) {
//                int mv = m.getValue(), nv = n.getValue();
//                if (mv < nv) {
//                    return -1;
//                } else if (mv == nv) {
//                    return 0;
//                } else {
//                    return 1;
//                }
//            }
//        });

        Arrays.sort(arrNode, (m, n) -> {
            int mv = m.getValue(), nv = n.getValue();
            if (mv < nv) {
                return -1;
            } else if (mv == nv) {
                return 0;
            } else {
                return 1;
            }
        });

        for (int i = 0; i < size; i++) {
            int left = 2 * i + 1;
            int right = left + 1;
            arrNode[i].setLeft(left >= size ? null : arrNode[left]);
            arrNode[i].setRight(right >= size ? null : arrNode[right]);
        }
        System.out.println("\n정렬트리");
        printByBfs(arrNode[0]);
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

    private static int traverse(Node node, int count, Node[] arr) {
        if (node == null)
            return count;
        if (arr != null) {
            arr[count] = node;
        }
        count++;
        count = traverse(node.getLeft(), count, arr);
        count = traverse(node.getRight(), count, arr);
        return count;
    }

    private static void printByBfs(Node root) {
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
}
