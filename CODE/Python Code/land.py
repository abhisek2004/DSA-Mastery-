# flatland is a country with a number of cities
# cities with a number of roads of 1km
# n= 3
# c=[1]
# constraints: 1<=n<=10^5, 1<=c[i]<=10^9

# smaple input 1
# 5 2
# 0 4
# sample output 2
# expalanation 1
# the sample corresponds to the following:graphics
# the distance to the nearest city for each city is listed below:
# 4: 0
# 1: 1
# 2: 2
# 3: 1
# 4: 0
# we then take the maximum of (o,2,1,0)=2



def flatland(n, c):
    c.sort()
    max_distance = max(c[0], n - c[-1] - 1)
    for i in range(1, len(c)):
        max_distance = max(max_distance, (c[i] - c[i - 1]) // 2)
    return max_distance