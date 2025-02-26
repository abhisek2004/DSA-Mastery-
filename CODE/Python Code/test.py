# an aestro biographycial no is a number n such that the first digit of n represents the count of how many zero are there in N , the second digit represent the count of how many one are there in n and so on . you are given a function , def find auto count(n):
# The function accepting string "n" which is a numberand check whether the no is adn autobiographycial nu or not . if it is and integer is returned, i.e the count of distinct nu in n . if not it return 0.
# assumption the input string will not be longer than 10 characters
# input string will consist of numeric characters
# if string is none return 0 .
# example - n= 1210
# output 3 write in very simplae and easy pythone code very small without using function

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
