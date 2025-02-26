# class node:
#     def __init__(self, data):
#         self.data = data
#         self.next = None


# class linkedlist:
#     def __init__(self):
#         self.head = None

#     def insert(self, data):
#         newnode = node(data)
#         if (self.head == None):
#             self.head = newnode
#         else:
#             temp = self.head
#             while (temp.next != None):
#                 temp = temp.next
#             temp.next = newnode

#     def insertFront(self, data):
#         newnode = node(data)
#         newnode.next.next = self.head
#         self.head = newnode

#     def deleteFront(self):
#         temp = self.head
#         self.head = temp.next

#     def insertatposition(self, data, pos, temp1):
#         newnode = node(data)
#         temp1 = self.head
#         while (pos > 1):
#             temp1 = temp1.next
#             pos -= 1
#     temp2 = temp1.next
#     temp1.next = temp2
#     newnode.next = temp2

#     def deleteatPosition(self, pos, temp2):
#         temp1 = self.head
#         while (pos > 1):
#             temp1 = temp1.next
#             pos -= 1
#             temp1.next = temp2.next


# ob = linkedlist()


class node:
    def __init__(self, data):
        self.data = data
        self.next = None


class linkedlist:
    def __init__(self):
        self.head = None

    def insert(self, data):
        newnode = node(data)
        if (self.head == None):
            self.head = newnode
        else:
            temp = self.head
            while (temp.next != None):
                temp = temp.next
            temp.next = newnode

    def insertFront(self, data):
        newnode = node(data)
        newnode.next.next = self.head
        self.head = newnode

    def deleteFront(self):
        temp = self.head
        self.head = temp.next

    def insertatposition(self, data, pos):
        newnode = node(data)
        temp1 = self.head
        while (pos > 1):
            temp1 = temp1.next
            pos -= 1
        temp2 = temp1.next
        temp1.next = newnode
        newnode.next = temp2

    def deleteatPosition(self, pos):
        temp1 = self.head
        while (pos > 1):
            temp1 = temp1.next
            pos -= 1
        temp2 = temp1.next
        temp1.next = temp2.next

    def deletelast(self):
        temp1 = self.head
        temp2 = temp1.next
        while (temp2.next != None):
            temp1 = temp1.next
            temp2 = temp2.next
        temp1.next = None
        del temp2


ob = linkedlist()
