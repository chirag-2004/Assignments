## 2. Part 1 – Concept Analysis

### ArrayList vs LinkedList Comparison

| Feature | ArrayList | LinkedList |
|-----------|------------|-------------|
| Internal Structure | Dynamic array | Doubly linked list |
| Access Time Complexity | O(1) (fast random access) | O(n) (sequential access) |
| Insertion Time Complexity | O(n) (shifting required) | O(1) at beginning/end |
| Deletion Time Complexity | O(n) (shifting required) | O(1) after locating node |
| Memory Usage | Less memory | More memory (extra node pointers) |

---

### Choose Correct Data Structure

1. **Student record system → ArrayList**  
   *(Frequent access using index)*

2. **Browser history → LinkedList**  
   *(Frequent insertions and deletions)*

3. **Online shopping cart → ArrayList**  
   *(Fast access and iteration)*

4. **Undo/Redo feature → LinkedList**  
   *(Frequent additions and removals)*
