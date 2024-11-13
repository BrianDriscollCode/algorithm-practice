package DataStructures;

public class Tree<T> {
    public TreeNode<T> root;

    public static class TreeNode<T>
    {
        public TreeNode<T> right;
        public TreeNode<T> left;
        public T data;

        public TreeNode(T data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }

        public void insertLeft(T value)
        {
            this.left = new TreeNode(value);
        }

        public void insertRight(T value)
        {
            this.right = new TreeNode(value);
        }
    }

    public Tree(T rootValue)
    {
        root = new TreeNode(rootValue);
    }

    // Method to print the tree structure
    public void printTree() {
        printTree(root, 0);
    }

    // Recursive helper method to print each level of the tree with indentation
    private void printTree(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        // Print the right subtree first, so it appears at the top
        printTree(node.right, level + 1);

        // Print the current node with indentation based on the level
        for (int i = 0; i < level; i++) {
            System.out.print("    "); // 4 spaces per level
        }
        System.out.println(node.data);

        // Print the left subtree
        printTree(node.left, level + 1);
    }


}
