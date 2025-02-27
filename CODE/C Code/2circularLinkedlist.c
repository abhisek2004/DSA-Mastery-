#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;
};
struct Node *createNode()
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    printf("Enter the data: ");
    scanf("%d", &newNode->data);
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

int main()
{
    struct Node *head = NULL;
    struct Node *tail = NULL;
    struct Node *a = NULL;
    struct Node *b = NULL;
    struct Node *c = NULL;
    a = createNode();
    b = createNode();
    c = createNode();
    head = a;
    a->next = b;
    b->next = c;
    b->prev = a;
    c->prev = b;
    c->next = a;
    a->prev = c;
    tail = c;
    struct Node *temp = head;
    while (temp != tail)
    {
        printf("%d->", temp->data);
        temp = temp->next;
    }
    printf("%d\n", temp->data);
}
