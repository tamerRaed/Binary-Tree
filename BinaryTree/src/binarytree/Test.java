package binarytree;

public class Test {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> parent = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> ch1 = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> ch2 = new BinaryTreeNode<Integer>(3);
        BinaryTreeNode<Integer> ch1_1 = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> ch2_1 = new BinaryTreeNode<Integer>(5);

        BinaryTreeTraversal b_tree = new BinaryTreeTraversal();

        parent.addLeftChild(ch1);
        parent.addRightChild(ch2);

        ch1.addLeftChild(ch1_1);
        ch1.addRightChild(ch2_1);
        System.out.print("In Order Traversal: ");
        b_tree.inorderTraversal(parent);
        System.out.println();
        System.out.print("Pre Order Traversal: ");
        b_tree.preorderTraversal(parent);
        System.out.println();
        System.out.print("Post Order Traversal: ");
        b_tree.postorderTraversal(parent);
        System.out.println();
        System.out.print("Level Order Traversal: ");
        b_tree.levelOrderTraversal(parent);
    }
}
