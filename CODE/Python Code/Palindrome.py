s = "aaabbbb"
count = {}

for char in s:
    count[char] = count.get(char, 0) + 1

odd_count = 0
for value in count.values():
    if value % 2 != 0:
        odd_count += 1

if odd_count <= 1:
    print("YES")
else:
    print("NO")
