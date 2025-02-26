# How to implement binary search in Python

def binary_search(arr, key):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == key:
            return mid
        elif arr[mid] < key:
            low = mid + 1
        else:
            high = mid - 1

    return -1


# List of elements (sorted for binary search to work)
arr = [5, 9, 17, 23, 25, 45, 59, 63, 71, 89]
key = 9

# Performing binary search
result = binary_search(arr, key)

if result != -1:
    print(f"Element {key} found at index {result}")
else:
    print(f"Element {key} not found in the list")
