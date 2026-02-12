## Viva Questions (Answers)

### 1. Why is ArrayList access faster?
Because elements are stored in contiguous memory and accessed directly using an index.

### 2. Why does LinkedList consume more memory?
Each node stores data along with reference(s) to the next node (and previous node in a doubly linked list).

### 3. What is the time complexity of insertion at the beginning in SLL?
O(1)

### 4. Difference between singly and doubly linked list?
A singly linked list has one pointer (next), while a doubly linked list has two pointers (next and previous).

### 5. What is RandomAccess interface?
A marker interface indicating that a list supports fast random access. ArrayList implements this interface.
