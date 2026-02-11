# ACTIVITY 2: Advanced Stack Applications  
## Part A: Application-Based Questions  

---

## 1. Explain how stack is used in function calls (Call Stack)

When a function is called in a program, its execution details such as local variables, parameters, and return address are stored in memory. This memory structure is known as the **Call Stack**.

- Each function call is **pushed** onto the stack.
- When the function execution is completed, it is **popped** from the stack.
- The stack follows the **LIFO (Last In First Out)** principle.

### Example:
If `main()` calls `A()` and `A()` calls `B()`, the stack will look like:

```

| B() |
| A() |
| main() |

```

When `B()` finishes execution, it is removed first from the stack.

---

## 2. How is stack used in Undo/Redo operations?

Stacks are widely used in applications like text editors for implementing **Undo** and **Redo** functionality.

- Two stacks are maintained:
  - **Undo Stack**
  - **Redo Stack**
- When a new action is performed, it is pushed onto the **Undo stack**.
- When Undo is clicked:
  - The last action is popped from the Undo stack.
  - It is pushed onto the Redo stack.
- When Redo is clicked:
  - The last undone action is popped from the Redo stack.
  - It is pushed back to the Undo stack.

This ensures actions are reversed in LIFO order.

---

## 3. Why is stack useful in expression evaluation?

Stack is very useful in expression handling because:

- It helps in checking **balanced parentheses**.
- It manages **operator precedence**.
- It is used to convert:
  - Infix → Postfix
  - Infix → Prefix
- It is used to evaluate **Postfix and Prefix expressions**.

The LIFO nature of stack makes it ideal for handling nested expressions and maintaining correct order of operations.

---

## 4. Differentiate between Infix, Prefix, and Postfix expressions

| Expression Type | Format      | Example | Evaluation Direction | Notes |
|-----------------|------------|---------|----------------------|-------|
| **Infix**       | A + B      | A+B     | Based on precedence  | Most common human-readable form |
| **Prefix**      | + A B      | +AB     | Right to Left        | Operator before operands |
| **Postfix**     | A B +      | AB+     | Left to Right        | Operator after operands |

### Key Difference:
- **Infix** requires precedence rules and parentheses.
- **Prefix and Postfix** do not require parentheses for evaluation.
```
