# def safe(list, r, c):
#     for i in range(0, c+1):
#         if (list[r][i] != 0):
#             return False
#     for i, j in zip(range(i, -1, -1)), range(j, -1, -1):
#         if (list[i][j] != 0):
#             return False
#     for i, j in zip(range(i, -1, -1)), range(j, 4):
#         if (list[i][j] != 0):
#             return False
#         return True


# def matrix(list, c):
#     if (c > 4):
#         return True
#     for r in range(0, 4):
#         list[r][c] = 1
#         if (safe(list, r, c)) == True:
#             return True
#         if (matrix(list, c + 1) == True):
#             return True
#         list[r][c] = 0
#     return False


# list = [
#     [0, 0, 0, 0],
#     [0, 0, 0, 0],
#     [0, 0, 0, 0],
#     [0, 0, 0, 0],
# ]
# if (matrix(list, 0) == True):  # type: ignore
#     for i in range(0, 4):
#         for j in range(0, 4):
#             print(list[i][j], end=" ")
#         print()
# else:
#     print("No solution")


def safe(matrix, row, col):
    # Check if there is any queen in the same row to the left
    for i in range(col):
        if matrix[row][i] == 1:
            return False

    # Check upper diagonal on left side
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
        if matrix[i][j] == 1:
            return False

    # Check lower diagonal on left side
    for i, j in zip(range(row, 4), range(col, -1, -1)):
        if matrix[i][j] == 1:
            return False

    return True


def solve_queen(matrix, col):
    if col >= 4:
        return True

    for i in range(4):
        if safe(matrix, i, col):
            matrix[i][col] = 1
            if solve_queen(matrix, col + 1):
                return True
            matrix[i][col] = 0

    return False


def print_solution(matrix):
    for i in range(4):
        for j in range(4):
            print(matrix[i][j], end=" ")
        print()


def n_queen():
    matrix = [
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 0, 0, 0]
    ]

    if solve_queen(matrix, 0):
        print_solution(matrix)
    else:
        print("No solution")


n_queen()
