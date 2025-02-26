# 25 Aug 2024
# Accept a no. and check for special No (145=1!+4!+5!)

def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    return fact


def is_special_number(num):
    sum_of_factorials = 0
    for digit in str(num):
        sum_of_factorials += factorial(int(digit))
    return sum_of_factorials == num


number = int(input("Enter a number: "))

if is_special_number(number):
    print(f"{number} is a special number.")
else:
    print(f"{number} is not a special number.")
