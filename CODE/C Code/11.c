// 24-07-2024

// wap  C Program for Node Operations#include <stdio.h>
#include <stdio.h>
#include <stdlib.h>
typedef struct Node {
    int data;
    struct Node* next;
    struct Node* prev;
} Node;
int main() {
    Node *head = NULL, *tail = NULL, *temp;
    int data;
    int values[] = {46, 56, 66, 72};
    for (int i = 0; i < 4; i++) {
        data = values[i];
        Node* newNode = (Node*)malloc(sizeof(Node));
        newNode->data = data;
        newNode->next = NULL;
        newNode->prev = NULL;
        if (head == NULL) {
            head = newNode;
            tail = newNode;
        } else {

            tail->next = newNode;
            newNode->prev = tail;
            tail = newNode;
        }
    }
    printf("Traversing forward: ");
    temp = head;
    while (temp != NULL) {
        printf("%d ", temp->data);
        if (temp->next == NULL) {
            printf("(Tail Node) ");
        }
        temp = temp->next;
    }
    printf("\n");
    printf("Traversing backward: ");
    temp = tail;
    while (temp != NULL) {
        printf("%d ", temp->data);
        if (temp->prev == NULL) {
            printf("(Head Node) ");
        }
        temp = temp->prev;
    }
    printf("\n");
    return 0;
}