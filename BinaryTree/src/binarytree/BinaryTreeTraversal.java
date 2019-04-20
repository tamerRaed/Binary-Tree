package binarytree;

public class BinaryTreeTraversal {

    public void inorderTraversal(BinaryTreeNode r) {
        if (r == null) {
            return;
        }

        inorderTraversal(r.getLeft());
        System.out.print(r.getData() + "  ");
        inorderTraversal(r.getRight());
    }

    public void preorderTraversal(BinaryTreeNode r) {
        if (r == null) {
            return;
        }
        System.out.print(r.getData() + "  ");
        preorderTraversal(r.getLeft());
        preorderTraversal(r.getRight());
    }

    public void postorderTraversal(BinaryTreeNode r) {
        if (r == null) {
            return;
        }
        postorderTraversal(r.getLeft());
        postorderTraversal(r.getRight());
        System.out.print(r.getData() + "  ");
    }

    private int height(BinaryTreeNode r) {
        if (r == null) {
            return 0;
        }
        int leftHeight = height(r.getLeft());
        int rightHeight = height(r.getRight());
        if (leftHeight > rightHeight) {
            return (leftHeight + 1);
        } else {
            return (rightHeight + 1);
        }
    }

    private void printLevel(BinaryTreeNode r, int level) {
        if (r == null) {
            return;
        }
        if (level == 1) {
            System.out.print(r.getData() + "  ");
        } else if (level > 1) {
            printLevel(r.getLeft(), level - 1);
            printLevel(r.getRight(), level - 1);
        }
    }

    public void levelOrderTraversal(BinaryTreeNode root) {
        int h = this.height(root);

        for (int i = 0; i < h; i++) {
            printLevel(root, i + 1);
        }

    }
}
