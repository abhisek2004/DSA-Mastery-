# 20-07-2024
// Complete implementation of a simple singly linked list in C.
# include <stdio.h>
# include <stdlib.h>

// Define the node structure
struct Node {
    int data
    struct Node * next
}

// Function to create a new node
struct Node * createNode(int data) {
    struct Node * newNode = (struct Node*)malloc(sizeof(struct Node))
    if (!newNode) {
        printf("Memory allocation error\n")
        exit(1)
    }
    newNode -> data = data
    newNode -> next = NULL
    return newNode
}

// Function to insert a node at the beginning of the list
void insertAtBeginning(struct Node ** head, int data) {
    struct Node * newNode = createNode(data)
    newNode -> next = *head
    * head = newNode
}

// Function to insert a node at the end of the list
void insertAtEnd(struct Node ** head, int data) {
    struct Node * newNode = createNode(data)
    if (*head == NULL) {
        *head = newNode
        return
    }
    struct Node * temp = *head
    while (temp -> next != NULL) {
        temp = temp -> next
    }
    temp -> next = newNode
}

// Function to delete a node with a given key
void deleteNode(struct Node ** head, int key) {
    struct Node * temp = *head
    struct Node * prev = NULL

    // If head node itself holds the key
    if (temp != NULL & & temp -> data == key) {
        *head = temp -> next
        free(temp)
        return
    }

    // Search for the key to be deleted
    while (temp != NULL & & temp -> data != key) {
        prev = temp
        temp = temp -> next
    }

    // If key was not present in the list
    if (temp == NULL) {
        printf("Key not found\n")
        return
    }

    // Unlink the node from the linked list
    prev -> next = temp -> next
    free(temp)
}

// Function to display the linked list
void displayList(struct Node * head) {
    struct Node * temp = head
    while (temp != NULL) {
        printf("%d -> ", temp -> data)
        temp = temp -> next
    }
    printf("NULL\n")
}

// Main function to test the linked list implementation
int main() {
    struct Node * head = NULL

    insertAtEnd( & head, 10)
    insertAtEnd( & head, 20)
    insertAtEnd( & head, 30)
    insertAtBeginning( & head, 5)
    displayList(head)

    deleteNode( & head, 20)
    displayList(head)

    return 0
}
```

# Explanation:
- **Node Structure**: Each node contains an integer data and a pointer to the next node.
- **createNode**: Allocates memory for a new node and initializes its data and next pointer.
- **insertAtBeginning**: Inserts a new node at the beginning of the list.
- **insertAtEnd**: Inserts a new node at the end of the list.
- **deleteNode**: Deletes a node with a specified key from the list.
- **displayList**: Prints the elements of the list.



