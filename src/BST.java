public class BST {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    // INSERT
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // SEARCH
    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {

        if (root == null) return false;

        if (root.data == data) return true;

        if (data < root.data)
            return searchRec(root.left, data);

        return searchRec(root.right, data);
    }

    // INORDER (sorted)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {

        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // PREORDER
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {

        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // POSTORDER
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {

        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // FIND MIN
    public int findMin() {

        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // FIND MAX
    public int findMax() {

        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }
}
