/*
Task 1: Create a Binary Search Tree and Insert Elements
Elements to insert: 50, 30, 70, 20, 40, 60, 80
*/

// Task 1: BST Insertion

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

    // Insert method
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }
}

public class BSTTask1 {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] elements = {50, 30, 70, 20, 40, 60, 80};

        for (int element : elements) {
            bst.root = bst.insert(bst.root, element);
        }

        System.out.println("Elements inserted successfully into BST.");
    }
}



/*

Output:
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> javac BSTTask1.java 
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> java BSTTask1      
Elements inserted successfully into BST.

*/
