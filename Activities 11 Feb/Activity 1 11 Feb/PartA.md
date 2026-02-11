
## Conceptual Questions

### 1 Define Stack and explain LIFO principle

A **Stack** is a linear data structure in which insertion and deletion of elements take place from only one end called **TOP**.

Stack follows the **LIFO (Last In First Out)** principle.

The element inserted last is removed first.

**Example:**

If we push `10, 20, 30`  
Then pop → `30` will be removed first.

---

### 2 What is Stack Overflow and Stack Underflow?

#### 🔹 Stack Overflow
Occurs when we try to push an element into a stack that is already full.

**Condition:**
```

TOP == size - 1

```

#### 🔹 Stack Underflow
Occurs when we try to pop an element from an empty stack.

**Condition:**
```

TOP == -1

```

---

### 3 Real-life examples of Stack

- Stack of plates  
- Undo/Redo operation in MS Word  
- Browser back button history  
- Function call stack in programming  
- Books stacked one above another  

---

### 4 Time Complexity of Push and Pop

| Operation | Time Complexity |
|------------|----------------|
| Push       | O(1)           |
| Pop        | O(1)           |
| Peek       | O(1)           |

Because insertion and deletion happen only at the **TOP**.

