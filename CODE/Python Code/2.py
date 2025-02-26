# list=[1,2,3,40,5]
# list=list[::-1]
# print(list)
# i=0;j=len(list)-1
# while(i<j):
#     list[i],list[j]=list[j],list[i]
#     i+=1
#     j-=1
#     print(list)


# list = input["Enter the string"]
# i = 0
# j = len(list)-1
# flag = 0
# while (i < j):
#     if (list[i] != list[j]):
#         flag = 1
#         break
#     i += 1
#     j -= 1
# if (flag == 0):
#     print(list+"is pallindrome")
# else:
#     print(list+"is not pallindrome")


list = input().split()
n = int(input("Enter rotation value"))
list = list[len(list)-n:]+list[:len(list)-n]
print(list)
