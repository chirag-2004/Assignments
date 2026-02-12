## Scenario Based Analysis

### 1. Real-time chat message storage → LinkedList

Messages are continuously added and removed.  
Insertion and deletion are efficient.

**Time Complexity**

- Insertion: O(1)  
- Deletion: O(1)  
- Access: O(n)

---

### 2. Music playlist where songs are frequently reordered → LinkedList

Frequent insertions and deletions in between the list are faster.

**Time Complexity**

- Insertion/Deletion: O(1) after locating node  
- Access: O(n)

---

### 3. Student database with frequent searching by index → ArrayList

Fast random access using index.

**Time Complexity**

- Access: O(1)  
- Insertion/Deletion: O(n)

---

### 4. Browser back and forward navigation → LinkedList

Frequent navigation and movement between nodes.

**Time Complexity**

- Insert/Delete: O(1)  
- Navigation: O(1)

---

### 5. Online exam system storing answers sequentially → ArrayList

Sequential storage and fast access by index.

**Time Complexity**

- Access: O(1)  
- Insertion at end: O(1) amortized
