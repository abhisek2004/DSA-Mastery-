# class Node:
#     def __init__(self, data):
#         self.data = data
#         self.left = None
#         self.right = None


# class BinarySearchTree:
#     def insert(self, root, data):
#         if (root == None):
#             newNode = Node(data)
#             return newNode
#         else:
#             if (data < root.data):
#                 root.left = self.insert(root.left, data)
#                 return root
#             elif (data > root.data):
#                 root.right = self.insert(root.right, data)
#                 return root

#             def min(self, root):
#                 if (root.left == None):
#                     return root.data
#                 return self.min(root.left)

#             def max(self, root):
#                 if (root.left == None):
#                     return root.data
#                 return self.min(root.right)

#             def height(root):
#                 if (root == None):
#                     return c
#                 return 1+self.height(root.left)
#             # while (root.left != (None)):
#             #     root = root.left
#             #     return root.data


# ob = BinarySearchTree()
# root = None
# root = ob.insert(root, 10)
# ob.insert(root, 7)
# ob.insert(root, 5)
# ob.insert(root, 13)
# ob.insert(root, 12)
# print(ob.min(root))
# print(ob.max(root))
# print("In order traversal of the constructed tree")


class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


class BinarySearchTree:
    def insert(self, root, data):
        if root is None:
            newNode = Node(data)
            return newNode
        else:
            if data < root.data:
                root.left = self.insert(root.left, data)
            elif data > root.data:
                root.right = self.insert(root.right, data)
            return root

    def min(self, root):
        if root.left is None:
            return root.data
        return self.min(root.left)

    def max(self, root):
        if root.right is None:
            return root.data
        return self.max(root.right)

    def height(self, root):
        if root is None:
            return -1
        else:
            left_height = self.height(root.left)
            right_height = self.height(root.right)
            return 1 + max(left_height, right_height)


ob = BinarySearchTree()
root = None
root = ob.insert(root, 10)
ob.insert(root, 7)
ob.insert(root, 5)
ob.insert(root, 13)
ob.insert(root, 12)
print(ob.min(root))
print(ob.max(root))
print(ob.height(root))
