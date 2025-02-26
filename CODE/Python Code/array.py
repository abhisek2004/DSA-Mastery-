arr = [0, -1, 2, -3, 1]
x = -2

seen = set()
found = False

for num in arr:
    if (x - num) in seen:
        found = True
        break
    seen.add(num)

print("Yes" if found else "No")
