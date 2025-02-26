# You can achieve this in Python using a set to check for the required pair efficiently:

# ```python
# arr = [0, 1, 2, -3, 1]
# x = -2

# seen = set()
# found = False

# for num in arr:
#     if (x - num) in seen:
#         found = True
#         break
#     seen.add(num)

# print("Yes" if found else "No")
# ```

# # Explanation:
# 1. Create an empty set `seen` to store visited elements.
# 2. Iterate through the array:
#     - Check if `x - num` is already in `seen`. If yes, a pair exists.
#     - Otherwise, add `num` to `seen`.
# 3. If a pair is found, print `"Yes"`, otherwise print `"No"`.

# **Output for given input: **
# ```
# Yes
# ```
