# 25 Aug 2024
# Accept a no and check for to find for next prime and also check for nearest prime
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True


def next_prime(n):
    candidate = n + 1
    while not is_prime(candidate):
        candidate += 1
    return candidate


def nearest_prime(n):
    if n < 2:
        return 2

    lower = n
    while lower > 1 and not is_prime(lower):
        lower -= 1

    upper = n
    while not is_prime(upper):
        upper += 1

    if (n - lower) <= (upper - n):
        return lower
    else:
        return upper


number = int(input("Enter a number: "))

next_prime_number = next_prime(number)
nearest_prime_number = nearest_prime(number)

print(f"The next prime number after {number} is {next_prime_number}.")
print(f"The nearest prime number to {number} is {nearest_prime_number}.")
