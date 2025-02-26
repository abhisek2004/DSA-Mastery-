n = "1210"  # Example input
if n is None:
    print(0)
else:
    count = [0] * 10
    for digit in n:
        count[int(digit)] += 1

    is_autobiographical = True
    for i in range(len(n)):
        if count[i] != int(n[i]):
            is_autobiographical = False
            break

    if is_autobiographical:
        distinct_count = len(set(n))
        print(distinct_count)
    else:
        print(0)  