/*Task 2: Perform Inorder, Preorder, and Postorder Traversals*/

// Task 2: BST Traversals

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Insert method (needed to build BST)
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal (Root, Left, Right)
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class BSTTask2 {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] elements = {50, 30, 70, 20, 40, 60, 80};

        for (int element : elements) {
            bst.root = bst.insert(bst.root, element);
        }

        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);

        System.out.println("\nPreorder Traversal:");
        bst.preorder(bst.root);

        System.out.println("\nPostorder Traversal:");
        bst.postorder(bst.root);
    }
}

/*

Output:
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> javac BSTTask2.java
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> java BSTTask2
Inorder Traversal:
20 30 40 50 60 70 80
Preorder Traversal:
50 30 20 40 70 60 80
Postorder Traversal:
20 40 30 60 80 70 50

*/