def linear_search(arr, target):
    """
    Perform a linear search on a list to find the target value.

    Parameters:
    arr (list): The list to search through.
    target: The value to search for.

    Returns:
    int: The index of the target if found, otherwise -1.
    """
    for index, value in enumerate(arr):
        if value == target:
            return index
    return -1


# Get user input for the list
user_input = input("Enter a list of numbers separated by spaces: ")
my_list = [int(x) for x in user_input.split()]

# Get user input for the target value
target_value = int(input("Enter the target value to search for: "))

# Perform the linear search
result = linear_search(my_list, target_value)

# Output the result
if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found in the list")
