chocolates, wrappers = input().split()
chocolates = int(chocolates)
wrappers = int(wrappers)

days = chocolates
while chocolates + wrappers >= 7:
    new_chocolates = (chocolates + wrappers) // 7
    wrappers = (chocolates + wrappers) % 7
    chocolates = new_chocolates
    days += chocolates

print(days)
