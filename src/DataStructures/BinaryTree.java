package DataStructures;

public class BinaryTree<T> {
    private TreeNode<T> root;

    public static class TreeNode<T>
    {
        public TreeNode<T> right;
        public TreeNode<T> left;
        public T data;

        public TreeNode(T data)
        {
            this.data = data;
        }
    }

    public void add(T data)
    {
        root = addRecursive(root, data);
    }

    private TreeNode<T> addRecursive(TreeNode<T> node, T data)
    {
        if (node == null)
        {
            return new TreeNode<T>(data);
        }

        if (node.left == null)
    }

}
