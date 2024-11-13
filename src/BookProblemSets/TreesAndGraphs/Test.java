package BookProblemSets.TreesAndGraphs;

import DataStructures.Tree;

public class Test {

    public static void main(String[] args)
    {
        Tree<Integer> tree = new Tree<>(1);

        tree.root.insertLeft(2);
        tree.root.insertRight(3);
        tree.root.left.insertLeft(4);
        tree.root.left.insertRight(5);
        tree.root.right.insertLeft(6);
        tree.root.right.insertRight(7);

        tree.printTree();
        preOrderTraversal(tree.root);
    }

    public static void inOrderTraversal(Tree.TreeNode node)
    {
        if (node == null) {
            return;
        }

        // Traverse left subtree
        inOrderTraversal(node.left);

        // Visit the current node
        System.out.print(node.data + " ");

        // Traverse right subtree
        inOrderTraversal(node.right);
    }

    public static void preOrderTraversal(Tree.TreeNode node)
    {
        if (node == null)
        {
            return;
        }

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Tree.TreeNode node)
    {
        if (node == null)
        {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}
