#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node* next;
};
int main() {
    struct Node* head = (struct Node*)malloc(sizeof(struct Node));
    head->data = 42;
    head->next = NULL;
    struct Node* second = (struct Node*)malloc(sizeof(struct Node));
    second->data = 89;
    second->next = NULL;
    struct Node* third = (struct Node*)malloc(sizeof(struct Node));
    third->data = 102;
    third->next = NULL;
    head->next = second;
    second->next = third;
    third->next = head;
    struct Node* temp = head;
    int count = 0;
    do {
        printf("%d -> ", temp->data);
        temp = temp->next;
        count++;
    } while (temp != head && count < 10);

    printf("%d (head)\n", temp->data);
    free(head);
    free(second);
    free(third);
    return 0;
}