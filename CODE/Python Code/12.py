# 25 Aug 2024
# wap to check Palliprime check both prime & palindrome or not user into function .

def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True


def is_palindrome(num):
    return str(num) == str(num)[::-1]


def is_palliprime(num):
    return is_prime(num) and is_palindrome(num)


number = int(input("Enter a number: "))
if is_palliprime(number):
    print(f"{number} is a Palliprime.")
else:
    print(f"{number} is not a Palliprime.")
