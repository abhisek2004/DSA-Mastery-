# You can achieve this in Python using simple string operations:

# ```python
# str_input = "Move#to#front"
# result = "#" * str_input.count("#") + str_input.replace("#", "")
# print(result)
# ```

# # Explanation:
# 1. `str_input.count("#")` counts the number of `  # ` in the string.
# 2. `"#" * count` creates a string with all `  # ` symbols moved to the front.
# # ` symbols from the original string.
# 3. `str_input.replace("#", "")` removes all `
# 4. Concatenating both gives the final result.

# **Output: **
# ```
# # Movetofront
# ```


str_input = "Move#to#front"
result = "#" * str_input.count("#") + str_input.replace("#", "")
print(result)