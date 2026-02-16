/*
Task 3: Search for element 40 and 100 in the BST 
*/
// Task 3: BST Search Operation

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

    // Insert method (to build BST)
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

    // Search method
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
}

public class BSTTask3 {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] elements = {50, 30, 70, 20, 40, 60, 80};

        for (int element : elements) {
            bst.root = bst.insert(bst.root, element);
        }

        // Searching elements
        System.out.println("Search 40: " + bst.search(bst.root, 40));
        System.out.println("Search 100: " + bst.search(bst.root, 100));
    }
}

/*
Output:
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> javac BSTTask3.java
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> java BSTTask3      
Search 40: true
Search 100: false
*/