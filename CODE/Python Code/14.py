# 25 Aug 2024
# Accept a no and check for Disarium No (135=1(1)(3(2))(5(3)))
def is_disarium_number(num):
    num_str = str(num)
    sum_of_powers = 0
    for i in range(len(num_str)):
        digit = int(num_str[i])
        position = i + 1
        sum_of_powers += digit ** position
    return sum_of_powers == num


number = int(input("Enter a number: "))

if is_disarium_number(number):
    print(f"{number} is a Disarium number.")
else:
    print(f"{number} is not a Disarium number.")
