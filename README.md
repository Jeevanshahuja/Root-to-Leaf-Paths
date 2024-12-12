## Problem Description  

Given the root of a binary tree, the task is to find all possible paths from the root node to each of the leaf nodes. Each path should be represented as a list of node values.  

---

### Solution Approach  

The solution involves **backtracking** to explore all possible paths in the binary tree from the root to the leaf nodes.  

---

### Key Points  

1. **Recursive Depth-First Search (DFS)**:  
   - Use a recursive helper function to traverse the tree.  
   - At each node, add its value to the current path.  

2. **Base Case**:  
   - If the current node is `null`, return immediately (end of the path).  
   - If the current node is a leaf node (both left and right children are `null`), add the current path to the result list.  

3. **Path Management**:  
   - Maintain the current path in a dynamic list.  
   - Append node values as the recursion goes deeper.  
   - Use backtracking to remove the last node value after exploring all child nodes, ensuring no residual values interfere with other paths.  

4. **Result Storage**:  
   - Store each root-to-leaf path as a new list in the result list.  
   - Use `new ArrayList<>(currentPath)` to avoid modifying already-stored paths.  

---

### Time and Space Complexity  

- **Time Complexity**: O(n), where `n` is the number of nodes in the binary tree. Each node is visited exactly once.  
- **Space Complexity**: O(h), where `h` is the height of the tree, for the recursion stack and temporary path storage.  

---

For a detailed explanation of the code, visit the [description here](https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=root-to-leaf-paths).
